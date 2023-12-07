package praticajava05;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			System.out.println("Código do Produto: ");
			int codigo = leia.nextInt();

			System.out.println("Quantidade: ");
			int quantidade = leia.nextInt();

			double precoUnitario = 0;
			String nomeProduto = "";

			switch (codigo) {
			    case 1:
			        nomeProduto = "Cachorro Quente";
			        precoUnitario = 10.00;
			        break;
			    case 2:
			        nomeProduto = "X-Salada";
			        precoUnitario = 15.00;
			        break;
			    case 3:
			        nomeProduto = "X-Bacon";
			        precoUnitario = 18.00;
			        break;
			    case 4:
			        nomeProduto = "Bauru";
			        precoUnitario = 12.00;
			        break;
			    case 5:
			        nomeProduto = "Refrigerante";
			        precoUnitario = 8.00;
			        break;
			    case 6:
			        nomeProduto = "Suco de laranja";
			        precoUnitario = 13.00;
			        break;
			}

			double valorTotal = quantidade * precoUnitario;

			System.out.println("Produto: " + nomeProduto);
			System.out.println("Valor total: R$ " + valorTotal);
		}
	}

}
