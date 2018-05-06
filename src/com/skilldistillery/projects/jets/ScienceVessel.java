package com.skilldistillery.projects.jets;

public class ScienceVessel extends Starship implements Support {
	private int engineers;
	
	
	
	public void research() {
		//Method stub
	}

	public int getEngineers() {
		return engineers;
	}

	public void setEngineers(int engineers) {
		this.engineers = engineers;
	}

	public ScienceVessel(String model, int speed, int range, int price, String pilot, int engineers) {
		super(model, speed, range, price, pilot);
		this.engineers = engineers;
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rescue() {
		// TODO Auto-generated method stub

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + engineers;
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
		ScienceVessel other = (ScienceVessel) obj;
		if (engineers != other.engineers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ScienceVessel [engineers=").append(engineers).append(", model=").append(model)
				.append(", speed=").append(speed).append(", range=").append(range).append(", price=").append(price)
				.append(", flightTime=").append(flightTime()).append(" hours").append(", pilot=").append(pilot);
		return builder.toString();
	}

}
