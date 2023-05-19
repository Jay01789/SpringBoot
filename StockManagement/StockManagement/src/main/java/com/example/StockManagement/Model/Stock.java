package com.example.StockManagement.Model;

import com.example.StockManagement.Model.StockType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Stock {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stockId;

    @Column(unique = true)
    private String stockName;

    private Double stockPrice;

    private Integer stockOwnerCount;

    @Enumerated(EnumType.STRING)//only for watching strings in DB.
    private StockType stockType;

    private Double stockMarketCap;

    private LocalDateTime stockBirthTimeStamp;

}