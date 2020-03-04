package com.adginfosys.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adginfosys.library.entiteis.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
