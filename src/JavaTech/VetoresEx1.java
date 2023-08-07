package JavaTech;

import java.util.Scanner;

public class VetoresEx1 {

	public static void main(String[] args) {
/*

Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá
digitar um número e o programa deve exibir na tela a posição deste número no vetor.
Caso o número não seja encontrado, a mensagem: "Não foi encontrado!" deve ser exibida na tela.
Ex:

ENTRADA
 vetor [2][5][1][3][4][9][7][8][10][6]
 Digite o número que você quer encontrar: 7
 
 SAÍDA
 O número 7 está localizado na posição: 6
 
 ENTRADA
 vetor [2][5][1][3][4][9][7][8][10][6]
 Digite o número que você quer encontrar: 40
 
 SAÍDA
 O número 40 não foi encontrado!

 */
		int numeros [] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int posicao,valor,cont=-1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número que você quer encontrar: ");
		valor = leia.nextInt();
		
		for(posicao=0;posicao<10;posicao++) {
			if (numeros [posicao] == valor) {
				cont = posicao;
				
				System.out.println("O número está na posição: "+posicao);
			}
		}

		if (cont<0)
			System.out.println("O número não foi encontrado!");
		
	}

}
