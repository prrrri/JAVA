package JavaTech;

import java.util.Scanner;

public class LacoRepeticaoWHILE {

	public static void main(String[] args) {
		/*
	Escreva um algoritmo que leia a
	IDADE de int pessoas via teclado
	e
	na
	
	SAÍDA
	mostre o total de pessoas cuja idade seja menor que 21 anos
	e
	mostre o total de pessoas cuja idade seja maior que 50 anos
	
	-- A LEITURA DOS DADOS DEVE SER FINALIZADA AO DIGITAR UMA IDADE NEGATIVA
		 */
		
		int idade,idademenorq21=0,idademaiorq50=0; // inicializando as variáveis com 0 pro Java entender como variável válida
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite uma idade:");
		
		while (true) {
		idade = leia.nextInt();
		
		 if (idade < 0) {
             break; // Finaliza a leitura dos dados se a idade for negativa
         }

         if (idade < 21) {
             idademenorq21++;
         } else if (idade > 50) {
             idademaiorq50++;
         }
			
			System.out.println("Digite outra idade ou uma idade negativa para sair:");
					
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + idademenorq21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + idademaiorq50);
		

	}

}
