package a33.br.ufba.mata55.lista1;

public class ListaInt {
	int capacidade;
	int[] lista;
	int posicao=0;
	
	public ListaInt(int capacidade) {
		this.capacidade = capacidade;
		
		lista = new int[capacidade];
	}
	
	int obtemTamanho() {
		return posicao;
	}
	
	boolean insereElemento(int valor) {
		if(obtemTamanho() < capacidade - 1) {
			lista[obtemTamanho()] = valor;
			
			posicao++;
			
			return true;
		}
		
		return false;
	}
	
	int obtemElemento(int i) {
		if(i >= 0 && i < posicao) {
			return lista[i];
		}
		
		return -1;
	}
}
