package a34.br.ufba.mata55.lista1;

public class ListaInt {
	
	int[] vetor;
	int i = 0;
	
	public ListaInt(int tamLista) {
		vetor = new int[tamLista];
	}
	
	boolean insereElemento(int valor) {
		
		if (i < vetor.length) {
			vetor[i] = valor;
			i++;
			return true;
		} 
		else {
			return false;
		}
	}
	
	int obtemTamanho() {
		return i;
	}
	
	int obtemElemento(int j) {
		if (j <= i) {
			return vetor[j];
		} 
		else return -1;
		
	}
}
