package JavaTech;

import java.util.Scanner;

public class LacoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resposta;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de elogios");
		System.out.println("\n1 - Pessoal incrível");
		System.out.println("\n2 - Pessoal empolgado");
		System.out.println("\n3 - Pessoal gentil");
		System.out.println("\n4 - Família top de linha");
		System.out.println("\nDigite sua opção: ");
		resposta = ler.nextInt();
			
			switch(resposta) {
			case 1:
				System.out.println("\nPessoal incrível");
				break;
			case 2:
				System.out.println("\nPessoal empolgado");
				break;
			case 3:
				System.out.println("\nPessoal gentil");
				break;
			case 4:
				System.out.println("\nFamília top de linha");
				break;
			default:
				System.out.println("\nOpção inválida!!!");
			}
		
	}

}
