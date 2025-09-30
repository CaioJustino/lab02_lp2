// Pacotes
package app;

// Imports
import lab02_lp2.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean statusDoPrograma = true;
		Scanner sc = new Scanner(System.in);
		ServicoDaConta se = new ServicoDaConta();
		
		while (statusDoPrograma) {		
			System.out.println("\n   __   _  _   ____ ___ _____ \r\n"
					+ "  / /_ | || | | __ )_ _|_   _|\r\n"
					+ " | '_ \\| || |_|  _ \\| |  | |  \r\n"
					+ " | (_) |__   _| |_) | |  | |  \r\n"
					+ "  \\___/   |_| |____/___| |_|  \r\n"
					+ "                              ");

	        System.out.println("\nBem-vind@ ao Gestor de Contas!\nDigite o número da função que deseja executar:");
	        System.out.println(" 1 | Criar Conta\n 2 | Realizar Depósito\n 3 | Realizar Saque"
	        + "\n 4 | Realizar Transferência\n 5 | Listar Contas\n 6 | Calcular Total de Tributos\n 7 | Sair");
	        System.out.print("\nInsira a sua opção: ");
	        int op = sc.nextInt();

	        switch (op) {
	            case 1:
	            	int numero = 100;
	            	if (!se.getLista().isEmpty()) {
	            	    numero = se.getLista().get(se.getLista().size() - 1).getNumero() + 1;
	            	}

	                System.out.println("\n=== CRIAR CONTA ===");

	                System.out.print("\nDigite o nome do cliente: ");
	                String cliente = sc.next();
	                
	                boolean loop = true;
	                
	                while (loop) {
	                	System.out.print("\nDigite o tipo da conta que deseja criar:");
		                System.out.println("\n 1 | Conta Corrente\n 2 | Conta Poupança");
		                System.out.print("\nInsira a sua opção: ");
		                int opConta = sc.nextInt();
		                
	                	if (opConta == 1) {
	                		ContaCorrente contaCorrente = new ContaCorrente(numero, cliente, 0);
	                		se.getLista().add(contaCorrente);
	                		loop = false;
	                	}
	                	
	                	else if (opConta == 2) {
	                		ContaPoupanca contaPoupanca = new ContaPoupanca(numero, cliente, 0);
	                		se.getLista().add(contaPoupanca);
	                		loop = false;
	                	} 
	                	
	                	else {
	                		System.out.println("\nOpção inválida! Tente novamente.");
	                	}
	                }
	                
	                System.out.println("\nConta criada com sucesso!");
	                break;
	                
	            case 2:
	            	System.out.println("\n=== REALIZAR DEPÓSITO ===");

	                System.out.print("\nDigite o número da conta: ");
	                int numeroDeposito = sc.nextInt();
	                
	                System.out.print("\nDigite o valor a ser depositado: ");
	                double valorDeposito = sc.nextDouble();
	                boolean encontrouContaDep =  false;
	                
	                for (Conta c : se.getLista()) {
	                	if (c.getNumero() == numeroDeposito) {
	                		c.depositar(valorDeposito);
	                		encontrouContaDep = true;
	                        break;
	                	}
	                }
	                
	                if (!encontrouContaDep) {
	                	System.out.println("\nConta não encontrada! Tente novamente.");
	                }
	            	break;
	            	
	            case 3:
	            	System.out.println("\n=== REALIZAR SAQUE ===");

	                System.out.print("\nDigite o número da conta: ");
	                int numeroSaldo = sc.nextInt();
	                
	                System.out.print("\nDigite o valor a ser sacado: ");
	                double valorSaldo = sc.nextDouble();
	                boolean encontrouContaSld =  false;
	                
	                for (Conta c : se.getLista()) {
	                	if (c.getNumero() == numeroSaldo) {
	                		c.saque(valorSaldo);
	                		encontrouContaSld = true;
	                        break;
	                	}
	                }
	                
	                if (!encontrouContaSld) {
	                	System.out.println("\nConta não encontrada! Tente novamente.");
	                }
	            	break;
	            	
	            case 4:
	            	System.out.println("\n=== REALIZAR TRANSFERÊNCIA ===");

	                System.out.print("\nDigite o número da conta de origem: ");
	                int numeroOrigem = sc.nextInt();
	                
	                System.out.print("\nDigite o número da conta de destino: ");
	                int numeroDestino = sc.nextInt();
	                
	                System.out.print("\nDigite o valor a ser transferido: ");
	                double valorTransferencia = sc.nextDouble();
	                boolean encontrouContaOrigem =  false;
	                
	                for (Conta c : se.getLista()) {
	                	if (c.getNumero() == numeroOrigem) {
	                		encontrouContaOrigem = true;
	                        break;
	                	}
	                }
	                
	                boolean encontrouContaDestino =  false;
	                
	                for (Conta c : se.getLista()) {
	                	if (c.getNumero() == numeroDestino) {
	                		encontrouContaDestino = true;
	                        break;
	                	}
	                }
	                
	                if (!encontrouContaOrigem) {
	                	System.out.println("\nConta de origem não encontrada! Tente novamente.");
	                }
	                
	                if (!encontrouContaDestino) {
	                	System.out.println("\nConta de destino não encontrada! Tente novamente.");
	                }
	                
	                if (encontrouContaOrigem == true && encontrouContaDestino == true) {
	                	for (Conta c : se.getLista()) {
		                	if (c.getNumero() == numeroOrigem) {
		                		c.transferir(numeroDestino, valorTransferencia, se.getLista());
		                        break;
		                	}
		                }
	                }
	            	break;
	            
	            case 5:
	            	System.out.println("\n=== LISTA DE CONTAS ===");
	            	
	            	if (se.getLista().isEmpty()) {
	            		System.out.println("\nNenhuma conta foi cadastrada!");
	            	}
	            	
	            	else {
	            		for (Conta c : se.getLista()) {
		            		System.out.println("\nN°: " + c.getNumero());
			                System.out.println("Cliente: " + c.getCliente());
			                System.out.println(String.format("Saldo: R$ %.2f", c.getSaldo()));
			                
			                if (c instanceof ContaCorrente) {
			                	System.out.println("Tipo de Conta: Corrente");
			                }
			                
			                else if (c instanceof ContaPoupanca) {
			                	System.out.println("Tipo de Conta: Poupança");
			                }
			                
			                System.out.println("-----------------------");
		                }	
	            	}
	            	break;
	            	
	            case 6:
	            	double totalTributos = 0;
	            	
	            	System.out.println("\n=== TOTAL DE TRIBUTOS ===");
	            	
	            	if (se.getLista().isEmpty()) {
	            		System.out.println("\nNenhuma conta foi cadastrada!");
	            	}
	            	
	            	else {
		            	for (Conta c : se.getLista()) {
		            		if (c instanceof ContaCorrente) {
		            			ITributavel contaTributavel = (ITributavel) c;
		            			totalTributos += contaTributavel.calculaTributos();
		            		}
		            	}
		            	System.out.println(String.format("\nTotal de tributos a recolher: R$ %.2f", totalTributos));
	            	}
	            	break;
	            	
	            case 7:
	            	statusDoPrograma = false;
	                break;
	                
	            default:
	                System.out.println("\nOpção inválida! Tente novamente.");
	        }
		}
		
		System.out.println("Programa encerrado!");
    }
}