package com.example.TodoApp.Service;

import com.example.TodoApp.Model.Todo;

import com.example.TodoApp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



@Service
public class TodoService implements ITodoService {


    private  static List<Todo> todos=new ArrayList<>(); // in memory database



    @Autowired
    TodoRepository todoRepository ;

    @Override
    public List<Todo> FindAll() {

        return todoRepository.findAll() ;
    }
    @Override
    public  Todo FindById(int id) {
        return todoRepository.findById(id).get();
    }
    @Override
    public  void AddTodo( Todo todo){
        todoRepository.save(todo);
    }
    @Override
    public  void DeleteTodo(int id){

        todoRepository.deleteAllById(Collections.singleton(id));

    }
@Override
    public  void UpdateTodo(int id,Todo newtodo){
        Todo todo = FindById(id);
        todo.setId(newtodo.getId());
        todo.setTitle(newtodo.getTitle());
        todo.setStatus(newtodo.getStatus());

    }
}