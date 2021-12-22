package com.eci.training.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eci.training.dal.ReviewRepository;
import com.eci.training.domain.Product;
import com.eci.training.domain.Review;

@Component
public class ReviewUI {

	@Autowired
	ReviewRepository reviewDAO;

	/*
	 * public void addReview(Review r) { System.out.println("[[[[[[[[[[[[[[[[[[[" +
	 * reviewDAO.getClass().getName() + "]]]]]]]]]]]]]]]]]]"); reviewDAO.save(r); }
	 */
	public void producWithUI() {
		int i = 1;
		while (i == 1) {
			System.out.println("enter the choice to perform the operaiotn "
					+ "1-> add new data, "
					+ "2-> find review by rating , "
					+ "3-> peek,"
					+ "4-> display");
			Scanner sc = new Scanner(System.in);
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1:
				addReview();
				break;
			case 2:
				findRewviewByRating();
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

	}

	private void findRewviewByRating() {
		System.out.println("enter the rating want to fetch from review : ");
		Scanner sc = new Scanner(System.in);
		int rating = Integer.parseInt(sc.nextLine());
		List<Review> reviewDetails = reviewDAO.findByRating(rating);
		
		System.out.println("all review of rating : "+rating);
		reviewDetails.stream().forEach(r -> {
			System.out.println(r.getId()+"   "+r.getReviewerName()+"   "+r.getReviewText()+"   "+r.getRating());
		});
	}

	public void addReview() {
		Review toBeSaved = new Review();
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a name: ");
		toBeSaved.setReviewerName(kb.nextLine());
		// String name = kb.nextLine();
		System.out.println("Enter price: ");
		toBeSaved.setReviewText(kb.nextLine());
		// String text = kb.nextLine();
		// float price = Float.parseFloat(kb.nextLine());
		System.out.println("Enter rating: ");
		toBeSaved.setRating(Integer.parseInt(kb.nextLine()));
		// int rating = Integer.parseInt(kb.nextLine());

		// Review toBeSaved = new Review(name, text, rating);
		reviewDAO.save(toBeSaved);
		System.out.println("Created Product with Id: " + toBeSaved.getId());
	}
}
