package com.app.emailservicce.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(setterPrefix = "with")
public class OrderDto {
    private String id;
    private String name;;
    private Integer quantity;
    private Double price;
}
