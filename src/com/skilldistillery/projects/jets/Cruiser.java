package com.skilldistillery.projects.jets;

public class Cruiser extends Starship implements Battle, Command {
	private int shields;
	private int missiles;
	
	
	
	public int getShields() {
		return shields;
	}

	public void setShields(int shields) {
		this.shields = shields;
	}

	public int getMissiles() {
		return missiles;
	}

	public void setMissiles(int missiles) {
		this.missiles = missiles;
	}

	public Cruiser(String model, int speed, int range, int price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void giveOrders() {
		// TODO Auto-generated method stub

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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + missiles;
		result = prime * result + shields;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cruiser other = (Cruiser) obj;
		if (missiles != other.missiles)
			return false;
		if (shields != other.shields)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cruiser [shields=").append(shields).append(", missiles=").append(missiles).append(", model=")
				.append(model).append(", speed=").append(speed).append(", range=").append(range).append(", price=")
				.append(price).append(", flightTime()=").append(flightTime()).append(" hours.]");
		return builder.toString();
	}

}
