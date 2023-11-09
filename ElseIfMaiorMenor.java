package ExerciciosJava;

import java.util.Scanner;

public class ElseIfMaiorMenor {

	public static void main(String[] args) {
		
		int n1,n2,n3,soma;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos descobrir se a soma dos dois primeiros números é maior que o terceiro numero");
		
		System.out.println("\nInforme o primeiro número >");
		n1 = scan.nextInt();
		System.out.println("\nInforme o segundo número >");
		n2 = scan.nextInt();
		System.out.println("\nInforme o terceiro número >");
		n3 = scan.nextInt();
		
		soma = n1 + n2;
		
		if(soma>n3) {
			System.out.println("\nA soma dos dois primeiros números é maior que o terceiro número");
		}else if(soma==n3) {
			System.out.println("\nA soma dos dois primeiros números é igual ao terceiro número");
		}else {
			System.out.println("\nA soma dos dois primeiros números é menor que o terceiro número");
		}
		
		
				
		
		
	}
	
}
