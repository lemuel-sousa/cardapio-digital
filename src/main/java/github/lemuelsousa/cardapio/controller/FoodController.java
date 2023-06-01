package github.lemuelsousa.cardapio.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import github.lemuelsousa.cardapio.DTO.FoodRequestDTO;
import github.lemuelsousa.cardapio.DTO.FoodResponseDTO;
import github.lemuelsousa.cardapio.service.FoodService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/food")
@RequiredArgsConstructor
@Slf4j
public class FoodController {

    
    private final FoodService foodService;

    @PostMapping    
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<FoodResponseDTO> createFood(@RequestBody FoodRequestDTO dataRequest, UriComponentsBuilder uriBuilder){
        
        FoodResponseDTO foodResponseDTO = foodService.register(dataRequest);
        URI uri = uriBuilder.path("/food/{id}").buildAndExpand(foodResponseDTO.getId()).toUri();

        log.info("Created new Food: [id: {}, title: {}, image-url: {}, price: ${}] ", 
            foodResponseDTO.getId(),
            foodResponseDTO.getTitle(),
            foodResponseDTO.getImage(),
            foodResponseDTO.getPrice());

        return ResponseEntity.created(uri).body(foodResponseDTO);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<FoodResponseDTO>> findAll() {
        log.info("Listing all foods");
        return ResponseEntity.ok().body(foodService.findAll());
    }
}
