package com.calderon.loop;

public class Loop {
	


	public void init() {
		//loopWhile();
		
		//loopDoWhile();
		loopFor();
		
	}
	
	private void loopFor() {
		int i,j,k;
		
		i=j=k=0;
		
		
		for(i = 0; i < 10; i++) {
			System.out.println("Dentro del bucle 1: " + i);
			
		}
		
		for (int z = 10; z > 0 ; z--) {
			System.out.println("Dentro del bucle 2 " + z);
		}
		
		for(j = 0 , k = 20 ; j < 10 && k > 0; k = k- 2) {
			System.out.println("Dentro del bucle 3 " + j + " , " + k);
		}
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