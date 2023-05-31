package github.lemuelsousa.cardapio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import github.lemuelsousa.cardapio.DTO.FoodRequestDTO;
import github.lemuelsousa.cardapio.DTO.FoodResponseDTO;
import github.lemuelsousa.cardapio.entity.Food;
import github.lemuelsousa.cardapio.repository.FoodRepository;

@Service
public class FoodService {
    
    @Autowired
    private FoodRepository foodRepository;


    public void saveFood(FoodRequestDTO data){
       foodRepository.save(new Food(data));
    }

    public List<FoodResponseDTO> findAll(){
        return foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
    }



}
