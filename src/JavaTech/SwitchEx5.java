package JavaTech;

import java.util.Scanner;

public class SwitchEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Com base na tabela:
		Escrever algoritmo que leia: código de um produto E a quantidade comprada do item
		Mostre na tela o valor total da conta + o número do produto que foi comprado
		 */
		
		Scanner leia = new Scanner(System.in);
		
		// solicitando código do produto e quantidade comprada
		
		System.out.println("\nInserir código do item (1 a 6): ");
		int codigo = leia.nextInt();
		
		System.out.println("\nInserir quantidade: ");
		int quantidade = leia.nextInt();
		
		// declarando variáveis
		
		String produto = "";
		double total = 0.0;
		
		// switch: seleciona o produto e calcula o valor
		
		switch(codigo) {
		case 1:
			produto = "Cachorro Quente";
			total = 10.00 * quantidade;
			break;
		case 2:
			produto = "X-Salada";
			total = 15.00 * quantidade;
			break;
		case 3:
			produto = "X-Bacon";
			total = 18.00 * quantidade;
			break;
		case 4:
			produto = "Bauru";
			total = 12.00 * quantidade;
			break;
		case 5:
			produto = "Refrigerante";
			total = 8.00 * quantidade;
			break;
		case 6:
			produto = "Suco de laranja";
			total = 13.00 * quantidade;
			break;
		default:
			System.out.println("Insira código válido.");
			
		}
		
		// mostrando o resultado
		System.out.println("\nProduto: " +produto);
		System.out.println("\nValor total: R$ " +total);
		
	}

}
