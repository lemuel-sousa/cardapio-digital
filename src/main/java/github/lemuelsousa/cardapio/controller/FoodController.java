package github.lemuelsousa.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import github.lemuelsousa.cardapio.DTO.FoodRequestDTO;
import github.lemuelsousa.cardapio.DTO.FoodResponseDTO;
import github.lemuelsousa.cardapio.service.FoodService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/food")
@Slf4j
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping    
    public void createFood(@RequestBody FoodRequestDTO data){
        foodService.saveFood(data);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FoodResponseDTO> getAll(){

        log.info("Listing All: [{}]", foodService.findAll());
        return foodService.findAll();
    }
}
