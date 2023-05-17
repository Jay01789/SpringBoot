package com.example.MappingPractice.Controller;

import com.example.MappingPractice.Model.Book;
import com.example.MappingPractice.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(value = "/save")
    public void saveBook(@RequestBody Book book){
        bookService.save(book);
    }


    @GetMapping(value = "/getall")
    public List<Book> getAll(){
    return bookService.getAll();
    }

    @PutMapping(value = "update/{id}")
    public void updateById(@PathVariable Integer id, @RequestBody Book book){
        bookService.update(id,book);
    }

    @DeleteMapping(value = "delete/{id}")
    public void delete(@PathVariable Integer id){
        bookService.deleteById(id);
    }
}