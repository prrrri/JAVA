package JavaTech;

import java.util.Scanner;

public class LacoCondicionalIfExercicio {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub UTILIZAR entrada e saída de dados, operadores e condicional IF
		
		int a, b, c, soma;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nDigite o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nDigite o valor de C: ");
		c = leia.nextInt();
		soma = a + b;
		
		if(soma > c) {
			System.out.println("\nA Soma de A + B é Maior do que C.");
		}
		
		else if(soma == c) {
			System.out.println("\nA Soma de A + B é Igual a C.");
		}
		
		else{
			System.out.println("\nA soma de A + B é Menor do que C.");	
		}

	}

}
