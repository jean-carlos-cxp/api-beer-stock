package com.digitalinovation.beerstock.builder;

import com.digitalinovation.beerstock.entities.dto.BeerDTO;
import com.digitalinovation.beerstock.entities.enums.BeerType;
import lombok.Builder;

@Builder
public class BeerDTOBuilder {

    @Builder.Default
    private Long id = 1L;

    @Builder.Default
    private String name = "Brahma";

    @Builder.Default
    private String brand = "Ambev";

    @Builder.Default
    private Integer maxQuantity = 50;

    @Builder.Default
    private Integer quantity = 10;

    @Builder.Default
    private BeerType type = BeerType.LAGER;

    public BeerDTO toBeerDTO() {
        return new BeerDTO(
                id,
                name,
                brand,
                maxQuantity,
                quantity,
                type);
    }
}
