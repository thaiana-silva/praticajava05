package praticajava05;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite o Nome do doador: ");
	        String nome = leia.nextLine();

	        System.out.println("Digite a Idade do doador: ");
	        int idade = leia.nextInt();

	        System.out.println("Primeira doação de sangue? ");
	        boolean primeiraDoacao = leia.nextBoolean();

	        boolean aptoParaDoar = false;

	        if (idade >= 18 && idade <= 69) {
	            if (idade >= 60 && idade <= 69) {
	                if (!primeiraDoacao) {
	                    aptoParaDoar = true;
	                }
	            } else {
	                aptoParaDoar = true;
	            }
	        }

	        if (aptoParaDoar) {
	            System.out.println(nome + " está apto para doar sangue!");
	        } else {
	            System.out.println(nome + " não está apto para doar sangue!");
	        }
		}
	}

}
