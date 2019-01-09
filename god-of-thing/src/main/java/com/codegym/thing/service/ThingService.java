package com.codegym.thing.service;

import com.codegym.thing.model.Thing;

public interface ThingService {
    Thing findById(Long id);

    void save(Thing thing);

    void remove(Long id);

    Iterable<Thing> findAll();
}
