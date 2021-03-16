package ru.guap.m721.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.guap.m721.model.data.Catalogue;
import ru.guap.m721.model.data.Price;
import ru.guap.m721.model.dto.CatalogueDto;

@Mapper(componentModel = "spring")
public interface CatalogueMapper {

    @Mapping(target= "id", source = "catalogue.id")
    CatalogueDto map(Catalogue catalogue, Price price);

}
