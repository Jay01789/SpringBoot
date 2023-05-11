package com.example.EcommerceApi.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id ;
    @OneToOne
    private Users Orderusers;

    @OneToOne
    private Product Orderproduct ;

    @OneToOne
    private Address Orderaddress ;

    private Integer productQuantity;
}
