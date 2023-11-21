package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();      //variável criada para fazer a leitura do primeiro valor
		
		         // ↓ Sempre começa com 0,pois precisa de um valor inicial para essa forma de contador
		int soma  = 0;              // → Essa variável soma,é a mesma coisa do contador do curso de algoritmo
		while (x != 0) {           //while = Enquanto | (o que está dentro do parenteses é a condição que será abrangida)
			soma = soma + x;       //Nessa linha de código a variável soma vai receber o valor que ela tinha,mais o valor de x 
			x = sc.nextInt();
		}	
			System.out.println(soma);
			
	sc.close();                    //Quando abrir um scanner ja fazer o → sc.close ← no final para não esquecer	
	}

}
