package com.dhdigital.books.api.model.backend;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component
@XmlAccessorType(XmlAccessType.FIELD) // specify the access type for fields when marshalling (converting an object to
										// XML) or unmarshalling (converting XML to an object) in the context of XML
										// binding.
@XmlRootElement(name = "link") // Setting the XML root element to link -- <link>....</link>
public class BookBuyBackend {

	@XmlElement
	private String amazonBuyLink;

	@XmlElement
	private String flipkartBuyLink;

//	Getters and Setters

	public String getAmazonBuyLink() {
		return amazonBuyLink;
	}

	public void setAmazonBuyLink(String amazonBuyLink) {
		this.amazonBuyLink = amazonBuyLink;
	}

	public String getFlipkartBuyLink() {
		return flipkartBuyLink;
	}

	public void setFlipkartBuyLink(String flipkartBuyLink) {
		this.flipkartBuyLink = flipkartBuyLink;
	}

//	Default Constructor

	public BookBuyBackend() {
		super();
	}

//	Parameterized Constructor

	public BookBuyBackend(String amazonBuyLink, String flipkartBuyLink) {
		super();
		this.amazonBuyLink = amazonBuyLink;
		this.flipkartBuyLink = flipkartBuyLink;
	}

//	toString

	@Override
	public String toString() {
		return "BookBuy [amazonBuyLink=" + amazonBuyLink + ", flipkartBuyLink=" + flipkartBuyLink + "]";
	}

}
