package a35.br.ufba.mata55.lista1;

public class ListaInt {
	int[] vetor;
	int tam = 0;
	public ListaInt(int tamanho) {
		vetor = new int[tamanho];
	}
	
	int obtemTamanho() {
		return tam;
	}
	boolean insereElemento(int x) {
		if(tam!=vetor.length) {
			vetor[tam]=x;
			tam++;
			return true;
		}
		return false;
	}
	
	int obtemElemento(int i) {
		if(i>=0 && i<=tam-1) {
			return vetor[i];
		}
		else return -1;
	}
}
