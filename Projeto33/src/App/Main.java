package App;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     ///// O que foi proposto no exercicio 
	 ///  Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
	 //	 cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
	 //	 menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).	
				
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();   //=>Int<= qual tipo de variável que vai ser ,no caso tipo inteiro
		int y = sc.nextInt();   // X e y = Entrada de dados
		
		while (x != 0 && y != 0) {          //Enquanto x e y forem diferente de zero...
			if (x > 0 && y > 0) {           //x maior do que zero e y maior do que zero
				System.out.println("Primeiro");
			}
			else if (x < 0 && y > 0) {      //x menor do que zero e y maior do que zero
				System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) {      //x menor do que zero e y Menor do que zero
				System.out.println("Terceiro");
			}
				else {                            //Obs : Não esquecer do abre e fecha chaves <=
					System.out.println("Quarto");
				}
				x = sc.nextInt();   // No final de cada execução se ele não atender ao que foi pedido,as variáveis x e y irão receber
				y = sc.nextInt();   // novos valores até que uma das duas coordenadas seja Nula para que o algoritmo seja encerrado!
			}
		sc.close();               //Atenção para não esquecer de fechar o scanner no final do código
		}
	}


