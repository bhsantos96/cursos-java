package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
			
		
		if (A % B == 0 || B % A == 0){     //Para usar o Operador => OU <= ele deve ficar dentro dos parenteses da operação onde ele
		                                      //irá trabalhar, vale o mesmo para utilizar os outros operadores!
			System.out.println("Multiplos");
		}	
		else {
			System.out.println("Nao sao Multiplos");
		}
				
		sc.close();
	}

}
