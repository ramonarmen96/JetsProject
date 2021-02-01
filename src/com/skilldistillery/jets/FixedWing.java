package com.skilldistillery.jets;

public class FixedWing extends Jet{
	public FixedWing (String model, double speed, double range, long price) {
		super( model,  speed,  range,  price);
	}
	public void enterRunway() {
		System.out.println(this.getModel() + " is entering the Runway");
	}

}
