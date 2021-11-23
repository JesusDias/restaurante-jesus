package entities;

public class Prato {
	
	private String nome;
	private Double preco;
	private String descricao;
	
	public Prato() {
		
	}

	public Prato(String nome, Double preco, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = String.format("%.2f", descricao);
	}
	
	public String toString() {
		StringBuilder objectString = new StringBuilder();
		
		objectString.append("\n").append("PRATO => ").append(this.nome).append("\n");
		objectString.append("Preço: ").append(String.format("%.2f", this.preco)).append("\n");
		objectString.append("Descrição: ").append(this.descricao).append("\n");
		return objectString.toString();
	}
	
}
