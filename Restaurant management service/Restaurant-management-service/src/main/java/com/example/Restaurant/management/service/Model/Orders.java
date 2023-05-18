package com.example.Restaurant.management.service.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders_tbl")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id ;
    private String status ;

    @ManyToOne
    private User order_user;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Food> order_food;
}
