package github.lemuelsousa.cardapio.service;

import java.util.List;

import github.lemuelsousa.cardapio.DTO.FoodRequestDTO;
import github.lemuelsousa.cardapio.DTO.FoodResponseDTO;

public interface FoodService {
    
    List<FoodResponseDTO> findAll();

    FoodResponseDTO register(FoodRequestDTO foodDTO);

}
