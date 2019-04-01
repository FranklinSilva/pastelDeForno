package a5.br.ufba.mata55.lista1;

public class ListaInt {
	int[] vetor;
	int espaçosPreenchidos;

	ListaInt(int valor) {
		this.vetor = new int[valor];
		this.espaçosPreenchidos = 0;
	}

	boolean insereElemento(int valor) {
		if (this.vetor.length > espaçosPreenchidos) {
			this.vetor[espaçosPreenchidos] = valor;
			espaçosPreenchidos++;
			return true;
		}
		return false;
	}

	int obtemElemento(int i) {
		if (espaçosPreenchidos < i) {
			return -1;
		}
		return this.vetor[i];

	}

	int obtemTamanho() {
		return this.espaçosPreenchidos;
	}
}