package App;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); 
				
		while (x != 2002) {                           //X diferente de 2002
			
			System.out.println("Senha Incorreta");
			x = sc.nextInt();                         //nessa linha o X irá receber um novo valor e o programa não entrará em loop
		}
		
		System.out.println("Acesso permitido");	
	sc.close();	
	}

}
