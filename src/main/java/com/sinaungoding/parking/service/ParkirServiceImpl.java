package com.sinaungoding.parking.service;

import com.sinaungoding.parking.entitas.Parkir;
import com.sinaungoding.parking.repository.ParkirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkirServiceImpl implements ParkirService {

    @Autowired
    private ParkirRepository repository;

    @Override
    public Parkir simpan(Parkir parkir) {
        return repository.save(parkir);
    }

    @Override
    public void delete(String ID) {
        repository.deleteById(ID);
    }

    @Override
    public Parkir findById(String ID) {
        return repository.findById(ID).get();
    }

    @Override
    public Iterable<Parkir> findAll() {
        return repository.findAll();
    }
}
