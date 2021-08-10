package com.cg.ofr.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flat")
public class Flat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flatId")
	private int flatId;
	private float cost;
	private FlatAddress flatAdress;
	private String availibilty;

	public Flat(int flatId, float cost, FlatAddress flatAdress, String availibilty) {
		super();
		this.flatId = flatId;
		this.cost = cost;
		this.flatAdress = flatAdress;
		this.availibilty = availibilty;
	}

	public int getFlatId() {
		return flatId;
	}

	public void setFlatId(int flatId) {
		this.flatId = flatId;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public FlatAddress getFlatAdress() {
		return flatAdress;
	}

	public void setFlatAdress(FlatAddress flatAdress) {
		this.flatAdress = flatAdress;
	}

	public String getAvailibilty() {
		return availibilty;
	}

	public void setAvailibilty(String avialibilty) {
		this.availibilty = avialibilty;
	}
}