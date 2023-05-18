package com.example.Restaurant.management.service.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "admin_tbl")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;
    private String name;
    private String age;

    @Pattern(regexp = "^.+@admin\\.com$", message = "Invalid admin email format")
    @Column(nullable = false)
    private String email;
}