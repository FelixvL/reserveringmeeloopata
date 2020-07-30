package com.groen.blauw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.groen.blauw.domein.Reservering;

@Service
@Transactional
public class ReserveringService {
	
	@Autowired
	ReserveringRepository rr;
	
	public void toonAlleReservering() {
		System.out.println("Deze methode werkt in de service");
		rr.findAll();
		rr.save(new Reservering());
		rr.findById(1L);
		for(Reservering r: rr.findAll()) {
			System.out.println("Een record uit de database"+r.getId());
		}
	}
	
	public Iterable<Reservering> enNuNetjes() {
		return rr.findAll();
	}

}
