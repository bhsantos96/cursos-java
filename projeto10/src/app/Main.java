package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		
		double salario = horas * valor; //horas trabalhadas vezes o valor das horas//
		
		
		
		System.out.println("NUMBER = " + numero );
		System.out.printf("Salary = U$ %.2f%n",salario);
		
		
	
		
		sc.close();

	}

}
