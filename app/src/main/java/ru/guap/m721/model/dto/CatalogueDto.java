package ru.guap.m721.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
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
