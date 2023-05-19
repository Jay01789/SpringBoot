package com.example.TodoApp.Controller;

import com.example.TodoApp.Model.Todo;
import com.example.TodoApp.Service.ITodoService;
import com.example.TodoApp.Service.TodoService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/v1/todo-app")
public  class TodoController {
    @Autowired
    public ITodoService todoService;

    @GetMapping("/find-all")
    public   List<Todo>   findall(){
       return todoService.FindAll();
    }

    @GetMapping("findbyid/id/{id}")
    public  Todo findbyid(@PathVariable int id){
        return todoService.FindById(id);

    }

    @PostMapping("/add-todo")
    public void addtodo(@RequestBody Todo todo){
        todoService.AddTodo(todo);
    }

    @DeleteMapping("delete/id/{id}")
    public void deletetodo(@PathVariable int id){
        todoService.DeleteTodo(id);
    }

    @PutMapping("update/id/{id}")
    public void update(@PathVariable int id , @RequestBody Todo todo   ){
        todoService.UpdateTodo(id,todo);
    }


}
