package github.lemuelsousa.cardapio.DTO;

import github.lemuelsousa.cardapio.entity.Food;
import lombok.Getter;

@Getter
public class FoodResponseDTO {

    private Long id;
    private String title;
    private String image;
    private Integer price;

    public FoodResponseDTO(Food food){
        this.id = food.getId();
        this.title = food.getTitle();
        this.image = food.getImage();
        this.price = food.getPrice();
    }

}