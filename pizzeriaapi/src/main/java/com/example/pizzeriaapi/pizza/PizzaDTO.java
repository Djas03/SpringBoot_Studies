package com.example.pizzeriaapi.pizza;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaDTO {
    private String name;
    private double price;
    private boolean isAvailable;
    private Flavor flavor;
    private Size size;
}
