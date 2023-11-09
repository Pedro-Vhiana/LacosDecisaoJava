package LacosDecisao.Java;

import java.util.Scanner;

public class ElseIfTipoAnimal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String e1,e2,e3;
		
		System.out.println("Vamos descobrir qual animal se encaixa nas suas escolhas");
		System.out.println("\n\nPrimeiro defina se o animal é um: \nVertebrado | Invertebrado");
		e1 = scan.next();
		System.out.println("\nAgora de qual tipo ele pertence: \nAve | Mamífero | Inseto | Anelídeo");
		e2 = scan.next();
		System.out.println("\nAgora se é: \nCarnivoro | Herbívoro | Hematófago | Onívoro");
		e3 = scan.next();
		
		
		e2 = scan.next();
		
		if(e1.equalsIgnoreCase("Vertebrado") && e2.equalsIgnoreCase("Ave") && e3.equalsIgnoreCase("Carnivoro")) {
			System.out.println("\n\nO animal que mais combina com a descrição é: Águia");
		}else if(e1.equalsIgnoreCase("Vertebrado") && e2.equalsIgnoreCase("Ave") && e3.equalsIgnoreCase("Onivoro")) {
			System.out.println("\n\nO animal que mais combina com a descrição é: Pomba");
		}else if(e1.equalsIgnoreCase("Vertebrado") && e2.equalsIgnoreCase("Mamifero") && e3.equalsIgnoreCase("Onivoro")) {
			System.out.println("\n\nO animal que mais combina com a descrição é: Homem");
		}else if(e1.equalsIgnoreCase("Vertebrado") && e2.equalsIgnoreCase("Mamifero") && e3.equalsIgnoreCase("Herbivoro")) {
			System.out.println("\n\nO animal que mais combina com a descrição é: Vaca");
		}else if(e1.equalsIgnoreCase("Invertebrado") && e2.equalsIgnoreCase("Inseto") && e3.equalsIgnoreCase("Hematófago")) {
			System.out.println("\n\nO animal que mais combina com a descrição é: Pulga");
		}else if(e1.equalsIgnoreCase("Invertebrado") && e2.equalsIgnoreCase("Inseto") && e3.equalsIgnoreCase("Herbivoro")) {
			System.out.println("\n\nO animal que mais combina com a descrição é: Lagarta");
		}else if(e1.equalsIgnoreCase("Invertebrado") && e2.equalsIgnoreCase("Anelideo") && e3.equalsIgnoreCase("Hematófago")) {
			System.out.println("\n\nO animal que mais combina com a descrição é: Sanguessuga");
		}else if(e1.equalsIgnoreCase("Invertebrado") && e2.equalsIgnoreCase("Anelideo") && e3.equalsIgnoreCase("Onivoro")) {
			System.out.println("\n\nO animal que mais combina com a descrição é: Minhoca");
		}else {
			System.out.println("Combinação inválida!");
		}
		
		
		
		
	}

}
