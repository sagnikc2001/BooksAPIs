package com.dhdigital.books.api.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookResponse {
	
	@Autowired
	@JsonProperty("BookResponse")
	protected BookResponseDetails bookResponseDetails;
	
//	Getters and Setters

	public BookResponseDetails getBookResponseDetails() {
		return bookResponseDetails;
	}

	public void setBookResponseDetails(BookResponseDetails bookResponseDetails) {
		this.bookResponseDetails = bookResponseDetails;
	}

}
