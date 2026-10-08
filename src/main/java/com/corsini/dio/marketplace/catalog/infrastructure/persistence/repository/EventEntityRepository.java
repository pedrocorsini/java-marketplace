package com.corsini.dio.marketplace.catalog.infrastructure.persistence.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.corsini.dio.marketplace.catalog.infrastructure.persistence.entity.Event;

@RepositoryRestResource 
public interface EventEntityRepository extends CrudRepository<Event, UUID> {

}
