package com.codegym.thing.repository;

import com.codegym.thing.model.Thing;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ThingRepository extends PagingAndSortingRepository<Thing, Long> {
}
