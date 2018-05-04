package com.skilldistillery.projects.jets;

public abstract class Starship {
	public String model;
	public int speed;
	public int range;
	public int price;
	
	public int flightTime() {
		return range/speed;
	}
	
	public Starship(String model, int speed, int range, int price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Starship [model=").append(model).append(", speed=").append(speed).append(", range=")
				.append(range).append(", price=").append(price).append(", flightTime()=").append(flightTime())
				.append("]");
		return builder.toString();
	}


	public void fly() {
		System.out.println(toString());
	}
	
}
