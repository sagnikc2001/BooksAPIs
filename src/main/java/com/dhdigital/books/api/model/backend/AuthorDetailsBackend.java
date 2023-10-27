package com.dhdigital.books.api.model.backend;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@XmlAccessorType(XmlAccessType.FIELD) // specify the access type for fields when marshalling (converting an object to
										// XML) or unmarshalling (converting XML to an object) in the context of XML
										// binding.
@XmlRootElement(name = "author") // Setting the XML root element to author -- <author>....</author>
public class AuthorDetailsBackend {

	@XmlElement // For naming XML Element same as variable -- <name>....</name>
	private String name;

	@XmlElement
	private int yearBorn;

	@XmlElement
	private int numberOfBooks;

	@XmlElement
	private String country;

	@Autowired
	@XmlElement(name = "moreBooks")
	protected List<AuthorBooksBackend> authorBooksBackend;

//	Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearBorn() {
		return yearBorn;
	}

	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<AuthorBooksBackend> getAuthorBooksBackend() {
		return authorBooksBackend;
	}

	public void setAuthorBooksBackend(List<AuthorBooksBackend> authorBooksBackend) {
		this.authorBooksBackend = authorBooksBackend;
	}

//	Default Constructor

	public AuthorDetailsBackend() {
		super();
	}
	
//	Parameterized Constructor

	public AuthorDetailsBackend(String name, int yearBorn, int numberOfBooks, String country,
			List<AuthorBooksBackend> authorBooksBackend) {
		super();
		this.name = name;
		this.yearBorn = yearBorn;
		this.numberOfBooks = numberOfBooks;
		this.country = country;
		this.authorBooksBackend = authorBooksBackend;
	}
	
//	toString

	@Override
	public String toString() {
		return "AuthorDetailsBackend [name=" + name + ", yearBorn=" + yearBorn + ", numberOfBooks=" + numberOfBooks
				+ ", country=" + country + ", authorBooksBackend=" + authorBooksBackend + "]";
	}
}
