package com.example.EcommerceApi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer user_id;
    private String name;
    private String password;
    private String phone_number;

    @OneToOne(cascade = CascadeType.ALL)
    private Address userAddress;
}
