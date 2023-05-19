package com.example.TodoApp.Service;

import com.example.TodoApp.Model.Todo;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ITodoService {
    public  List<Todo> FindAll();

    public  Todo FindById(int id) ;

    public  void AddTodo(@RequestBody Todo todo);

    public  void DeleteTodo(int id) ;

    public  void UpdateTodo(int id, Todo newtodo);
}
