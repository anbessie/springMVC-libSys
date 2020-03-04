package com.adginfosys.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adginfosys.library.entiteis.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
