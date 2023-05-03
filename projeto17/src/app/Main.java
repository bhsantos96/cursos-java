package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		
		if (valor1 % 2 == 0) {                //Para verificar se um número é par tem que declarar dessa forma
		 	System.out.println("PAR");         // => NO JAVA PARA USAR O SINAL DE IGUAL ( = ) TEM QUE SE DECLARAR
		} 	 	                                // DA SEGUINTE MANEIRA ( == ) USA-SE DOIS SINAIS DE IGUAL PARA ESSA OPERAÇÃO !
		else {
			System.out.println("ÍMPAR");        //Se o resto da divisão for igual á 0 (ZERO), entao é Par, senão Ímpar
		}
		sc.close();
	}	
}
