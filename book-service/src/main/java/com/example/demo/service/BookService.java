package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public class BookService {
	@Autowired
	private Book book;
	public Book getBookById(int id) {
		book.setBookId(202);
		book.setBookName("java");
		book.setAuthor("kathy siera");
		if(id==1){
			book.setBookId(205);
			book.setBookName("python");
			book.setAuthor("kathy");
			
			
		}
		return this.book;
	}

}
