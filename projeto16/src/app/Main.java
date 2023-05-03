package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int Valor1 = sc.nextInt();
		
	    if (Valor1 < 0) {
	    	System.out.println("NEGATIVO");
	    }	
	    else {
	    	System.out.println("NÃO NEGATIVO");
	    }	
	sc.close();	
	}

}
