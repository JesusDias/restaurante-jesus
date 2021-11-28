package interfacedao;

import java.util.List;

import entities.Cliente;

public interface ClienteInterface {
	
	public void cadastraCliente(Cliente cliente);
	
	public List<Cliente> listarClientes();
	
	public Cliente buscaClienteNome(String nome);

}
