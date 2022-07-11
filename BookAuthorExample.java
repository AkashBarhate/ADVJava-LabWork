package com.example;

import java.util.ArrayList;
import java.util.List;

import com.dao.GenericDao;
import com.entity.Author;
import com.entity.Book1;

public class BookAuthorExample {

	public static void main(String[] args) {
		GenericDao dao= new GenericDao();
	/*	
		Author author = new Author();
		author.setName("Emma");
		author.setEmail("ema@gmail.com");
		dao.save(author);
		
		Author author = new Author();
		author.setName("watson");
		author.setEmail("watt@gmail.com");
		dao.save(author);
	*/	
		Book1 book = new Book1();
		book.setName("Learn Music Step by Step");
		book.setCost(2500);
		List<Book1> list= new ArrayList<Book1>();
		
		
		List<Author> authors = new ArrayList<Author>();
		authors.add((Author) dao.fetchById(Author.class, 5));
		authors.add((Author) dao.fetchById(Author.class, 6));
		
		//author.setBooks(list);
		book.setAuthors(authors);
		
		dao.save(book);
	
	}
}
