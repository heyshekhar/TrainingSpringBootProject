package com.eci.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.eci.training.ui.ReviewUI;

@SpringBootApplication
public class MySpringTrainingProjectApplication {

	 public static void main(String[] args) {
	        ApplicationContext springContainer = 
	                SpringApplication.run(MySpringTrainingProjectApplication.class, args);
	      //  ProductConsoleUI ui = springContainer.getBean(ProductConsoleUI.class);
	      //  ui.createProductWithUI();
	        
	        ReviewUI ui = springContainer.getBean(ReviewUI.class);
			
		//	Review sample = new Review("pradeep", "good", 5);
			//ui.addReview(sample);
	       
	        ui.producWithUI();
	        
	        System.exit(0);
	        
	    }

}
