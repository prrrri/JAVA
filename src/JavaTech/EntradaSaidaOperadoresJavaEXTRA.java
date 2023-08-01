package JavaTech;

import java.util.Scanner;

public class EntradaSaidaOperadoresJavaEXTRA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
ENTRADA
LER: SALÁRIO BRUTO
ADICIONAL NOTURNO
HORAS EXTRAS
DESCONTOS
variáveis: float

SAÍDA
EXIBIR NA TELA:
SALÁRIO LÍQUIDO
		 */
		
		// leitura
		Scanner leia = new Scanner(System.in);
		System.out.print("Salário Bruto: ");
		float bruto = leia.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		float adicional = leia.nextFloat();
		
		System.out.print("Horas Extras: ");
		float extras = leia.nextFloat();
		
		System.out.print("Descontos: ");
		float descontos = leia.nextFloat();
		
		// cálculo do salário líquido
		float liquido = bruto + adicional + (extras * 5) - descontos;
				
		// exibindo o resultado
		System.out.println("\nSalário Líquido: R$ " + liquido);
				

	}

}
