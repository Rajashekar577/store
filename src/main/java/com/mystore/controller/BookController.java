package com.mystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mystore.entity.Book;
import com.mystore.service.BookService;

import jakarta.annotation.Generated;

@Controller
public class BookController {
	
	
	@Autowired
	private BookService service;
	
	@GetMapping("/book")
	public String home() {
		return "home";
	}
	@GetMapping("/book_register")
		public String bookRegister() {
		return "bookRegister";
			
		}
	 @GetMapping("/available_books")
	 public String getAllBok() {
		 return "bookList";
	 }
	 
	
    		  
	 @PostMapping("/save") 
	 public String addBook(@ModelAttribute Book b) {
		 service.save(b);
	
	return "redirect:/available_books";
	}
	 
	
	 }
     

