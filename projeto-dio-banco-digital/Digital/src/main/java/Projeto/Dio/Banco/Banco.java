package Projeto.Dio.Banco;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Banco {
	
	private String nome;
	private String cnpj;
	private List<Conta> contas;

	public Banco() {
		this.nome = "SanDigital";
		this.cnpj= "O12345678910";
	}
}