package com.eci.training.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name="reviewer_name")
	String reviewerName;
	@Column(name="reviewer_text")
	String reviewText;
	int rating;
	
	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(String reviewerName, String reviewText, int rating) {
		super();
		this.reviewerName = reviewerName;
		this.reviewText = reviewText;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
