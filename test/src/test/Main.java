package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variablen
		double wertX = 0;
		double wertY = 0;
		double wertZ = 0;
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Ein Ausgabe 
		System.out.println("Bitte Zahl eingeben!");
		wertX = input.nextDouble();
		System.out.println("Bitte Zahl eingeben!");
		wertY = input.nextDouble();
		System.out.println("Bitte Zahl eingeben!");
		wertZ = input.nextDouble();
		
		
		//Abfragen
		
				//Teilaufgabe a
				if(wertX == wertZ){
					if(wertY == wertZ){
						System.out.println("Alle drei Werte sind gleich!");
					}
				}
				
				//Teilaufgabe b
				if(wertX != wertZ){
					if(wertY != wertZ){
						if(wertX != wertY){
							System.out.println("Alle drei Werte sind ungleich!");
						}

					}
				}
				
				//Teilaufgabe c	
				if(wertX == wertY){
							System.out.println("Mindestens zwei Werte sind gleich");
				}
				else{
					if(wertX == wertZ){
							System.out.println("Mindestens zwei Werte sind gleich");			
					} 
					else {
						if(wertY == wertZ){
							System.out.println("Mindestens zwei Werte sind gleich");			
						}
					}
				}
		
		        //Teilaufgabe d
				if(wertX < 0){
					if(wertY >=0){
						if(wertZ >= 0 ){
							System.out.print("Ein Wert ist negativ");
						}
					}
				}
				
				if(wertZ < 0){
					if(wertY >=0){
						if(wertX >= 0 ){
							System.out.print("Ein Wert ist negativ");
						}
					}
				}
				
				if(wertY < 0){
					if(wertX >=0){
						if(wertZ >= 0 ){
							System.out.print("Ein Wert ist negativ");
						}
					}
				}
				
				//Teilaufgabe e
				if(wertX > 0){
					if(wertY > 0){
						if(wertZ > 0 ){
							System.out.print("und alle Werte sind positiv");
						}
					}
				}
		//Scanner ende
				input.close();
				
	}

}
