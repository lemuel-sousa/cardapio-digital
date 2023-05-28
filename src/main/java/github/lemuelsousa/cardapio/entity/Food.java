package github.lemuelsousa.cardapio.entity;

import github.lemuelsousa.cardapio.DTO.FoodRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity( name = "foods")
@Table( name = "foods")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Food {
    
    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String imageUrl;
    private Integer price;

    public Food( FoodRequestDTO data){
        this.title = data.title();
        this.imageUrl = data.imageUrl();
        this.price = data.price();
    }

}
