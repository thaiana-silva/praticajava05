package praticajava05;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite a primeira característica: ");
			String caracteristica1 = leia.nextLine().toLowerCase();

			System.out.println("Digite a segunda característica: ");
			String caracteristica2 = leia.nextLine().toLowerCase();

			System.out.println("Digite a terceira característica: ");
			String caracteristica3 = leia.nextLine().toLowerCase();

			String animalEscolhido = " ";

			if (caracteristica1.equals("vertebrado")) {
			    if (caracteristica2.equals("ave")) {
			        if (caracteristica3.equals("carnívoro")) {
			            animalEscolhido = "Águia";
			        } else if (caracteristica3.equals("onívoro")) {
			            animalEscolhido = "Pomba";
			        }
			    } else if (caracteristica2.equals("mamífero")) {
			        if (caracteristica3.equals("onívoro")) {
			            animalEscolhido = "Homem";
			        } else if (caracteristica3.equals("herbívoro")) {
			            animalEscolhido = "Vaca";
			        }
			    }
			} else if (caracteristica1.equals("invertebrado")) {
			    if (caracteristica2.equals("inseto")) {
			        if (caracteristica3.equals("hematófago")) {
			            animalEscolhido = "Pulga";
			        } else if (caracteristica3.equals("herbívoro")) {
			            animalEscolhido = "Lagarta";
			        }
			    } else if (caracteristica2.equals("anelídeo")) {
			        if (caracteristica3.equals("hematófago")) {
			            animalEscolhido = "Sanguessuga";
			        } else if (caracteristica3.equals("onívoro")) {
			            animalEscolhido = "Minhoca";
			        }
			    }
			}
			if (!animalEscolhido.isEmpty()) {
	            System.out.println(animalEscolhido);
	        } else {
	            System.out.println("Características não reconhecidas.");
	        }
		}

	}

}
