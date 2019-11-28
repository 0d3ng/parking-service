package com.sinaungoding.parking.repository;

import com.sinaungoding.parking.entitas.Parkir;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ParkirRepository extends ElasticsearchRepository<Parkir, String> {
}
