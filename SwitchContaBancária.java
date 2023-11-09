package ExerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class SwitchContaBancária {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		int cont;
		
		float saldo,dep,saq;
		
		
		
		
		saldo = 1000;
		
		System.out.println("Opções Bancárias: \n(1)Saldo \n(2)Saque \n(3)Depósito");
		cont = scan.nextInt();
		
		
		
		
		
		switch(cont) {
		case 1:
			System.out.printf("Seu saldo é de R$%.2f",saldo);
			break;
		case 2:
			System.out.println("Valor do saque");
			saq = scan.nextFloat();
			 if(saq>saldo) {
				 System.out.println("Saldo insuficiente!");
			 }else {
				 System.out.printf("Saque concluído! \nSeu saldo atualizado: R$%.2f",saldo-saq);
			 }
			break;
		case 3:
			System.out.println("Quanto quer depositar");
			dep = scan.nextFloat();
			System.out.printf("Seu saldo total agora é R$%.2f",saldo+dep);
			break;
			
		
		}
		
		
		
	}

}
