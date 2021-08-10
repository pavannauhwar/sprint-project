package com.cg.ofr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ofr.entities.Flat;
import com.cg.ofr.exception.FlatNotFoundException;

@Repository
public interface IFlatRepository extends JpaRepository <Flat, Integer> {
	public Flat addFlat(Flat flat) ;
	public Flat updateFlat(Flat flat) throws FlatNotFoundException;
	public Flat deleteFlat(Flat flat) throws FlatNotFoundException;
	public Flat viewFlat(int id) throws FlatNotFoundException;
	public List<Flat> viewAllFlat();
	public List<Flat> viewAllFlatByCost(float cost,String availability);
}