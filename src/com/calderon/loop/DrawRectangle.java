package com.calderon.loop;

import java.util.Scanner;

public class DrawRectangle {
	
	
	public void init() {
		System.out.println("Te voy a pedi primero numero de filas de columnas");
		Integer numberOfRows = this.getIntegerNumberFromUserKeyboard();
		Integer numberOfCols = this.getIntegerNumberFromUserKeyboard();

		//this.printRectangleAsterisk(numberOfRows , numberOfCols);
		this.printRectangleAsteriskNested(numberOfRows , numberOfCols);
		
		
	}
	
	private void printRectangleAsteriskNested(int numberOfRows , int numberOfCols) {
		for(int i = 1 ; i <= numberOfRows ; i++) {
			for(int j = 1 ; j <= numberOfCols ; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
	} //end of squareAstrik
	private void printRectangleAsterisk(int numberOfRows , int numberOfCols) {
		for(int i = 1 ; i <= numberOfRows ; i++) {
			this.printRowAsterisk(numberOfCols);
		}
		System.out.println();
		
	} //end of squareAstrik
	
	
	
	private void printRowAsterisk(int numberOfCols) {
		for(int i = 1 ; i <= numberOfCols ; i++) {
			
			System.out.print("* ");
		}
		System.out.println();
	} // end of printRowAstrik
	
	
	private Integer getIntegerNumberFromUserKeyboard() {
		Integer numberFromUserKeyboard = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu numero entero");
		numberFromUserKeyboard = scan.nextInt();
		
		//scan.close();
		
		return numberFromUserKeyboard;

	}

}
