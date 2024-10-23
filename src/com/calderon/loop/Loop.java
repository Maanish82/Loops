package com.calderon.loop;

public class Loop {
	


	public void init() {
		//loopWhile();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		loopDoWhile();
		
	}
	
	
	private void loopDoWhile() {
		// TODO Auto-generated method stub
		
		int numero, anterior;
		
		numero = anterior = 7;
		boolean esPrimo = true;
		
		do {
			anterior--;
			if(numero % 2 == 0) {
				esPrimo = false;
			}
		}while( anterior > 2 && esPrimo);
		
		if(esPrimo) {
			System.out.println("Este numero : " + numero + " es primo");
		}else {
			System.out.println("no es primo");
		}
		
	}


	public void loopWhile() {
		int contador = 10;
		
		while(contador > 0) {
			System.out.println("Dentro del bucle " + contador);
			contador--;
		}
		
		contador = 10;
		System.out.println("El sequiente bucle ");
		
		while( contador-- > 0) {
			System.out.println("Dentro del bucle " + contador);
			
		}
		
		}
}