package dao;

import java.util.ArrayList;
import java.util.List;
import entities.Cliente;

public class ClienteDao {
	
	private static List<Cliente> listaClientes = new ArrayList<>();
	
	public void cadastraCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}
	
	public List<Cliente> listarClientes() {
		return listaClientes;
	}
	
	public Cliente buscaClienteNome(String nome) {
		Cliente clienteResult = null;
		for (Cliente cliente : listaClientes) {
			if (nome.equals(cliente.getNome())) {
				clienteResult = cliente;
			}
		}
		return clienteResult;
	}
}