package ExerciciosJava;

import java.util.Scanner;

public class SwitchCalculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float n1,n2,mult,soma,div,sub;
		
		int cont;
		
		System.out.println("Informe o primeiro número ");
		n1 = scan.nextFloat();
		System.out.println("\nInforme o segundo número");
		n2 = scan.nextFloat();
		System.out.println("\nCalculadora \n(1)Multiplicação \n(2)Divisão \n(3)Adição \n(4)Subtração");
		cont = scan.nextInt();
		
		mult = n1 * n2;
		div = n1 / n2;
		soma = n1 + n2;
		sub = n1 - n2;
		
		
		switch(cont){
		case 1:
			 System.out.println("\n\nA múltiplicação deu: "+mult);
			break;
		case 2:
			 System.out.println("\n\nA divisão deu: "+div);
		case 3:
			 System.out.println("\n\nA adição deu: "+soma);
		case 4:
			 System.out.println("\n\nA subtração deu: "+sub);
		default:
			 System.out.println("Operação inválida!");
		}

	}

}
