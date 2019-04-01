package a12.br.ufba.mata55.lista1;

public class ListaInt {
	// atributos
	int capacidadeDaLista;
	int tam=0;
	int[] vetor;
	
	// construtor
	ListaInt(int capacidadeDaLista) {
		this.capacidadeDaLista = capacidadeDaLista;
		vetor = new int[capacidadeDaLista];
	}
	
	// metodos
	int obtemTamanho() {
		return tam;
	}
	boolean insereElemento(int valor) {
		if (tam < capacidadeDaLista) {
			vetor[tam]=valor;
			tam++;
			return true;
		} else {
			return false;
		}
	}
	int obtemElemento(int i) {
		if (i>=0 && i<tam) {
			return vetor[i];
		} else {
			return -1;
		}
	}
}