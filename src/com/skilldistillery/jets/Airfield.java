package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.List;

public class Airfield {
//Need to be able to add and remove Jets in this class
//Need to access Collection of collection of Jets: Jet stats
	private List<Jet> jets = new ArrayList();
	

	public void getList() {
//just needs to print the Array list
		for (Jet jet : jets) {
			System.out.println(jet);			
		}
	}
	public void removeJet() {
		// TODO Auto-generated method stub
		
	}
	
	public void addJet(Jet jet) {
		jets.add(jet);
	}
	
	public void combatSim() {
		// TODO Auto-generated method stub
		
	}
	
	public void loadAllCargo() {
		// TODO Auto-generated method stub
		
	}
	
	public void viewLongestRange() {
		// TODO Auto-generated method stub
		
	}
	
	public void viewFastestJet() {
		// TODO Auto-generated method stub
		
	}
	
	public void flyAll() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
