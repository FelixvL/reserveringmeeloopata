package com.groen.blauw.domein;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservering {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	
	LocalDateTime tijdstip;
	String naam;
	int aantalPersonen;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getTijdstip() {
		return tijdstip;
	}
	public void setTijdstip(LocalDateTime tijdstip) {
		this.tijdstip = tijdstip;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getAantalPersonen() {
		return aantalPersonen;
	}
	public void setAantalPersonen(int aantalPersonen) {
		this.aantalPersonen = aantalPersonen;
	}
	
	

}
