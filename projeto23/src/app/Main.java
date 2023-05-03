package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double porcentagem = (salario - 2000.00);
		double porcentagem8C = (porcentagem - 8);
		// 0 a 2000 = isento         ok
		//2000.01 a 3000.00 = 8%
		//3000.01 a 4500.00 = 18%
		//4500.00 acima     = 28%
		 //Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
		  //salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
		   //de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
		    //duas casas decimais.
		
		if (salario > 0 && salario < 2000.00) {
			System.out.println("Isento");
		}
		else
			if (salario < 2000.00 && salario < 3000.00) {
				System.out.println("R$");
			}
		
		
		/*
		 * 
		 * terminou a implementação
		 * 
		 * */
		
		
		
		
		
		
	}

}
