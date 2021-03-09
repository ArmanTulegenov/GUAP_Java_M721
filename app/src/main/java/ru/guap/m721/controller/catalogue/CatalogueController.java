package ru.guap.m721.controller.catalogue;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.guap.m721.mapper.CatalogueMapper;
import ru.guap.m721.model.dto.CatalogueDto;
import ru.guap.m721.repository.CalalogueRepository;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/catalogue")
@RequiredArgsConstructor
public class CatalogueController {

    private final CalalogueRepository calalogueRepository;

    @GetMapping(path = "/{catalogueId}")
    public Optional<CatalogueDto> getCatalogue(@PathVariable("catalogueId") String catalogueId) {
        return calalogueRepository.findById(UUID.fromString(catalogueId)).map(CatalogueMapper::map);
    }

}
