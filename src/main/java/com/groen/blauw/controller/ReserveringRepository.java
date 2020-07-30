package com.groen.blauw.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.groen.blauw.domein.Reservering;

@Component
public interface ReserveringRepository extends CrudRepository<Reservering, Long>{

}
