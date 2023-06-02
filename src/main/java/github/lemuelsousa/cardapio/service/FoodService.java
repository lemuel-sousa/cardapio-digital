package github.lemuelsousa.cardapio.service;

import java.util.List;

import github.lemuelsousa.cardapio.DTO.FoodRequestDTO;
import github.lemuelsousa.cardapio.DTO.FoodResponseDTO;

public interface FoodService {

    String delete(Long id);

    FoodResponseDTO register(FoodRequestDTO foodDTO);
    
    List<FoodResponseDTO> findAll();

}
