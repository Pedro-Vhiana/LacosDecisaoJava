package LacosDecisao.Java;

import java.util.Scanner;

public class ElseIfPositivoNegativo {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		
		int numero;		
		
		System.out.println("\t\tVamos descobrir se seu número é positivo, negativo e se é par ou impar >");
		
		System.out.println("\nInforme seu número >");
		numero = scan.nextInt();		
		
		if(numero % 2 == 0 && numero !=0) {
			System.out.println("\nSeu número é par");
		}else if(numero % 2 != 0) {
			System.out.println("\nSeu número é ímpar");
		}else {
			System.out.println("\nEngraçacinho");
		}
		
		if(numero>0) {
			System.out.println("\nSeu número é positivo");
		}else if (numero<0) {
			System.out.println("\nSeu número é negativo");
		}else {
			System.out.println("\nEngraçacinho");
		}
		
		
		
	}

}
