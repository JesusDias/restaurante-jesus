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
}
