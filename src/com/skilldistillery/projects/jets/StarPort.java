package com.skilldistillery.projects.jets;

import java.util.Scanner;

public class StarPort {
	private Starship[] ships;

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
		System.out.println(ships[0]);
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

	public void displayUserMenu() {
		Scanner kb = new Scanner(System.in);
		System.out.println("1. List fleet\n" + "2. Fly all jets\n" + "3. View fastest jet\n"
				+ "4. View jet with longest range\n" + "5. Add a jet to Fleet\n" + "6. Quit");
		String choice = kb.nextLine();
		while (!choice.equals("6")) {
			switch (choice) {
			case "1":
				printAllShips();
				break;
			case "6":
				System.exit(0);
			}
			System.out.println("1. List fleet\n" + "2. Fly all jets\n" + "3. View fastest jet\n"
					+ "4. View jet with longest range\n" + "5. Add a jet to Fleet\n" + "6. Quit");
			choice = kb.nextLine();
		}
	}
}
