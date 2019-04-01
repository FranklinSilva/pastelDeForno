package a5.br.ufba.mata55.lista1;

public class ListaInt {
	int[] vetor;
	int espacosPreenchidos;

	ListaInt(int valor) {
		this.vetor = new int[valor];
		this.espacosPreenchidos = 0;
	}

	boolean insereElemento(int valor) {
		if (this.vetor.length > espacosPreenchidos) {
			this.vetor[espacosPreenchidos] = valor;
			espacosPreenchidos++;
			return true;
		}
		return false;
	}

	int obtemElemento(int i) {
		if (espacosPreenchidos < i) {
			return -1;
		}
		return this.vetor[i];

	}

	int obtemTamanho() {
		return this.espacosPreenchidos;
	}
}