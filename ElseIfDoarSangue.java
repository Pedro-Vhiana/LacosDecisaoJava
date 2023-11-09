package LacosDecisao.Java;

import java.util.Scanner;

public class ElseIfDoarSangue {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		
		int idade;
		
		// Nessa atividade consegui fazer com booelan, mas fica muito estranho para o usuario digitar ''true'' ou ''false'', por esse motivo fiz algo mais interativo.
		// boolean doar;
		
		int doar;
		
		System.out.println("\t\tVamos descobrir se está apto para doar sangue.");
		
		System.out.println("\nInforme seu nome");
		nome = scan.next();
		System.out.println("\nInforme sua idade");
		idade = scan.nextInt();
		System.out.println("\nJá doou sangue alguma vez? \nDigite(1) se sim \nDigite(2) se não");
		doar = scan.nextInt();
		
		
		
		
		if(idade>=18 && idade<=69 && doar == 1) {
			System.out.println(nome+" está apto para doar sangue!");
		}else if(idade>=18 && idade<60){
			System.out.println(nome+" está apto para doar sangue!");
		}else {
			System.out.println(nome+" não está apto para doar sangue");
		}
		
		
				
		
	}

}
