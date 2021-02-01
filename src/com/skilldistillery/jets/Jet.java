package com.skilldistillery.jets;

public abstract class Jet {
	String model;
	double speed;
	int range;
	long price;
	
	@Override
	public String toString() {
		return "[model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

	public Jet() {}
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
}
