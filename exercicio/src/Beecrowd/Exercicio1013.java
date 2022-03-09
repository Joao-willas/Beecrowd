package Beecrowd;
import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. 
Utilize a fórmula: 

A FORMULA TA SITE.

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.
Entrada

O arquivo de entrada contém três valores inteiros.
Saída

Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

public class Exercicio1013 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		
		int maiorAB = (a+b+Math.abs(a-b))/2;
		int maiorC = (maiorAB+c+Math.abs(maiorAB-c))/2;
		
		System.out.println(maiorC+" eh o maior");
	}

}
