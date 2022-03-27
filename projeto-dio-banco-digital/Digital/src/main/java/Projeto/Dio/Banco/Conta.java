package Projeto.Dio.Banco;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Conta implements IConta {
	
	private static final int  AGENCIA_PADRAO = 1;
	
	private int agencia;
	private int numero;
	private double saldo;
	protected Cliente cliente;
	
	private static int SEQUENCIAL = 1;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor; 
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor; 		
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor); 
		contaDestino.depositar(valor);
	}

	protected void imprimirInfos() {
		System.out.printf("Nome: %s%n", this.cliente.getNome());
		System.out.printf("Agencia: %d%n", this.agencia);
		System.out.printf("Numero: %d%n", this.numero);
		System.out.printf("Saldo: %.2f%n", this.saldo);
	}

}
