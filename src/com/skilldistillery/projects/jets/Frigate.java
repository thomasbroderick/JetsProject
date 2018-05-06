package com.skilldistillery.projects.jets;

public class Frigate extends Starship implements Battle, Exploration {

	public Frigate(String model, int speed, int range, int price, String pilot) {
		super(model, speed, range, price, pilot);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendAwayTeam() {
		// TODO Auto-generated method stub
		System.out.println("The " + getClass().getSimpleName() + " " +
		this.model + " beams its away team to the surface of an alien world.");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void patrol() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frigate [model=").append(model).append(", speed=").append(speed).append(", range=")
				.append(range).append(" hours, price=").append(price).append(", flightTime=").append(flightTime())
				.append(" hours").append(", pilot=").append(pilot);
		return builder.toString();
	}

}
