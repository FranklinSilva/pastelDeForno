package a39.br.ufba.mata55.lista1;

public class ListaInt {
	int[] vetor;
	int tamanho;
	
	public ListaInt(int tamanho) {
		this.vetor = new int[tamanho];
		this.tamanho = 0;
	}
	
	int obtemTamanho() {
		return this.tamanho;
	}
	
	boolean insereElemento(int valor) {
		if (this.tamanho == this.vetor.length)
			return false;
		
		this.vetor[this.tamanho] = valor;
		this.tamanho++;
		return true;
	}
	
	int obtemElemento(int i) {
		if (i < 0 || i >= this.vetor.length)
			return -1;
		
		return vetor[i];
	}
}