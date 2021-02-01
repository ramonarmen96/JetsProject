package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private double range;
	private long price;
	
	@Override
	public String toString() {
		return "Model: " + model + ", Speed: " + speed + ", Range: " + range + ", Price: " + price;
	}

	public Jet() {}
	
	public Jet(String model, double speed, double range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	protected double getSpeed() {
		return speed;
	}

	protected void setSpeed(double speed) {
		this.speed = speed;
	}

	protected double getRange() {
		return range;
	}

	protected void setRange(double range) {
		this.range = range;
	}

	protected long getPrice() {
		return price;
	}

	protected void setPrice(long price) {
		this.price = price;
	}
}
