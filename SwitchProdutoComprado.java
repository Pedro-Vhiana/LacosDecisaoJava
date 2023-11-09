package ExerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class SwitchProdutoComprado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nu, mult;
		
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Oque vai querer hoje?");
		System.out.println("\n01 | Cachorro Quente | R$10.00 | \n02 | X-Salada | R$ 15.00 | \n03 | X-Bacon | R$18.00 | \n04 | Bauru | R$12.00 | \n05 | Refrigerante | R$8.00 | \n06 | Suco De Laranja | R$13.00 | ");
		nu = scan.nextInt();
		System.out.println("\n\nQuantas unidades?");
		mult = scan.nextInt();
		
		
		switch(nu) {
		case 1:
			double t1,v1;
			v1 = 10.00;
			t1 = mult * v1;
			System.out.printf("\n\nProduto: Cachorro Quente \n\nValor total: R$%.2f",t1);
			break;
			
		case 2:
			double t2,v2;
			v2 = 15.00;
			t2 = mult * v2;
			System.out.printf("\n\nProduto: X-Salada \n\nValor total: R$%.2f",t2);
			break;
			
		case 3:
			double t3,v3;
			v3 = 18.00;
			t3 = mult * v3;
			System.out.printf("\n\nProduto: X-Bacon \n\nValor total: R$%.2f",t3);
			break;
			
		case 4:
			double t4,v4;
			v4 = 12.00;
			t4 = mult * v4;
			System.out.printf("\n\nProduto: Bauru \n\nValor total: R$%.2f",t4);
			break;
			
		case 5:
			double t5,v5;
			v5 = 8.00;
			t5 = mult * v5;
			System.out.printf("\n\nProduto: Refrigerante \n\nValor total: R$%.2f",t5);
			break;
			
		case 6:
			double t6,v6;
			v6 = 13.00;
			t6 = mult * v6;
			System.out.printf("\n\nProduto: Suco De Laranja \n\nValor total: R$%.2f",t6);
			break;
			
			default:
				System.out.println("Coloque números apenas números");
				
		}
		

	}

}
