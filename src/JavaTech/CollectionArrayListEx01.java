package JavaTech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionArrayListEx01 {

	public static void main(String[] args) {
/*

Escreva um programa Java para criar uma Collection ArrayList de objetos
da Classe String. O programa deverá solicitar ao usuário, que ele digite via teclado
5 cores e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
- Mostre na tela todas as cores que foram adicionadas
- Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente

ENTRADA			SAÍDA
				
				listar todas as cores
				azul
				verde
				amarelo
				branco
				laranja
				
azul			ordenar as cores			
verde			amarelo
amarelo			azul
branco			branco
laranja			laranja
				verde

na construção do algoritmo, utilize:
- entrada e saída de dados
- laços de repetição
- collection array list

 */
		
		ArrayList<String> cores = new ArrayList();
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0;i<5;i++) {
			System.out.println("\nDigite uma cor: ");
			String cor = leia.nextLine(); //para pegar string normalmente se usa next line
			cores.add(cor);//adiciona cada cor
		}
		
		//Mostra as cores adicionadas
		System.out.println("\nCores adicionadas: "+cores);
		
		Collections.sort(cores);//ordena o ArrayList em ordem crescente
		System.out.println("\nCores em ordem crescente: ");
		
		for(String cor :cores) {
			System.out.println(cor);//mostra cada cor ordenada
		
		}


	}

}
