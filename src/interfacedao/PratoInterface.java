package interfacedao;

import java.util.List;

import entities.Prato;

public interface PratoInterface {
	
	public void cadastraPrato(Prato prato);
	
	public List<Prato> listarPratos();
	
	public Prato buscapratoNome(String nome);
}
