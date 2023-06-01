package github.lemuelsousa.cardapio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table( name = "foods")
@NoArgsConstructor
@Getter @Setter
public class Food {
    
    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String image;
    private Integer price;

    @Builder
    public Food(String title, String image, Integer price){
        this.title = title;
        this.image = image;
        this.price = price;
    }

}
