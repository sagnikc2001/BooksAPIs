package com.dhdigital.books.api.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@XmlAccessorType(XmlAccessType.FIELD) // specify the access type for fields when marshalling (converting an object to XML) or unmarshalling (converting XML to an object) in the context of XML binding.
@XmlRootElement(name = "BookResponse") // Setting the XML root element to BookResponse -- <BookResponse>....</BookResponse>
public class BookResponseBackend {
	
	@Autowired
	@XmlElement(name="book")
	protected BookResponseDetailsBackend bookResponseDetailsBackend;
	
//	Getters and Setters

	public BookResponseDetailsBackend getBookResponseDetailsBackend() {
		return bookResponseDetailsBackend;
	}

	public void setBookResponseDetailsBackend(BookResponseDetailsBackend bookResponseDetailsBackend) {
		this.bookResponseDetailsBackend = bookResponseDetailsBackend;
	}
	
}
