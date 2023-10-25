package com.dhdigital.books.api.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookRequest {
	
	@Autowired
	@JsonProperty("BookRequest")
	protected BookRequestDetails bookRequestDetails;
	
//	Getters and Setters

	public BookRequestDetails getBookRequestDetails() {
		return bookRequestDetails;
	}

	public void setBookRequestDetails(BookRequestDetails bookRequestDetails) {
		this.bookRequestDetails = bookRequestDetails;
	}
	
	

}
