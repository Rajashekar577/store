package com.mystore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mystore.entity.Book;
import com.mystore.repository.BookRepository;

@Service
public class BookService {
	
	
		private BookRepository brepo;
		
		public void save(Book b) {
			brepo.save(b);
			
		}
		
		
	}


