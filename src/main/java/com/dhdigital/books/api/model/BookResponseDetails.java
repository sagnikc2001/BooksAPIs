package com.dhdigital.books.api.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class BookResponseDetails {

	@JsonProperty("name")
	private String name;

	@JsonProperty("authorName")
	private String authorName;

	@JsonProperty("publisher")
	private String publisher;

	@JsonProperty("price")
	private int price;

	@JsonProperty("genre")
	private String genre;

	@JsonProperty("language")
	private String language;

	@JsonProperty("pages")
	private int pages;

//	Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

//	Default Constructor

	public BookResponseDetails() {
		super();
	}
	
//	Parameterized Constructor

	public BookResponseDetails(String name, String authorName, String publisher, int price, String genre,
			String language, int pages) {
		super();
		this.name = name;
		this.authorName = authorName;
		this.publisher = publisher;
		this.price = price;
		this.genre = genre;
		this.language = language;
		this.pages = pages;
	}
	
//	toString

	@Override
	public String toString() {
		return "BookResponseDetails [name=" + name + ", authorName=" + authorName + ", publisher=" + publisher
				+ ", price=" + price + ", genre=" + genre + ", language=" + language + ", pages=" + pages + "]";
	}
	
	

}