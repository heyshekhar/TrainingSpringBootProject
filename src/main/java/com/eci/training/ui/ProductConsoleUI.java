package com.eci.training.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import com.eci.training.domain.Product;
import com.eci.training.service.ProductService;

@Controller
public class ProductConsoleUI {

	ProductService service;// = new ProductServiceImpl();

	@Value("${greeting.message}") // spring injection language need to read
	private String msg;

	@Autowired
	public void setService(ProductService service) {
		this.service = service;
	}

	public void createProductWithUI() {
		int i = 1;
		while (i == 1) {
			System.out.println("enter the choice to perform the operaiotn 1-> add new data, 2-> pop, 3-> peek, 4-> display");
			Scanner sc = new Scanner(System.in);
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				addElementsOnDB();
				break;
			/*
			 * case 2: pop(); break; case 3: peek; break; case 4: display(); break;
			 */
			default:
				System.out.println("invalid choice");
			}

			System.out.println("Want to continue.. 1 -> yes and any other number for no");
			i = Integer.parseInt(sc.nextLine());
		}

		System.out.println("spring started " + msg);

	}

	private void addElementsOnDB() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = kb.nextLine();
		System.out.println("Enter price: ");
		float price = Float.parseFloat(kb.nextLine());
		System.out.println("Enter qoh: ");
		int qoh = Integer.parseInt(kb.nextLine());

		Product toBeSaved = new Product(name, price, qoh);
		int id = service.createNewProduct(toBeSaved);
		System.out.println("Created Product with Id: " + id);

	}

}
