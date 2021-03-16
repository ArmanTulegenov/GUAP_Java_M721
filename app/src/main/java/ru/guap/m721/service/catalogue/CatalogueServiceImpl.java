package ru.guap.m721.service.catalogue;

import ru.guap.m721.model.dto.CatalogueDto;
import ru.guap.m721.model.dto.SearchDto;

import java.util.List;
import java.util.UUID;

public class CatalogueServiceImpl implements CatalogueService {
    @Override
    public List<CatalogueDto> getCatalogueList(SearchDto searchDto) {
        return null;
    }

    @Override
    public CatalogueDto getCatalogue(UUID id) {
        return null;
    }

    @Override
    public void updateCatalogue(UUID id, CatalogueDto catalogueDto) {

    }

    @Override
    public void createCatalogue(CatalogueDto catalogueDto) {

    }

    @Override
    public void deleteCatalogue(UUID id) {

    }
}
