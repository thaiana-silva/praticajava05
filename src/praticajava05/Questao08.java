package praticajava05;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			float saldo = (float) 1000.00;

			System.out.println("Operação: ");
			int operacao = leia.nextInt();

			switch (operacao) {
			    case 1:
			        System.out.println("Operação - Saldo");
			        System.out.println("Saldo: R$ " + saldo);
			        break;
			    case 2:
			        System.out.println("Operação - Saque");
			        System.out.println("Valor: ");
			        float valorSaque = leia.nextFloat();
			        if (valorSaque > saldo) {
			            System.out.println("Saldo Insuficiente!");
			        } else {
			            saldo -= valorSaque;
			            System.out.println("Novo Saldo: R$ " + saldo);
			        }
			        break;
			    case 3:
			        System.out.println("Operação - Depósito");
			        System.out.println("Valor: ");
			        float valorDeposito = leia.nextFloat();
			        saldo += valorDeposito;
			        System.out.println("Novo Saldo: R$ " + saldo);
			        break;
			    default:
			        System.out.println("Operação Inválida!");
			        break;
			}
		}
	}

}
