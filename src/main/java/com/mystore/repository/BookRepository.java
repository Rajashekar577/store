package com.mystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mystore.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book ,Integer>{

}
