package com.example.Restaurant.management.service.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Pattern(regexp =  "^(?!.*ADMIN).*" , message = "Cant use the Word Admin")
    private String name;
    private String age;
    @Column(nullable = false)
    private String email;


    public User(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
