package com.example.pizzeriaapi.pizza;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "pizza")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private boolean available;

    @Enumerated(EnumType.STRING)
    private Flavor flavor;

    @Enumerated(EnumType.STRING)
    private Size size;
}
