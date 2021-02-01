package com.skilldistillery.jets;

public class Helo extends Jet {
	public Helo(String model, double speed, double range, long price) {
		super( model,  speed,  range,  price);
	}
	public void startRotors() {
		System.out.println(this.getModel() + "Is preparing for vertical Take off");
	}
}
