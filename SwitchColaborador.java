package ExerciciosJava;

import java.util.Locale;
import java.util.Scanner;


public class SwitchColaborador {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		
		int cargo;
		
		float salario;
		
		
		System.out.println("Informe seu nome:");
		nome = scan.next();
		System.out.println("\nInforme o número do seu cargo: \n 1- Gerente \n 2- Vendedor \n 3- Supervisor \n 4- Motorista \n 5- Estoquista \n 6- Técnico de TI");
		cargo = scan.nextInt();
		System.out.println("\nInforme seu salário");
		salario = scan.nextFloat();
		
		
		switch(cargo) {
		case 1:
			
			double novoSalario;
			double reajus;
			reajus = 0.1;
			novoSalario = salario + (reajus * salario);
			System.out.printf("Olá "+nome+" "+"Gerente"+" esse é seu novo salário R$%.2f",novoSalario);
			break;
		case 2:
			double novoSalario2;
			double reajus2;
			reajus2 = 0.07;
			novoSalario2 = salario + (reajus2 * salario);
			System.out.printf("Olá "+nome+" "+"Vendedor"+" esse é seu novo salário R$%.2f",novoSalario2);
			break;
		case 3:
			double novoSalario3;
			double reajus3;
			reajus3 = 0.09;
			novoSalario3 = salario + (reajus3 * salario);
			System.out.printf("Olá "+nome+" "+"Supervisor"+" esse é seu novo salário R$%.2f",novoSalario3);
			break;
		case 4:
			double novoSalario4;
			double reajus4;
			reajus4 = 0.06;
			novoSalario4 = salario + (reajus4 * salario);
			System.out.printf("Olá "+nome+" "+"Motorista"+" esse é seu novo salário R$%.2f",novoSalario4);
			break;
		case 5:
			double novoSalario5;
			double reajus5;
			reajus5 = 0.05;
			novoSalario5 = salario + (reajus5 * salario);
			System.out.printf("Olá "+nome+" "+"Estoquista"+" esse é seu novo salário R$%.2f",novoSalario5);
			break;
		case 6:
			double novoSalario6;
			double reajus6;
			reajus6 = 0.08;
			novoSalario6 = salario + (reajus6 * salario);
			System.out.printf("Olá "+nome+" "+"Técnico de TI"+" esse é seu novo salário R$%.2f",novoSalario6);
			break;
		}
		
	}
	
}
