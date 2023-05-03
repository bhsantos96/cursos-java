package app;




import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble(); // Verificar se mudo para padrao americano ou padra brasileiro
		
		double intervalo0 = 0;
		double intervalo1 = 25;
		double intervalo2 = 50;
		double intervalo3 = 75;
		double intervalo4 = 100;
			                     //Poderia ter feito este codigo de forma mais resumida conforme a correção do exercício!
		
		if (valor > intervalo0 && valor < intervalo1 || valor == intervalo1) {          //maior que 0 e menor que 25 ou igual a 25
			System.out.println("Intervalo (0,25]");
		}
		
		else if (valor > intervalo1 && valor < intervalo2 || valor == intervalo2) {     //maior que 25 e menor que 50 ou igual a 50
			System.out.printf("Intervalo (25,50]");
		}
			else 
				if (valor > intervalo2 && valor < intervalo3 || valor == intervalo3) {   //maior que 50 e menor 75 ou igual a 75
 					System.out.printf("Intervalo (50,75]");
				}
				else
					if (valor > intervalo3 && valor == intervalo4 || valor == intervalo4) {   //maior que 75 e menor que 100 ou igual a 100
						System.out.printf("Intervalo (75,100]");
					}
					else {
						System.out.printf("Fora do intervalo");        //acima de 100 ou negativo
				}
		sc.close();
		}
			
	}
