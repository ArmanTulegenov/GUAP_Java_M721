package ru.guap.m721.model.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "catalogue")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Catalogue {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    @Column(length = 36, nullable = false, updatable = false)
    private UUID id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "price")
    private Set<Price> priceSet;
    @Column(name = "short_name", nullable = false)
    private String shortName;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "record_status", nullable = false)
    @Enumerated(EnumType.STRING)
    private RecordStatus recordStatus;

}
