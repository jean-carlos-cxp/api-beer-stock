package com.digitalinovation.beerstock.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BeerType {

    LAGER(1, "Lager"),
    MALZIBER(2, "Malzbier"),
    WITBIER(3, "Witbier"),
    WEISS(4, "Weiss"),
    ALE(5, "Ale"),
    IPA(6, "IPA"),
    STOUT(7, "Stout");

    private final int cod;
    private final String description;
}
