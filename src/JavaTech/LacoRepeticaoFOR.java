package JavaTech;

import java.util.Scanner;

public class LacoRepeticaoFOR {

	public static void main(String[] args) {

	/*
	ENTRADA
	leia: 2 números inteiros via teclado
	o primeiro número deve ser menor que o segundo.
	
	SAÍDA
	mostre na tela todos os números que são múltiplos de 3 e 5
	ex:
	"No intervalo entre 10 e 100:
	15 é múltiplo de 3 e 5 
	30 é múltiplo de 3 e 5
	e por aí vai.
	
	CASO o primeiro número seja maior que o segundo, exiba a mensagem:
	"Intervalo inválido!" e saia do programa
	 */

		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número de intervalo: ");
		int primeiron = leia.nextInt();
		
		System.out.print("\nDigite o último número de intervalo: ");
		int ultimon = leia.nextInt();
		
		if(primeiron >= ultimon) {
			System.out.println("\nIntervalo inválido!");
			return;
		}
		
			System.out.println("\nNo intervalo entre " + primeiron + " e " + ultimon + ":");
			for (int i = primeiron; i <= ultimon; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
		}

	}

}