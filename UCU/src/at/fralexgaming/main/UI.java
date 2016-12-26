package at.fralexgaming.main;

import java.util.Scanner;

import at.fralexgaming.programs.LEDControll;

public class UI {

	public static void main() {

		Scanner input = new Scanner(System.in);

		System.out.println("=========================");
		System.out.print("Choose your program :");
		String program = input.next();

		if (program.equalsIgnoreCase("LEDControll")) {
			LEDControll.main();
		}
		input.close();
	}
}
