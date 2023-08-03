package JavaTech;

import java.util.Scanner;

import java.util.Scanner;

public class LacoRepeticaoDoWhile {

	public static void main(String[] args) {
		/*
ENTRADA
leia números inteiros via teclado
ATÉ QUE o número 0 seja digitado.

SAÍDA
mostre na tela a soma de todos os números digitados
que SEJAM POSITIVOS.
		 */
		
		int numero = 0, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {System.out.println("Digite um número: ");
		
		numero = leia.nextInt();
			
			if (numero > 0) {
				soma += numero;
			}
		} while (numero != 0);
		
		System.out.printf("A soma dos números positivos é: " +soma);

	}

}
