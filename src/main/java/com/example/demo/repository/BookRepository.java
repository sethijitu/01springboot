package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modells.BOOK;

public interface BookRepository  extends JpaRepository<BOOK,Long>{
	

}
