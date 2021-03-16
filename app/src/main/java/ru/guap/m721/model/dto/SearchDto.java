package ru.guap.m721.model.dto;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class SearchDto {

    private String shortName;
    private String fullName;
    private String description;
    private BigDecimal priceFrom;
    private BigDecimal priceTo;
}
