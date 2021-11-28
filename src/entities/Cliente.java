package entities;

public class Cliente {

	private String nome;
	private Integer cpf;
	private Integer fone;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, Integer cpf, Integer fone) {
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Integer getFone() {
		return fone;
	}

	public void setFone(Integer fone) {
		this.fone = fone;
	}
	
	public String toString() {
		StringBuilder objectString = new StringBuilder();
		objectString.append("\n").append("Nome: ").append(this.nome).append("\n");
		objectString.append("cpf: ").append(this.fone).append("\n");
		objectString.append("Fone: ").append(this.fone).append("\n");
		return objectString.toString();
	}
}
