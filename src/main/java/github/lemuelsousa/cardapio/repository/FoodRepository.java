package github.lemuelsousa.cardapio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import github.lemuelsousa.cardapio.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long>{

}
