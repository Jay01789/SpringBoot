package com.example.MappingPractice.Service;

import com.example.MappingPractice.Model.Book;
import com.example.MappingPractice.Model.Student;
import com.example.MappingPractice.Repo.iBookRepo;
import com.example.MappingPractice.Repo.iStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private iBookRepo bookRepo ;

    @Autowired
    private iStudentRepo studentRepo ;


    public void save(Book book) {

        Integer Bstudentid = book.getBook_studentId().getStudentId();
        Student Bstudent = studentRepo.findById(Bstudentid).get()  ;
        book.setBook_studentId(Bstudent);
        bookRepo.save(book);
    }

    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    public void update(Integer id, Book book) {
        Book res =  bookRepo.findById(id).get();
        res.setAuthor(book.getAuthor());
        res.setTitle(book.getTitle());
        res.setPrice(book.getPrice());
        res.setDescription(book.getDescription());
        bookRepo.save(res);
    }

    public void deleteById(Integer id) {
        studentRepo.deleteById(id);
    }
}
