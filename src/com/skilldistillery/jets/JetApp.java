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
		System.out.println(" ____________________________________");
		System.out.println("|_________________MENU_______________|");
		System.out.println("|1. List fleet                       |");
		System.out.println("|2. Fly all Aircrafts                |");
		System.out.println("|3. View fastest Aircraft            |");
		System.out.println("|4. View Aircraft with longest range |");
		System.out.println("|5. Load all Aircrafts               |");
		System.out.println("|6. Hook Up                          |");
		System.out.println("|7. Add a Aircraft to Fleet          |");
		System.out.println("|8. Remove a Aircraft from Fleet     |");
		System.out.println("|9. Quit                             |");
		System.out.println("|____________________________________|");
		int selection = kb.nextInt();
		switch (selection) {
		case 1:
			af.getList();
		case 2:
			af.flyAll();
		case 3:
			af.viewFastestJet();
		case 4:
			af.viewLongestRange();
		case 5:
			af.loadAllCargo();
		case 6:
			af.combatSim();
		case 7:
//			af.addJet();
		case 8:
			af.removeJet();
		case 9:
			System.exit(selection);
		}
	}

	private void readAircrafts(Airfield af) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] specs = line.split(", ");
				if(line.charAt(1) == 'H') {
					Helo helo = new Helo(specs[0], Double.parseDouble(specs[1]),
							Integer.parseInt(specs[2]), Long.parseLong(specs[3]));
					af.addJet(helo);
					}
				else {
					FixedWing plane = new FixedWing(specs[0], Double.parseDouble(specs[1]),
							Integer.parseInt(specs[2]), Long.parseLong(specs[3]));
					af.addJet(plane);
				}
			}
			System.out.println();
		} catch (IOException e) {
			System.err.println(e);

		}
	}

}
