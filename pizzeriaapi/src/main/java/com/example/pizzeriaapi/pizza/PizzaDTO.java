package com.example.pizzeriaapi.pizza;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PizzaDTO {
    private String name;
    private double price;
    private boolean available;
    private Flavor flavor;
    private Size size;
}
