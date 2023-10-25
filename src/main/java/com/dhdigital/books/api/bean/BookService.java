package com.dhdigital.books.api.bean;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Service;
import org.apache.camel.Message;

import com.dhdigital.books.api.model.BookRequest;
import com.dhdigital.books.api.model.BookRequestDetails;
import com.dhdigital.books.api.model.BookResponse;
import com.dhdigital.books.api.model.BookResponseDetails;
import com.dhdigital.books.api.model.backend.BookRequestBackend;
import com.dhdigital.books.api.model.backend.BookRequestDetailsBackend;
import com.dhdigital.books.api.model.backend.BookResponseBackend;
import com.dhdigital.books.api.model.backend.BookResponseDetailsBackend;

@Service("bookService")
public class BookService {
	
	public void setBookRequestBackend(Exchange exchange) throws Exception{
		
		Message oMessage = exchange.getIn(); //Getting Body of Route
		
		BookRequest bookRequest = oMessage.getBody(BookRequest.class); // Getting BookRequest body from Route Body
		
		BookRequestDetails bookRequestDetails = new BookRequestDetails(); // Creating new object for BookRequestDetails
		
		bookRequestDetails = bookRequest.getBookRequestDetails(); // Setting content of newly created BookRequestDetails objects equal to BookRequestDetails we got from Body
		
		BookRequestDetailsBackend bookRequestDetailsBackend = new BookRequestDetailsBackend(); // Creating new object of BookRequestDetailsBackend class
		
		BookRequestBackend bookRequestBackend = new BookRequestBackend(); // Creating new object of BookRequestBackend class
	
//		Setting values from bookRequestDetails frontend object to bookRequestDetailsBackend backend object
		
		bookRequestDetailsBackend.setId(bookRequestDetails.getId());
		bookRequestDetailsBackend.setName(bookRequestDetails.getName());
		
		bookRequestBackend.setBookRequestDetailsBackend(bookRequestDetailsBackend); // Setting bookRequestDetailsBackend backend object to bookRequestBackend backend object
		
		oMessage.setBody(bookRequestBackend); // Setting bookRequestBackend backend object to route body for sending to Backend endpoint
		
	}
	
	public void getBookResponseBackend(Exchange exchange) throws Exception{
		
		Message oMessage = exchange.getIn(); //Getting Body of Route
		
		BookResponseBackend bookResponseBackend = oMessage.getBody(BookResponseBackend.class); // Getting BookResponseBackend body from Route Body
		
		BookResponseDetailsBackend bookResponseDetailsBackend = new BookResponseDetailsBackend(); // Creating new object of BookRequestBackend class
		
		bookResponseDetailsBackend = bookResponseBackend.getBookResponseDetailsBackend(); // Setting content of newly created bookResponseDetailsBackend objects equal to getBookResponseDetailsBackend we got from Body
		
		BookResponseDetails bookResponseDetails = new BookResponseDetails();
		
		BookResponse bookResponse = new BookResponse();
		
//		Setting values from bookResponseDetailsBackend backend object to bookResponseDetails frontend object
		
		bookResponseDetails.setAuthorName(bookResponseDetailsBackend.getAuthorName());
		bookResponseDetails.setGenre(bookResponseDetailsBackend.getBookGenre());
		bookResponseDetails.setLanguage(bookResponseDetailsBackend.getBookLanguage());
		bookResponseDetails.setName(bookResponseDetailsBackend.getBookName());
		bookResponseDetails.setPages(bookResponseDetailsBackend.getBookPages());
		bookResponseDetails.setPrice(bookResponseDetailsBackend.getBookPrice());
		bookResponseDetails.setPublisher(bookResponseDetailsBackend.getPublisherName());
		
		bookResponse.setBookResponseDetails(bookResponseDetails);
		
		oMessage.setBody(bookResponse); // Setting bookResponse in body of route 
	}

	
}
