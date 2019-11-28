package com.sinaungoding.parking.service;

import com.sinaungoding.parking.entitas.Parkir;

public interface ParkirService {
    Parkir simpan(Parkir parkir);

    void delete(String ID);

    Parkir findById(String ID);

    Iterable<Parkir> findAll();

}
