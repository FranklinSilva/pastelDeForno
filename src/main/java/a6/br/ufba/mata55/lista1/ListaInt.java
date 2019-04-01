package a6.br.ufba.mata55.lista1;

public class ListaInt {
	int[] x;
	int capacidadedalista;
	int contador;
	
	public ListaInt(int capacidadedalista) {
		this.capacidadedalista = capacidadedalista;
		x = new int[capacidadedalista];
		contador=0;
	}
	
	int obtemTamanho() {
		return contador;
	}
	
	boolean insereElemento(int valor) {
		if(contador==capacidadedalista) {
			return false;
		}
		else {
			x[contador]=valor;
			contador++;
			return true;
		}
		
	}
	
	int obtemElemento(int i) {
		if(i<contador) {
			return x[i];
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		ListaInt lista = new ListaInt(10);
		
		lista.insereElemento(2);
		lista.insereElemento(4);
		lista.insereElemento(6);
		System.out.println(lista.obtemTamanho());
		System.out.println(lista.obtemElemento(2));
		System.out.println(lista.obtemElemento(4));
		
	  }
}