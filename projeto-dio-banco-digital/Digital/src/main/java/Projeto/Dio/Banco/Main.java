package Projeto.Dio.Banco;

import java.util.Scanner;

public class Main {

	public static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		Cliente Lucas = new Cliente();
		System.out.printf("Informe seu nome");
		Lucas.setNome(leitor.nextLine());
		System.out.printf("Informe seu cpf");
		Lucas.setCpf(leitor.nextLine());
		Cliente L = new Cliente();
		System.out.printf("Informe seu nome");
		L.setNome(leitor.nextLine());
		System.out.printf("Informe seu cpf");
		L.setCpf(leitor.nextLine());
		IConta cc = new ContaCorrente(Lucas);
		IConta poupanca = new ContaPoupança(L);

		cc.depositar(100);	
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}