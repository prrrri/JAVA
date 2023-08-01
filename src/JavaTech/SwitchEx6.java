package JavaTech;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Com base na tabela:
		Escrever algoritmo que leia: 
		CÓDIGO DO CARGO (inteiro de 1 a 6) 
		+ NOME DO COLABORADOR (String) 
		+ SALÁRIO (número FLOAT)
		
		Mostre na tela:
		o NOME DO COLABORADOR
		+ CARGO
		+ NOVO SALÁRIO
		 */
		
		Scanner leia = new Scanner(System.in);
		
		// solicitando nome do colaborador, código do cargo e salário antes do reajuste
		
		System.out.println("\nNome do colaborador: ");
		String nome = leia.nextLine();
		
  		System.out.println("\nCargo: ");
		int codigo = leia.nextInt();
		
		// Consumindo a quebra de linha pendente
		leia.nextLine();
		
		System.out.println("\nSalário: ");
		float salario = leia.nextFloat();
		
		// declarando variáveis que armazenam cargo e percentual de reajuste
		
		String cargo = "";
		double reajuste = 0.0;  
		
		// switch: seleciona o cargo e o percentual de reajuste
		
		switch(codigo) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.10 * salario;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07 * salario;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09 * salario;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 0.06 * salario;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05 * salario;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08 * salario;
			break;
		default:
			System.out.println("Insira código válido.");
			
		}
		
		//  cálculo do novo salário
		double reajustado = salario + reajuste;
		
		// exibindo 
		System.out.println("\nNome do colaborador: " +nome);
		System.out.println("\nCargo: " +cargo);
		System.out.printf("\nSalário: R$ %.2f%n",reajustado);

	}

}
