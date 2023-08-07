package JavaTech;

import java.util.Scanner;

public class MatrizEx3 {

	public static void main(String[] args) {

// exercício 3
		
		int [][] numeros = new int [3][3];
		int l,c,somaDPrincipal=0,somaDSecundaria=0;
		String elementosDPrincipal="",elementosDSecundaria="";//dentro das aspas significa VAZIO
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {//encadeamento de laço de repetição, esses for
				System.out.printf("\nDigite um número na posição [%d][%d]: ",l,c);//%d puxa o inteiro
				numeros[l][c] = leia.nextInt();//chamou o scanner pra ler os valores de cada posição
				
				if(l == c) {//para saber os elementos da coluna principal(linha e coluna são iguais na diagonal principal)
				elementosDPrincipal += numeros[l][c] + " ";//vai colocar um número do lado do outro, não somar
				somaDPrincipal += numeros[l][c];//aí vai somar
			}
				
				if(l+c == 2) {//para saber os elementos da diagonal secundária (somando linha+c sempre vai dar 2)
					elementosDSecundaria += numeros[l][c]+" ";
					somaDSecundaria += numeros[l][c];
				}
		}
		
	}
		
		System.out.println("\nElementos da diagonal principal: "+elementosDPrincipal);
		System.out.println("\nElementos da diagonal secundária: "+elementosDSecundaria);
		System.out.println("\nSomatória dos elementos da diagonal principal: "+somaDPrincipal);
		System.out.println("\nSomatória dos elementos da diagonal secundária: "+somaDSecundaria);
		
}
}