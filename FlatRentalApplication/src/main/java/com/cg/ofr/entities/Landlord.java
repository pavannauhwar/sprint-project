package com.cg.ofr.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="landlord")
public class Landlord {
	
	@Id
	private int landlordId;
	private String landlordName;
	private int  landlordAge;
	//private List<Flat> flatList;

	public int getLandlordId() {
		return landlordId;
	}
	public void setLandlordId(int landlordId) {
		this.landlordId = landlordId;
	}
	public String getLandlordName() {
		return landlordName;
	}
	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
	}
	public int getLandlordAge() {
		return landlordAge;
	}
	public void setLandlordAge(int landlordAge) {
		this.landlordAge = landlordAge;
	}
	/*public List<Flat> getFlatList() {
		return flatList;
	}
	public void setFlatList(List<Flat> flatList) {
		this.flatList = flatList;
	}*/
}