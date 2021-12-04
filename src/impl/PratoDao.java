package impl;

import java.util.ArrayList;
import java.util.List;

import entities.Prato;
import interfacedao.PratoInterface;

public class PratoDao  implements PratoInterface{
	
	private static List<Prato> listaPratos = new ArrayList<>();

	@Override
	public void cadastraPrato(Prato prato) {
		listaPratos.add(prato);
	}

	@Override
	public List<Prato> listarPratos() {
		return listaPratos;
	}

	@Override
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