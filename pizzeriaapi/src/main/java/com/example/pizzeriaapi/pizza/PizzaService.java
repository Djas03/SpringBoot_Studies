package com.example.pizzeriaapi.pizza;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PizzaService {
    
    private final PizzaRepository pizzaRepository;
    private final ModelMapper modelMapper;

    public PizzaDTO createPizza(PizzaDTO dto){
        Pizza pizza = modelMapper.map(dto, Pizza.class);
        pizzaRepository.save(pizza);

        return modelMapper.map(pizza, PizzaDTO.class);
    }

}
