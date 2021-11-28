package impl;

import java.util.ArrayList;
import java.util.List;

import entities.Cliente;
import interfacedao.ClienteInterface;

public class ClienteDao implements ClienteInterface {
	
	private static List<Cliente> listaClientes = new ArrayList<>();

	@Override
	public void cadastraCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}

	@Override
	public List<Cliente> listarClientes() {
		return listaClientes;
	}

	@Override
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