package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int HoraInicial = sc.nextInt();
		int HoraFinal = sc.nextInt();
		int calculo1 = ((24 - HoraInicial) + HoraFinal);
		int calculo2 = (HoraFinal - HoraInicial); //((24 - HoraFinal) + HoraInicial)
		int calculo3 = 24;
		
		if (HoraFinal < HoraInicial) {
			System.out.println("O jogo durou " + calculo1 + " hora(s)");
		}
		else 
			if (HoraFinal > HoraInicial) {
				System.out.println("O jogo durou " + calculo2 + " hora(s)");
			}
			else {
				System.out.println("O jogo durou " + calculo3 + " hora(s)");
			}
		
	
		sc.close();
	}

}
