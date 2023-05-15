package com.example.InstagramApp.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer token_id;
    private String token;
    private LocalDate tokenCreationDate;

    public AuthenticationToken(User user) {
        this.user = user;
        this.tokenCreationDate = LocalDate.now();
        this.token = UUID.randomUUID().toString();

    }

    @OneToOne
    @JoinColumn(nullable = false,name = "fk_userID")
    private User user;
}
