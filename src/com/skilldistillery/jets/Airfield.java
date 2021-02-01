package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.List;
import com.skilldistillery.jets.FixedWing;
import com.skilldistillery.jets.Helo;

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

	public void removeJet(int acRemove) {
		jets.remove(acRemove);
	}

	public void addJet(Jet jet) {
		jets.add(jet);
	}

	public void Runway() {
		for (Jet jet : jets) {
			if (jet.getClass().getSimpleName().equals("FixedWing")) {
				((FixedWing) jet).enterRunway();
			}
		}
	}

	public void Vertical() {
		for (Jet jet : jets) {
			if (jet.getClass().getSimpleName().equals("Helo")) {
				((Helo) jet).startRotors();
			}
		}
	}

	public void viewLongestRange() {
		Jet farthest = jets.get(0);
		for (Jet jet : jets) {	
			if (farthest.getRange() < jet.getRange()) {
				farthest = jet;
			}
			}
		System.out.println(farthest);
		}

	public void viewFastestJet() {
		Jet fastest = jets.get(0);
		for (Jet jet : jets) {	
			if (fastest.getSpeed() < jet.getSpeed()) {
				fastest = jet;
			}
			}
		System.out.println(fastest);
		}

	public void flyAll() {
		for (Jet jet : jets) {
			double flightTime = jet.getRange() / jet.getSpeed();
			System.out.println(jet + " Flight time: " + flightTime);

		}
	}

}
