package com.example.pizzeriaapi.pizza;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/pizza")
@RequiredArgsConstructor
public class PizzaController {

    private final PizzaService pizzaService;

    @PostMapping("/register")
    public void registerPizza(@RequestBody @Valid PizzaDTO dto){
      pizzaService.createPizza(dto);   
    }

    @GetMapping("/all")
    public List<PizzaDTO> getAllPizza(){
        return pizzaService.getAllPizzas();
    }
    
    
}
