package JavaTech;

import java.util.Scanner;

/*
TABELA DE OPERADORES LÓGICOS

Lógico E = && 
SE HOUVER UM F, A ENTRADA 3 É F
entrada 1	entrada 2	entrada 3
V			V			V
V			F			F
F			V			F
F			F			F

Lógico OU = || (essas barrinhas significam ou)
SE HOUVER PELO MENOS UM V, A ENTRADA É V
entrada 1	entrada 2	entrada 3
V			V			V
V			F			V
F			V			V
F			F			F

 */

public class OlaMundo { //neste momento estamos iniciando a classe

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String nome = "Priscila Igarashi";
	int idade = 29;
	float altura = (float) 1.49,nota1,nota2,nota3,media;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nNome da participante: "+nome+" que é da família 66...");
	System.out.println("\nIdade da participante: "+idade);
	System.out.println("\nAltura da participante: "+altura+" metro(s)");
	
	System.out.println("\nEntre com a nota1: ");
	nota1 = leia.nextFloat();
	System.out.println("\nEntre com a nota2: ");
	nota2 = leia.nextFloat();
	System.out.println("\nEntre com a nota3: ");
	nota3 = leia.nextFloat();
	
	media = (nota1 + nota2 + nota3) / 3;
	System.out.println("\nMédia aritmética foi de: "+media);
	System.out.printf("\nMédia Aritmética foi de: %.2f",media);
	
	if(media>=7 && media<=10) {
		System.out.println("\nAlune aprovade!!!");
	}
	
	else if(media>=5 && media<7) {
		System.out.println("\nAlune de Exame!!!");
	}
	
	else {
		System.out.println("\nAlune Reprovade!!!");
	}

	}

}
