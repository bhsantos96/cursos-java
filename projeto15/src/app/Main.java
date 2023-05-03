package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notafinal = nota1 + nota2;
		
		System.out.printf("Nota Final = %.1f%n",notafinal );
		
		if (notafinal < 60.0)
			System.out.println("REPROVADO");
		
		
		
		sc.close();
		
		
		
		
	}

}
