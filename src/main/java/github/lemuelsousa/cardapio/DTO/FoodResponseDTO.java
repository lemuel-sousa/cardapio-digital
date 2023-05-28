package github.lemuelsousa.cardapio.DTO;

import github.lemuelsousa.cardapio.entity.Food;

public record FoodResponseDTO( Long id, String title, String imageUrl, Integer price) {

    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImageUrl(), food.getPrice());
    }
}