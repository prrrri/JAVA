package JavaTech;

import java.util.Scanner;

public class CondicionalIfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		leia: número inteiro via teclado
		mostre na tela: mensagem indicando se o número é PAR ou ÍMPAR
		+ se o número é POSITIVO ou NEGATIVO
		 */
		
		// Leia: número inteiro via teclado
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = leia.nextInt();
		
		// O número é PAR ou ÍMPAR?
		if(numero%2==0) {
			System.out.print("O número " + numero + " é par");
			}
		else {System.out.print("O número " + numero + " é ímpar");}
		
		// O número é POSITIVO ou NEGATIVO?
		if(numero >= 0) {
			System.out.println(" e positivo.");
		} else {
			System.out.println(" e negativo.");
		}
		

	}

}
