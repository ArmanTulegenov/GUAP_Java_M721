package ru.guap.m721.service.catalogue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.guap.m721.exception.CatalogueNotFoundException;
import ru.guap.m721.mapper.CatalogueMapper;
import ru.guap.m721.model.data.Price;
import ru.guap.m721.model.dto.CatalogueDto;
import ru.guap.m721.model.dto.SearchDto;
import ru.guap.m721.repository.CatalogueRepository;
import ru.guap.m721.repository.PriceRepository;

import java.math.BigDecimal;
import java.util.*;

@Service
@RequiredArgsConstructor
public class CatalogueServiceImpl implements CatalogueService {

    private final CatalogueRepository catalogueRepository;
    private final PriceRepository priceRepository;
    private final CatalogueMapper mapper;

    @Override
    public List<CatalogueDto> getCatalogueList(SearchDto searchDto) {
        if (null == searchDto) {
        }

        return new ArrayList<>();
    }

    @Override
    public CatalogueDto getCatalogue(UUID id) {
        Price defaultPrice = Price.builder().price(BigDecimal.ZERO).vat(BigDecimal.ZERO).build();
        Price lastPrice = priceRepository.findTopByCatalogueIdOrderByVersionDesc(id).orElse(defaultPrice);
        return mapper.map(catalogueRepository.findById(id).orElseThrow(() -> new CatalogueNotFoundException()), lastPrice);
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
