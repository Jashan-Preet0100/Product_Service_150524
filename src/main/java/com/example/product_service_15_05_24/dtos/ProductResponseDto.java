package com.example.product_service_15_05_24.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDto {
    private long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
