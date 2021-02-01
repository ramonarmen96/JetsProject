package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetApp {

	public static void main(String[] args) {
		JetApp ja = new JetApp();
		Airfield af = new Airfield();
		ja.readAircrafts(af);
		ja.menu(af);
//		    arg ^
	}

	private void menu(Airfield af) {
//		      parameter    ^
		Scanner kb = new Scanner(System.in);
		boolean runMenu = true;
		while (runMenu) {
			System.out.println(" _____________________________________");
			System.out.println("|_________________MENU________________|");
			System.out.println("|1. List fleet                        |");
			System.out.println("|2. Fly all Aircrafts                 |");
			System.out.println("|3. View fastest Aircraft             |");
			System.out.println("|4. View Aircraft with longest range  |");
			System.out.println("|5. Runway                            |");
			System.out.println("|6. Vertical                          |");
			System.out.println("|7. Add a Aircraft to Fleet           |");
			System.out.println("|8. Remove a Aircraft from Fleet      |");
			System.out.println("|9. Quit                              |");
			System.out.println("|_____________________________________|");
			int selection = kb.nextInt();
			switch (selection) {
			case 1:
				af.getList();
				break;
			case 2:
				af.flyAll();
				break;
			case 3:					
				af.viewFastestJet();
				break;
			case 4:
				af.viewLongestRange();
				break;
			case 5:
				af.Runway();
				break;
			case 6:
				af.Vertical();
				break;
			case 7:
				System.out.println("Helicopter of Plane?");
				String acUser = kb.next();
				kb.nextLine();
				System.out.println("Enter an aircraft name:");
				String acName = kb.next();
				kb.nextLine();
				System.out.println("Enter a speed:");
				double acSpeed = kb.nextDouble();
				System.out.println("Enter a Range:");
				double acRange = kb.nextDouble();
				System.out.println("Enter a price:");
				long acPrice = kb.nextLong();
				if (acUser.equals("Helicopter") ) {
					Jet userJet = new Helo (acName, acSpeed, acRange, acPrice);
					af.addJet(userJet);
				}
				if (acUser.equals("Plane") ) {
					Jet userJet = new FixedWing (acName, acSpeed, acRange, acPrice);
					af.addJet(userJet);
				}
				break;
			case 8:
				System.out.println("Which Jet would you like to remove?(Starts at 0)");
				af.getList();
				int acRemove = kb.nextInt();
				af.removeJet(acRemove);
				break;
			case 9:
				runMenu = false;
				break;
			}
		}
	}

	private void readAircrafts(Airfield af) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] specs = line.split(", ");
				if (line.charAt(1) == 'H') {
					Helo helo = new Helo(specs[0], Double.parseDouble(specs[1]), Double.parseDouble(specs[2]),
							Long.parseLong(specs[3]));
					af.addJet(helo);
				} else {
					FixedWing plane = new FixedWing(specs[0], Double.parseDouble(specs[1]),
							Double.parseDouble(specs[2]), Long.parseLong(specs[3]));
					af.addJet(plane);
				}
			}
			System.out.println();
		} catch (IOException e) {
			System.err.println(e);

		}
	}

}
