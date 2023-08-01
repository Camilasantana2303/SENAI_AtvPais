package senai_atvPais;

import java.util.Scanner;

import controller.PaisController;

public class Principal {

	public static void main(String[] args) {

		PaisController paisController = new PaisController();
		Scanner lerDados = new Scanner(System.in);

		int opcao = -1;
		while (opcao != 0) {
			System.out.println("Menu");
			System.out.println("1-Adicionar Pais");
			System.out.println("2-Exibir");
			System.out.println("0-Sair");
			System.out.println("Escolha uma opção");
			opcao = lerDados.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do País");
				lerDados.nextLine();
				String nome = lerDados.nextLine();

				System.out.println("Digite a capital do pais " + nome + ": ");
				String capital = lerDados.nextLine();

				paisController.adicionarPais(nome, capital);
				break;

			case 2:
				paisController.exibirListaDePaises();;
				break;

			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção invalida");
				break;
			}
		}

	}

}
