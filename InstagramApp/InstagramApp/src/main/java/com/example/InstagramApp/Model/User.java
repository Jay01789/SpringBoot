package com.example.InstagramApp.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private String first_name;
    private String last_name;

    private String useremail;

    private String phoneNumber;

    private String userPassword;


    public User(String first_name, String last_name, String useremail, String phoneNumber, String userPassword) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.useremail = useremail;
        this.phoneNumber = phoneNumber;
        this.userPassword = userPassword;
    }

    @OneToMany(mappedBy = "PostuserId",cascade = CascadeType.ALL)
    private List<Post> post;
}


