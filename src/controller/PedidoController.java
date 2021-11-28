package controller;

import entities.Cliente;
import entities.Pedido;
import entities.Prato;
import impl.ClienteDao;
import impl.PedidoDao;
import impl.PratoDao;

public class PedidoController {
	
	private PedidoDao pedidoDao = new PedidoDao();
	private ClienteDao clienteDao = new ClienteDao();
	private PratoDao pratoDao = new PratoDao();
	
	public void cadastraPedido(Integer numeroPedido, String prato, String cliente) {
		Cliente clienteResult = this.clienteDao.buscaClienteNome(cliente);
		Prato pratoResult = this.pratoDao.buscapratoNome(prato);
		if (clienteResult == null || pratoResult == null) {
			System.out.println("\nDados inválidos!");
			return;
		} else {
			Pedido pedido = new Pedido(numeroPedido, pratoResult, clienteResult);
			this.pedidoDao.cadastraPedido(pedido);
			}
		}
	
	public String listarPedidos() {
		return this.pedidoDao.listarPedidos().toString();
	}

	public Pedido enviaPedido() {
		return this.pedidoDao.enviaPedido();
	}
	
	public String mostrarProximoPedido() {
		return this.pedidoDao.proximoPedido().toString();
	}
	
	public void buscarPedido(int num) {
		Pedido pedido = this.pedidoDao.buscaPedidoNumero(num);
		if (pedido != null) {
			System.out.println("\nPedido aguardando para entrega\n" + pedido.getCliente().getNome() + " - " + pedido.getPrato().getNome() + "\n");
		} else {
			System.out.println("\nPedido não encontrado\n");
		}
	}
}