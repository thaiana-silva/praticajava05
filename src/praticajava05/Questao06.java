package praticajava05;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			System.out.println("Nome do colaborador: ");
			String nome = leia.nextLine();

			System.out.println("Cargo: ");
			int codigoCargo = leia.nextInt();

			System.out.println("Salário: R$");
			float salario = leia.nextFloat();

			float reajuste = 0;
			String cargo = "";

			switch (codigoCargo) {
			    case 1:
			        cargo = "Gerente";
			        reajuste = (float) 0.1;
			        break;
			    case 2:
			        cargo = "Vendedor";
			        reajuste = (float) 0.07;
			        break;
			    case 3:
			        cargo = "Supervisor";
			        reajuste = (float) 0.09;
			        break;
			    case 4:
			        cargo = "Motorista";
			        reajuste = (float) 0.06;
			        break;
			    case 5:
			        cargo = "Estoquista";
			        reajuste = (float) 0.05;
			        break;
			    case 6:
			        cargo = "Técnico de TI";
			        reajuste = (float) 0.08;
			        break;
			}

			float novoSalario = salario + (reajuste * salario);

			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: R$" + novoSalario);
		}
	}

}
