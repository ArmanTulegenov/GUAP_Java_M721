package ru.guap.m721.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.guap.m721.model.data.Catalogue;

import java.util.List;
import java.util.UUID;

@Repository
public interface CatalogueRepository extends JpaRepository<Catalogue, UUID> {

    List<Catalogue> findByShortNameLike(String shortName);
    List<Catalogue> findByFullNameLike(String fullName);
    List<Catalogue> findBySortNameLikeAndFullNameLike(String shortName, String fullName);
}
