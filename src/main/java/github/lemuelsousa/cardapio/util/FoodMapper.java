package github.lemuelsousa.cardapio.util;

import java.util.List;

import org.springframework.stereotype.Component;

import github.lemuelsousa.cardapio.DTO.FoodRequestDTO;
import github.lemuelsousa.cardapio.DTO.FoodResponseDTO;
import github.lemuelsousa.cardapio.entity.Food;

@Component
public class FoodMapper {
    

    public FoodResponseDTO toFoodDTO(Food food){
        return new FoodResponseDTO(food);
    }

    public Food toFood(FoodRequestDTO food){
        return Food.builder()
                .title(food.getTitle())
                .image(food.getImage())
                .price(food.getPrice())
                .build();
    }

    public List<FoodResponseDTO> toFoodsDTO(List<Food> foodList){
        return foodList.stream().map(FoodResponseDTO::new).toList();
    }



}
