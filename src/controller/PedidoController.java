package controller;

import dao.ClienteDao;
import dao.PedidoDao;
import dao.PratoDao;
import entities.Cliente;
import entities.Pedido;
import entities.Prato;

public class PedidoController {
	
	private PedidoDao pedidoDao = new PedidoDao();
	private ClienteDao clienteDao = new ClienteDao();
	private PratoDao pratoDao = new PratoDao();
	
	public void cadastraPedido(Integer numeroPedido, String prato, String cliente) {
		Cliente clienteResult = this.clienteDao.buscaClienteNome(cliente);
		Prato pratoResult = this.pratoDao.buscapratoNome(prato);
		Pedido pedido = new Pedido(numeroPedido, pratoResult, clienteResult);
		this.pedidoDao.cadastraPedido(pedido);
	}
	
	public String listarPedidos() {
		return this.pedidoDao.listarPedidos().toString()
				+this.clienteDao.listarClientes().toString()
				+this.pratoDao.listarPratos().toString();
	}

	public Pedido enviaPedido() {
		return this.pedidoDao.enviaPedido();
	}
}