package com.skilldistillery.projects.jets;

public abstract class Starship {
	public String model;
	public int speed;
	public int range;
	public long price;
	public String pilot;
	
	
	public int flightTime() {
		return range/speed;
	}
	public Starship() {
		
	}
	
	
	public Starship(String model, int speed, int range, long price, String pilot) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.pilot = pilot;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Starship [model=").append(model).append(", speed=").append(speed).append(", range=")
				.append(range).append(", price=").append(price).append(", flightTime=").append(flightTime())
				.append(" hours").append(", pilot=").append(pilot);
		return builder.toString();
	}


	public void fly() {
		System.out.println(toString());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + (int) (price ^ (price >>> 32));
		result = prime * result + range;
		result = prime * result + speed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Starship other = (Starship) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (range != other.range)
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}
	
}
