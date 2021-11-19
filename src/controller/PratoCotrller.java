package controller;

import dao.PratoDao;
import entities.Prato;

public class PratoCotrller {
	
	private PratoDao pratoDao = new PratoDao();
	
	public void cadastraPrato(String nome, Double preco, String descricao) {
		Prato prato = new Prato(nome, preco, descricao);
		this.pratoDao.cadastraPrato(prato);
	}
	
	public String mostrarListaPratos() {
		return this.pratoDao.listarPratos().toString();
	}
}