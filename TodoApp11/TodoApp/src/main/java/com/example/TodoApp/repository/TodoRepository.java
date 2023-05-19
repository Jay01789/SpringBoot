package com.example.TodoApp.repository;

import com.example.TodoApp.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo ,Integer> {
}
