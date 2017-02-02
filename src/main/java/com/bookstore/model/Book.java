package com.bookstore.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Book {

	private String title;
	private String author;
	private int year;
	private String isbn;
	private Double price;

}
