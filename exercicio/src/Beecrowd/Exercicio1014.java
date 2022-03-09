package Beecrowd;
import java.util.Locale;
import java.util.Scanner;

/*
Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o 
total de combustível gasto (em litros).
Entrada

O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e 
um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.
Saída

Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
*/

public class Exercicio1014 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int x = ler.nextInt();
		double y = ler.nextDouble();
		
		double cal = x/y;
		
		System.out.printf("%.3f km/l%n",cal);
	}

}
