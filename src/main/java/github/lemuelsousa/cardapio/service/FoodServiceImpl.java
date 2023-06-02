package github.lemuelsousa.cardapio.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import github.lemuelsousa.cardapio.DTO.FoodRequestDTO;
import github.lemuelsousa.cardapio.DTO.FoodResponseDTO;
import github.lemuelsousa.cardapio.entity.Food;
import github.lemuelsousa.cardapio.repository.FoodRepository;
import github.lemuelsousa.cardapio.util.FoodMapper;
import lombok.RequiredArgsConstructor;

@Service
@Primary
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService {

    private final FoodRepository foodRepository;

    private final FoodMapper foodMapper;

    @Override
    public String delete(Long id) {
        foodRepository.deleteById(id);
        return "Successfully food deleted!";
    }

    @Override
    public FoodResponseDTO register(FoodRequestDTO foodDTO) {

        Food newFood = foodMapper.toFood(foodDTO);

        return foodMapper.toFoodDTO(foodRepository.save(newFood));
    }

    @Override
    public List<FoodResponseDTO> findAll() {
        return foodMapper.toFoodsDTO(foodRepository.findAll());
    }

}
