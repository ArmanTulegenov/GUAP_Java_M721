package ru.guap.m721.mapper;

import ru.guap.m721.model.data.Catalogue;
import ru.guap.m721.model.dto.CatalogueDto;

public class CatalogueMapper {

    public static CatalogueDto map(Catalogue catalogue) {
        CatalogueDto catalogueDto = new CatalogueDto();
        catalogueDto.setId(catalogue.getId());
        catalogueDto.setShortName(catalogue.getShortName());
        catalogueDto.setFullName(catalogue.getFullName());
        catalogueDto.setDescription(catalogue.getDescription());
        return catalogueDto;
    }

}
