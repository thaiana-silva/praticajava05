package praticajava05;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite o 1º número: ");
			float numero1 = leia.nextFloat();

			System.out.println("Digite o 2º número: ");
			float numero2 = leia.nextFloat();

			System.out.println("Operação: ");
			int operacao = leia.nextInt();

			float resultado = 0;

			switch (operacao) {
			    case 1:
			        resultado = numero1 + numero2;
			        System.out.println(numero1 + " + " + numero2 + " = " + resultado);
			        break;
			    case 2:
			        resultado = numero1 - numero2;
			        System.out.println(numero1 + " - " + numero2 + " = " + resultado);
			        break;
			    case 3:
			        resultado = numero1 * numero2;
			        System.out.println(numero1 + " * " + numero2 + " = " + resultado);
			        break;
			    case 4:
			        if (numero2 != 0) {
			            resultado = numero1 / numero2;
			            System.out.println(numero1 + " / " + numero2 + " = " + resultado);
			        } else {
			            System.out.println("Não é possível dividir por zero!");
			        }
			        break;
			    default:
			        System.out.println("Operação Inválida!");
			        break;
			}
		}

	}

}
