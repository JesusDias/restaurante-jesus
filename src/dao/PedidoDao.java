package dao;

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
		Pedido pedidoResult = filaPedidos.poll();
		return pedidoResult;
	}
	
	public String proximoPedido() {
		return filaPedidos.peek().toString();
		
	}
	
	public boolean consultaExistenciaPedido(Pedido pedido) {
		return filaPedidos.contains(pedido);
	}
	
	public void cancelaTodosPedidos() {
		filaPedidos.clear();
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
			if (numPedido.equals(pedidoResult.getNumeroPedido())) {
				pedidoResult = pedido;
			}
		}
		return pedidoResult;
	}
}
