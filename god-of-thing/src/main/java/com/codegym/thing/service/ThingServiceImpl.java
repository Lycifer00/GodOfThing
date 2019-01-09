package com.codegym.thing.service;

import com.codegym.thing.model.Thing;
import com.codegym.thing.repository.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ThingServiceImpl implements ThingService {

    @Autowired
    private ThingRepository thingRepository;

    @Override
    public Thing findById(Long id){
        return thingRepository.findOne(id);
    }

    @Override
    public void save(Thing thing){
        thingRepository.save(thing);
    }

    @Override
    public void remove(Long id){
        thingRepository.delete(id);
    }

    @Override
    public Iterable<Thing> findAll() {
        return thingRepository.findAll();
    }

}
