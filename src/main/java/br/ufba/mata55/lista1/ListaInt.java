package br.ufba.mata55.lista1;

public class ListaInt {
	private int[] valores;
	private int tamanho = 0;
	
	public ListaInt(int capacidade) {
		valores = new int[capacidade];
	}
	
	int obtemTamanho() {
	 return tamanho;   
	}
	
	boolean insereElemento(int valor) {
		if (tamanho < valores.length) {
		    valores[tamanho] = valor;
		    tamanho++;
		    return true;
		}
		return false;
	}
	
	int obtemElemento(int i) {
	    if (i >= 0 && i < tamanho) {
	    	return valores[i];
	    }
	    return -1;
	}
}
