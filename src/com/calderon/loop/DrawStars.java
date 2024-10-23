package com.calderon.loop;

import java.util.Scanner;

public class DrawStars {
	
	
	public void init() {
		int number = this.getIntegerNumberFromUserKeyboard();
		System.out.println("El numero es: " + number);
		
		System.out.println("El numero es par: " + this.isEven(number));
		
		System.out.println("El numero es mayor que zero: " + this.isGreaterThanZero(number));
		
		this.printAsterisk(number);
		
	}
	
	private void printAsterisk(int number) {
		for(int i = 1 ; i <= number ; i++) {
			for(int j = 1 ; j <= i ; j++) {
			System.out.println("* ");
			}
			System.out.println();
		}
	}
	

	private Boolean isGreaterThanZero(int number) {
		return (number % 2 == 0) ? true : false;
	}
	
	private Integer getIntegerNumberFromUserKeyboard() {
		Integer numberFromUserKeyboard = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu numero entero");
		numberFromUserKeyboard = scan.nextInt();
		
		scan.close();
		
		return numberFromUserKeyboard;

	}
	
 public Boolean isEven(int number) {
    	 
    	 
    	 return (number % 2 == 0) ? true : false;
    	 
//    	 Boolean isEven = false;
//    	 if(number % 2 == 0) {
//    		 isEven = true;
//    	 }
//    	 
//    	 return isEven;
     }
	
//    int userNumber = 0;
//	Scanner scan = new Scanner(System.in);
//
//	userNumber = scan.nextInt();
//	
//	
//	if(userNumber > 0 && userNumber % 2 == 0) {
//		for(int i = 0; i< userNumber; i++) {
//			System.out.println("*");
//		}
//		
//	}
}
