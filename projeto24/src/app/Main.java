package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	Locale.setDefault(Locale.US);;	
	Scanner sc = new Scanner(System.in);
	
	double salario = sc.nextDouble();
	
	
	double X1 = salario - 2000.00;
	double X2 = salario - 2000.00 - 1000.00;  //sobra 1520        //sobra 2                      18%
	double X3 = salario - 2000.00 - 1000.00 - 1500 ; //sobra 20    // 
	
	
	double Y0 = (8 * X1 / 100);      //Aqui fica o calculo quando ficar so nos 8%
	double Y1 = (8 * (1000.00) / 100);      //Y1 ja esta calculando os possiveis 8% de 1000,quando vai para o resultado vai nos 18%,por isso trabalha isolada
	double Y2 = (18 * (X2-X3) / 100);         //18 sobre os 1500 tirei os 20 do x2 e agora ficou so no x3<=resto dos 20 que tira 28%
	double Y3 = (28 * (X2-1500.00) / 100);   // sobra 20
	double Y4 = (18 * X2 / 100);              //no caso aqui seria o Y2 e o Y2 seria o Y3 e o Y3 o Y4

	if (salario >= 2000.01 && salario <= 3000.00) {
		System.out.printf("R$%.2f%n",Y0);            //Y0 porque so vai calcular os 8% nessa condicao
	}
	else
		if (salario >= 3000.01 && salario <= 4500.00) {
			System.out.printf("R$%.2f%n",(Y1 + Y4));        //Y1 e Y4 porque ao atender essa condicao esta fazendo o calculo dos 8% de 1000(Y1)
		}                                                    // e ta somando com o calculo de Y4 (que separa esses 1000) e calcula o resto
	                                                          // no exemplo em que pede 3002 como valor
		else
			if (salario > 4500.00) {
				System.out.printf("R$%.2f%n",(Y1 + Y2 + Y3));       //Y1 + Y2 + Y3 porque usou a variavel para tirar o maximo dos
				                                                     // 18 que é => 1500 e somar tudo,na condicao anterior ela somava o que 
				                                                      // tava nos 8% e o que estava nos 18%
				// Y1  faz o calculo apenas dos 8% de 1000      
				//Y2 faz a subtracao do que esta na casa dos 28% e deixa apenas os 1500                                |
				//que é o valor maximo que se calcula na casa dos 18% quando a => condição(linha37) <=  atende aos 28% |Ex:4502.00 em que se 
				//Y3 faz a subtracao de X2 (1520 - 1500) que sobra 20 e desses 20 faz o calculo de 28% sobre 20        | se faz essa calculo,
				// Depois disso soma tudo e mostra na tela (Y1+Y2+Y3)                                                  | pois esta abrangendo 
				                                                                     //                                | os 28%
				
			}                                
				else 
					System.out.println("Isento");
			
		sc.close();
		
	}

}
