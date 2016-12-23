package at.fralexgaming.main;

import java.util.Scanner;

import at.fralexgaming.data.Variables;

public class Login {

	public static void main() {
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("UCU is starting please wait...");
		System.out.print("Please enter your UCU ID:");
		String UCUIDread = input.nextLine();
		System.out.println("Reading data...");
		if (UCUIDread.equals(Variables.UCUID)) {
			System.out.println("ID in database");
			System.out.print("Please enter your UCU Key:");
			String UCUKEYread = input.nextLine();
			if (UCUKEYread.equals(Variables.UCUKEY)) {
				Main.loginTrue();
			} else {
				System.out.println("Key not correct system is shuting down");
				Main.loginFalse();
			}
		} else {
			System.out.println("ID not correct system is shuting down");
			Main.loginFalse();
		}

		input.close();

	}
}
