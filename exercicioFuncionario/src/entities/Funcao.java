package entities;

import java.util.UUID;

public class Funcao {

	private UUID id;
	private String funcao;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
