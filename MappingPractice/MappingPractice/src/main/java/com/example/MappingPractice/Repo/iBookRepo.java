package com.example.MappingPractice.Repo;

import com.example.MappingPractice.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iBookRepo extends JpaRepository<Book,Integer> {
}
