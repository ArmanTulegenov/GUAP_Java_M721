package ru.guap.m721.controller.catalogue;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.guap.m721.data.model.Catalogue;
import ru.guap.m721.data.repository.CalalogueRepository;

@RestController
@RequestMapping("/catalogue")
@RequiredArgsConstructor
public class CatalogueController {

    private final CalalogueRepository calalogueRepository;

    @GetMapping
    public String getCatalogue() {
        Catalogue catalogue = new Catalogue();
        catalogue.setShortName("dafsf");
        catalogue.setFullName("asdfasdfasf");
        catalogue.setDescription("sdfasgsgag");
        calalogueRepository.save(catalogue);
        return "easdfasfaw";
    }

}
