package com.example.pizzeriaapi.pizza;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaDTO {

    @NotBlank
    private String name;

    @Positive
    private double price;
    
    private boolean available;
    private Flavor flavor;
    private Size size;
}
