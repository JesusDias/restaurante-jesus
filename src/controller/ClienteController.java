package controller;

import entities.Cliente;
import impl.ClienteDao;

public class ClienteController {
	
	private ClienteDao clienteDao = new ClienteDao();
	
	public void cadastraCliente(String nome, Integer cpf, Integer fone) {
		Cliente cliente = new Cliente(nome, cpf, fone);
		this.clienteDao.cadastraCliente(cliente);
	}

	public String mostraListaClientes() {
		return this.clienteDao.listarClientes().toString();
	}
}