package praticajava05;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite um número: ");
			int numero = leia.nextInt();
			
			if (numero % 2 == 0) {
			    System.out.print("O Número " + numero + " é par");
			} else {
			    System.out.print("O Número " + numero + " é ímpar");
			}
			
			if (numero > 0) {
			    System.out.println(" e positivo!");
			} else if (numero < 0) {
			    System.out.println(" e negativo!");
			} else {
			    System.out.println(" e zero!");
			}
		}
	}

}
