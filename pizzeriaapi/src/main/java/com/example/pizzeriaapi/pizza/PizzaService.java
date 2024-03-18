package com.example.pizzeriaapi.pizza;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PizzaService {

    private final PizzaRepository pizzaRepository;
    private final ModelMapper modelMapper;

    public PizzaDTO createPizza(PizzaDTO dto) {
        Pizza pizza = modelMapper.map(dto, Pizza.class);
        pizzaRepository.save(pizza);

        return modelMapper.map(pizza, PizzaDTO.class);
    }

    public List<PizzaDTO> getAllPizzas() {
        return pizzaRepository.findAll().stream().map(p -> modelMapper.map(p, PizzaDTO.class))
                .collect(Collectors.toList());
    }

}
