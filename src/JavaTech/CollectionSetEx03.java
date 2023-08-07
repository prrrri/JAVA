package JavaTech;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionSetEx03 {

	public static void main(String[] args) {
/*

Escreva um programa Java para criar uma Collection Set de objetos da Classe Wrapper Integer.
O programa deverá solicitar ao usuário que ele digite 10 valores inteiros não repetidos
e adicione-os individualmente na Collection Set. Em seguida,
- Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator.

ENTRADA
SET: 2 / 5 / 1 / 3 / 4 / 9 / 7 / 8 / 10 / 6
SAÍDA, LISTAR DADOS DO SET: 1 / 2 / 3 / 4 / 5 / 6 / 7 / 8 / 9 / 10

ENTRADA
SET: 2 / 5 / 10 / 3 / 4 / 2 / 2 / 3 / 10 / 5
SAÍDA, LISTAR DADOS DO SET: 2 / 3 / 4 / 5 / 10

 */
	
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();//criação da estrutura Set
		
		for(int i = 0; i<10; i++) {
		System.out.println("\nDigite um valor inteiro: ");
		numeros.add(leia.nextInt());
	}
		
		System.out.println("\nListar dados do set: ");
		Iterator<Integer> iterator = numeros.iterator();//converti o hashset para iterator. Iterator não duplica os elementos
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());

}
}
}
