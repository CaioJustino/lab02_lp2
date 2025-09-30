// Pacotes
package lab02_lp2;

// Imports
import java.util.ArrayList;

public class ServicoDaConta {
	private ArrayList<Conta> lista;
	
	// Construtor
	public ServicoDaConta() {
		this.lista = new ArrayList<>();
	}
	
	// Getters
	public ArrayList<Conta> getLista() {
		return lista;
	}
	
	// Setters
	public void setLista(ArrayList<Conta> l) {
		this.lista = l;
	}
}