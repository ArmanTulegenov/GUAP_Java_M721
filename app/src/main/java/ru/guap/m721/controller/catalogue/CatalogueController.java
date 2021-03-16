package ru.guap.m721.controller.catalogue;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.guap.m721.model.dto.CatalogueDto;
import ru.guap.m721.model.dto.SearchDto;
import ru.guap.m721.service.catalogue.CatalogueService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/catalogue")
@RequiredArgsConstructor
public class CatalogueController {

    private final CatalogueService catalogueService;

    @GetMapping(path = "/")
    public List<CatalogueDto> getCatalogueList(@Param("shortName") String shortName, @Param("fullName") String fullName) {
        SearchDto searchDto = SearchDto.builder().shortName(shortName).fullName(fullName).build();
        return catalogueService.getCatalogueList(searchDto);
    }

    @GetMapping(path = "/{catalogueId}/")
    public CatalogueDto getCatalogue(@PathVariable("catalogueId") String catalogueId) {
        return catalogueService.getCatalogue(UUID.fromString(catalogueId));
    }




}
