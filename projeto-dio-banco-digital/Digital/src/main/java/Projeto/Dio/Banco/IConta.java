package Projeto.Dio.Banco;


public interface IConta {

	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta poupanca);
	
	void imprimirExtrato();

}