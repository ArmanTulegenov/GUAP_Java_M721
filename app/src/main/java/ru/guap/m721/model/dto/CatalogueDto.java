package ru.guap.m721.model.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Value
@AllArgsConstructor
@Builder
public class CatalogueDto {

    private UUID id;
    private String shortName;
    private String fullName;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;

}
