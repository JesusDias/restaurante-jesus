package impl;

import java.util.LinkedList;
import java.util.Queue;

import entities.Pedido;

public class PedidoDao {
	
	private static Queue<Pedido> filaPedidos = new LinkedList<>();
	
	public void cadastraPedido(Pedido pedido) {
		filaPedidos.add(pedido);
	}
	
	public Queue<Pedido> listarPedidos() {
		return filaPedidos;
	}
	
	public Pedido enviaPedido() {
		Pedido pedidoResult = filaPedidos.remove();
		return pedidoResult;
	}
	
	public String proximoPedido() {
		if(!filaPedidos.isEmpty()) {
			return filaPedidos.peek().toString();
		} else {
			return "Lista vazia";
		}
	}
	
	public int qtdPedidosRestaurante() {
		if(!filaPedidos.isEmpty()) {
			return filaPedidos.size();
		}
		return -1;
	}
	
	public Pedido buscaPedidoNumero(Integer numPedido) {
		Pedido pedidoResult = null;
		for (Pedido pedido : filaPedidos) {
			if (numPedido.equals(pedido.getNumeroPedido())) {
				pedidoResult = pedido;
			}
		}
		return pedidoResult;
	}
}
