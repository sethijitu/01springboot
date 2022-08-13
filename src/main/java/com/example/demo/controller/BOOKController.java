package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modells.BOOK;
import com.example.demo.repository.BookRepository;

@RestController
public class BOOKController {

	@Autowired
	BookRepository bookRepository;
	
	@PostMapping("/booksave")
	public String insertBook(BOOK book) {
		bookRepository.save(book);
		return "your record is saved successfully !!";
	
	}
}
