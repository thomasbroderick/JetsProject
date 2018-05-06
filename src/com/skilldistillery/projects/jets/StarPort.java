package com.skilldistillery.projects.jets;

import java.util.Scanner;

public class StarPort {
	private Starship[] ships;
	private int shipCount = 5;
	Scanner kb = new Scanner(System.in);

	public StarPort() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		ships = new Starship[100];
		Cruiser cr1 = new Cruiser("Light Cruiser", 800, 3400, 560000);
		ships[0] = cr1;
		Cruiser cr2 = new Cruiser("Heavy Cruiser", 600, 3200, 660000);
		ships[1] = cr2;
		Frigate fr1 = new Frigate("Scout", 1200, 6000, 700000);
		ships[2] = fr1;
		ScienceVessel sv1 = new ScienceVessel("Tugboat", 440, 5000, 604000, 6);
		ships[3] = sv1;
		StarshipImpl si1 = new StarshipImpl("Enterprise", 1000, 9900, 1000000);
		ships[4] = si1;
		displayUserMenu();

	}

	public void printAllShips() {
		for (int i = 0; i < ships.length; i++) {
			Starship starship = ships[i];
			if (starship != null) {
				System.out.println(starship.toString());

			}
		}
	}
	public void flyAllShips() {
		for (int i = 0; i < ships.length; i++) {
			Starship starship = ships[i];
			if (starship != null) {
				starship.fly();
			}
		}
	}


	public void displayShipChoices() {
		int shipToFly;
		System.out.println("Which ship would you like to fly?");
		for (int i = 0; i < ships.length; i++) {
			Starship starship = ships[i];
			if (starship != null) {
				System.out.println(i + ": " + starship.getClass().getSimpleName() + " " + starship.model);

			}
		}
		shipToFly = kb.nextInt();
		ships[shipToFly].fly();
	}

	public void findFastestShip() {
		int j = 0;
		int max = ships[0].speed;
		for (int i = 0; i < ships.length; i++) {
			Starship starship = ships[i];
			if (starship != null) {
				if (starship.speed > max) {
					max = starship.speed;
					j = i;
				}

			}
		}
		System.out.println(ships[j].toString());
	}

	public void findLongestRange() {
		int j = 0;
		int max = ships[0].range;
		for (int i = 0; i < ships.length; i++) {
			Starship starship = ships[i];
			if (starship != null) {
				if (starship.range > max) {
					max = starship.range;
					j = i;
				}

			}
		}
		System.out.println(ships[j].toString());
	}

	public void sendAwayTeams() {
		for (int i = 0; i < ships.length; i++) {
			Starship starship = ships[i];
			if (starship != null) {
				if (starship instanceof Frigate) {
					((Frigate) starship).sendAwayTeam();
				}

			}
		}
	}

	public StarshipImpl createStarship() {
		StarshipImpl newShip = new StarshipImpl();

		System.out.println("What is the model of the new Starship?");
		newShip.model = kb.nextLine();
		System.out.println("What is the speed of the new Starship in MPH?");
		newShip.speed = kb.nextInt();
		System.out.println("What is the range of the new Starship in miles?");
		newShip.range = kb.nextInt();
		System.out.println("What is the price of the new Starship in Federation Credits?");
		newShip.price = kb.nextLong();

		return newShip;
	}

	public void addNewStarship(StarshipImpl sI) {
		ships[shipCount] = sI;
		shipCount++;
	}
	
	

	public void displayUserMenu() {
		Scanner kb = new Scanner(System.in);
		System.out.println("1. List fleet\n" + "2. Fly all Starships\n" + "3. View fastest Starship\n"
				+ "4. View Starship with longest range\n" + "5. Send Away Teams\n" + "6. Add a new Starship\n"
				+ "7. Fly one Starship\n" + "8. Quit");
		String choice = kb.nextLine();
		while (!choice.equals("8")) {
			switch (choice) {
			case "1":
				printAllShips();
				break;
			case "2":
				flyAllShips();
				break;
			case "3":
				findFastestShip();
				break;
			case "4":
				findLongestRange();
				break;
			case "5":
				sendAwayTeams();
				break;
			case "6":
				addNewStarship(createStarship());
				break;
			case "7":
				displayShipChoices();
			case "8":
				System.exit(0);
			}
			System.out.println("1. List fleet\n" + "2. Fly all Starships\n" + "3. View fastest Starship\n"
					+ "4. View Starship with longest range\n" + "5. Send Away Teams\n" + "6. Add a new Starship\n"
					+ "7. Fly one Starship\n" + "8. Quit");
			choice = kb.nextLine();
		}
	}
}
