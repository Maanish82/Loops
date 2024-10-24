package com.calderon.loop;

import java.util.Scanner;

public class DrawSquare {
	
	
	public void init() {
		Integer number = this.getIntegerNumberFromUserKeyboard();
		this.printSquareAsterisk(number);
		
	}
	
	private void printSquareAsterisk(int number) {
		for(int i = 1 ; i <= number ; i++) {
			this.printRowAsterisk(number);
		}
		
	} //end of squareAstrik
	
	
	
	private void printRowAsterisk(int number) {
		for(int i = 1 ; i <= number ; i++) {
			
			System.out.print("* ");
		}
		System.out.println();
	} // end of printRowAstrik
	
	
	private Integer getIntegerNumberFromUserKeyboard() {
		Integer numberFromUserKeyboard = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu numero entero");
		numberFromUserKeyboard = scan.nextInt();
		
		scan.close();
		
		return numberFromUserKeyboard;

	}

}
