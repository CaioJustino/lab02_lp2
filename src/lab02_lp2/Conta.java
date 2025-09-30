// Pacotes
package lab02_lp2;

import java.util.ArrayList;

public abstract class Conta {
	private int numero;
	private String cliente;
	private double saldo;
	
	// Construtor
	public Conta(int n, String c, double s) {
		this.numero = n;
		this.cliente = c;
		this.saldo = s;
	}
	
	// Getters
	public int getNumero() {
		return numero;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	// Setters
	public void setSaldo(double s) {
		this.saldo = s;
	}
	
	// Métodos Principais
	public void depositar(double valor) {
		if (valor <= 0) {
		    System.out.println("\nO valor do depósito deve ser maior do que zero!");	
		}
		
		else {
			this.saldo += valor;
			System.out.println(String.format("\nDepósito de R$ %.2f realizado com sucesso!", valor));
		}
	}
	
	public abstract void saque(double valor);
	
	public abstract void transferir(int numeroDestino, double valor, ArrayList<Conta> lista);
}