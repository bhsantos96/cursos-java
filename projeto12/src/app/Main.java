package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double Pi = 3.14159;
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double areaTriangulo = A * C / 2;  //Formula para calcular area do triangulo = Base * altura / por2  //A por base e C por altura
		
		double areaCirculo = Pi * (C * C);  //Formula para calcular a area de um circulo de raio C (esse C é referente ao valor da variavel C) 
		                                // Pi * Raio * Raio //  Raio recebe o valor da variavel C
		
		double areaTrapezio = (A + B) / 2 * C; //Formula para calcular a area de um trapezio => Area = (A+B)/2*h (altura)
		                                       // No exercicio foi pedido a área do trapézio que tem A e B por bases e C por altura
		
		double areaQuadrado = B * B; // Formula para calcular a area de um quadrado é A = b.h
		                              // No exercício foi pedido => a área do quadrado que tem lado B <=
		                               // Quadrado tem todos os lados iguais, entao nesse caso sera aplicado na formula aQ = B * B
		
		double areaRetangulo = A * B ; //a área do retângulo que tem lados A e B A = b*h
                                        //Formula para calcular a area de um Retangulo é A = b * h
		                                 //No exercicio foi pedido a área do retângulo que tem lados A e B
		                                  //No caso poderia tanto fazer o calculo assim => aR = A * B
		                                           //                      quanto assim => aR = B * A pois o resultado sempre será o mesmo! 
		 
		System.out.printf("Triangulo %.3f%n",areaTriangulo);
		System.out.printf("Circulo %.3f%n",areaCirculo);
		System.out.printf("Trapezio %.3f%n",areaTrapezio);
		System.out.printf("Quadrado %.3f%n",areaQuadrado);
		System.out.printf("Retangulo %.3f%n",areaRetangulo);
		
		
	sc.close();	

	}

}
