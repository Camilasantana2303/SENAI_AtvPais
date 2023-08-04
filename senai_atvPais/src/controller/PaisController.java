package controller;

import java.util.ArrayList;
import java.util.List;

import model.Pais;
import view.PaisView;

public class PaisController {
	private List<Pais> listaDePaises;
	private PaisView paisView;
	
	public PaisController() {
		listaDePaises = new ArrayList<>();
		paisView=new PaisView();
	}
	
	public void adicionarPais(String nome,String capital) {
		Pais pais = new Pais(nome,capital);
		listaDePaises.add(pais);
	}
	public void exibirListaDePaises() {
		paisView.exibirListaDePaises(listaDePaises);
	}
	
	public void removerPais(String nomePais) {
		for (Pais pais : listaDePaises) {
			if(pais.getNome().equalsIgnoreCase(nomePais)) {
				listaDePaises.remove(pais);
				break;
			}
			
		}
		//public void removeLista(List<Pais> paises) {
				//for (int i = 0; i < paises.size(); i++) {
					//paises.remove(i);
				//}

			//}	
	}
	
	
	public void limparLista() {
		paisView.limparLista(listaDePaises);
	}
		
	
	

}
