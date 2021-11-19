package dao;

import java.util.ArrayList;
import java.util.List;
import entities.Prato;

public class PratoDao {
	
	private static List<Prato> listaPratos = new ArrayList<>();
	
	public void cadastraPrato(Prato prato) {
		listaPratos.add(prato);
	}
	
	public List<Prato> listarPratos() {
		return listaPratos;
	}
	
	public Prato buscapratoNome(String nome) {
		Prato pratoResult = null;
		for(Prato prato : listaPratos) {
			if(nome.equals(prato.getNome())) {
				pratoResult = prato;
			}
		}
		return pratoResult;
	}
}