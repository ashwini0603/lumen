package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.BookService;

@Service
public class BookController {
	@Autowired
	public BookService service;
	@GetMapping(path= "/books")
	public List<BookService> getAllbooks() {
		return this.getAllbooks(); 
	}

}
