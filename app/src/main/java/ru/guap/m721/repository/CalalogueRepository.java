package ru.guap.m721.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.guap.m721.model.data.Catalogue;

import java.util.UUID;

@Repository
public interface CalalogueRepository extends CrudRepository<Catalogue, UUID> {

}
