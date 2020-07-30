package com.groen.blauw.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groen.blauw.domein.Reservering;

@RestController
public class ReserveringEndpoint {
	
	@GetMapping("/probeersel")
	public String probeerverbindingtemaken() {
		System.out.println("hoi ik werk");
		return "hoi <b>fijn</b> dat <i>je</i> <input> er bent";
	}
	@GetMapping("/geefreservering")
	public Reservering probeerverbindingtemaken2() {
		System.out.println("hoi ik werk");
		return new Reservering();
	}

}
