package com.eci.training.dal;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eci.training.domain.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
	
	public List<Review> findByRating(int r);
	
	//public List<Review> findbyRatingGreaterThan(int rating);

	/*
	 * it will find the review based on product id, this is naming convention we
	 * need to takecare while writing
	 */
	//public List<Review> findbProduct_Id(int productId);
	
	
	
//	  @Query("select r from review r where r.rating=:paramRating") 
//	  public List<Review> myComplexMethodQuery(@Param("paramRating")int rating);
	 
//	here method name can be anything its not mandatory 
}
