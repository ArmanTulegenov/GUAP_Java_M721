package ru.guap.m721.service.catalogue;

import ru.guap.m721.model.dto.CatalogueDto;
import ru.guap.m721.model.dto.SearchDto;

import java.util.List;
import java.util.UUID;

public interface CatalogueService {

    List<CatalogueDto> getCatalogueList(SearchDto searchDto);

    CatalogueDto getCatalogue(UUID id);

    void updateCatalogue(UUID id, CatalogueDto catalogueDto);

    void createCatalogue(CatalogueDto catalogueDto);

    void deleteCatalogue(UUID id);

}
