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
		
	
	

}
