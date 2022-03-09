package Beecrowd;
import java.util.Scanner;
import java.util.Locale; 

public class Exercicio1010 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int numeropeca1 = ler.nextInt();
		int peca2 = ler.nextInt();
		double valor1 = ler.nextDouble();
		
		int numeropec1 = ler.nextInt();
		int pec2 = ler.nextInt();
		double valor2 = ler.nextDouble();
		
		double valorpeca = (peca2*valor1) + (pec2*valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorpeca);
		
	}

}
