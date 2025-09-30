// Pacotes
package lab02_lp2;

import java.util.ArrayList;

public class ContaPoupanca extends Conta {
	// Super Construtor
	public ContaPoupanca(int numero, String cliente, double saldo) {
		super(numero, cliente, saldo);
	}
	
	// Métodos Principais
	@Override
	public void saque(double valor) {
		if (valor <= 0) {
		    System.out.println("\nO valor do saque deve ser maior do que zero!");	
		}
		
		else {
			if (valor <= getSaldo()) {
	        	setSaldo(getSaldo() - valor);
	        	System.out.println(String.format("\nSaque de R$ %.2f realizado com sucesso!", valor));
	        }
	        
	        else {
	            System.out.println("\nSaldo insuficiente na Conta Poupança para o saque!");
	        }
		}
	}
	
	@Override
	public void transferir(int numeroDestino, double valor, ArrayList<Conta> lista) {
		if (valor <= 0) {
		    System.out.println("\nO valor da transferência deve ser maior do que zero!");	
		}
		
		else {
			if (valor <= getSaldo()) {
	        	setSaldo(getSaldo() - valor);
	        	for (Conta c : lista) {
	            	if (c.getNumero() == numeroDestino) {
	            		c.depositar(valor);
	            	}
	            }
	        	
	        	System.out.println(String.format("\nTransferência de R$ %.2f realizada com sucesso!", valor));
	        }
	        
	        else {
	            System.out.println("\nSaldo insuficiente na Conta Poupança para a transferência!");
	        }
		}
	}
}