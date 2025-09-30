// Pacotes
package lab02_lp2;

import java.util.ArrayList;

public class ContaCorrente extends Conta implements ITributavel {
	// Super Construtor
	public ContaCorrente(int numero, String cliente, double saldo) {
		super(numero, cliente, saldo);
	}
	
	// Métodos Principais
	@Override
	public void saque(double valor) {
		if (valor <= 0) {
		    System.out.println("\nO valor do saque deve ser maior do que zero!");	
		}
		
		else {
			if ((valor + 0.05*valor) <= getSaldo()) {
	        	setSaldo(getSaldo() - (valor + 0.05*valor));
	        	System.out.println(String.format("\nSaque de R$ %.2f realizado com sucesso!", valor));
	        }
	        
	        else {
	            System.out.println("\nSaldo insuficiente na Conta Corrente para o saque!");
	        }
		}
    }
	
	@Override
	public void transferir(int numeroDestino, double valor, ArrayList<Conta> lista) {
		if (valor <= 0) {
		    System.out.println("\nO valor da transferência deve ser maior do que zero!");	
		}
		
		else {
			if ((valor + 0.05*valor) <= getSaldo()) {
	        	setSaldo(getSaldo() - (valor + 0.05*valor));
	        	for (Conta c : lista) {
	            	if (c.getNumero() == numeroDestino) {
	            		c.depositar(valor);
	            	}
	            }
	        	
	        	System.out.println(String.format("\nTransferência de R$ %.2f realizada com sucesso!", valor));
	        }
	        
	        else {
	            System.out.println("\nSaldo insuficiente na Conta Corrente para a transferência!");
	        }
		}
	}
	
	@Override
	public double calculaTributos() {
		return (getSaldo() * 0.01);
	}
}