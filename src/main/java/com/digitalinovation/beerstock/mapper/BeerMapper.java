package com.digitalinovation.beerstock.mapper;

import com.digitalinovation.beerstock.entities.Beer;
import com.digitalinovation.beerstock.entities.dto.BeerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);
    Beer toModel(BeerDTO beerDTO);
    BeerDTO toDTO(Beer beer);
}
