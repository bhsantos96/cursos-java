package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();

		while (senha != 2002) { //// enquanto X for diferente de 2002

			System.out.println("Senha Inválida");

			senha = sc.nextInt(); //// nessa linha o X irá receber um novo valor e o programa não entrará em loop
		} // atenção quanto a chave separando os trechos de código

		System.out.println("Acesso Permitido");

		sc.close();
	}
}
