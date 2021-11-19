package entities;

public class Pedido {
	
	private Integer numeroPedido;
	private Prato prato;
	private Cliente cliente;
	
	public Pedido() {

	}

	public Pedido(Integer numeroPedido, Prato prato, Cliente cliente) {
		this.numeroPedido = numeroPedido;
		this.prato = prato;
		this.cliente = cliente;
	}

	public Integer getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Prato getPrato() {
		return prato;
	}

	public void setPrato(Prato prato) {
		this.prato = prato;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
