package view;

import java.util.List;

import model.Pais;

public class PaisView {

	public void exibirListaDePaises(List<Pais> paises) {
		System.out.println("===Lista De paises===");
		for (Pais pais : paises) {
			System.out.println("Pais: " + pais.getNome());
			System.out.println("Capital: " + pais.getCapital());

		}
		System.out.println("------------------");

	}

	

	public void limparLista(List<Pais> paises) {
		if (paises.size() ==0) {
			paises.clear();
			
		}

	}

}
