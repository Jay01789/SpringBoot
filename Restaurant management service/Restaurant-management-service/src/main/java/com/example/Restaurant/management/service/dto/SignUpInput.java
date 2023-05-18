package com.example.Restaurant.management.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpInput {

    private String userName;
    private String userEmail ;

    private String userage;
}
