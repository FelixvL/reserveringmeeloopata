package com.groen.blauw.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groen.blauw.controller.ReserveringService;
import com.groen.blauw.domein.Reservering;

@RestController
public class ReserveringEndpoint {
	
	@Autowired
	ReserveringService rs;
	//ReserveringService rs = new ReserveringService();  // Verouderd
	
	@GetMapping("/probeersel")
	public void probeerverbindingtemaken() {
		rs.toonAlleReservering();
		System.out.println("hoi ik werk");
	}
	
	@GetMapping("/ennunetjes")
	public Iterable<Reservering> endpointmethode(){
		return rs.enNuNetjes();
	}


}
