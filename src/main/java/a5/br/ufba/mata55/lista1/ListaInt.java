package a5.br.ufba.mata55.lista1;

public class ListaInt {
	int[] vetor;
	int espa�osPreenchidos;

	ListaInt(int valor) {
		this.vetor = new int[valor];
		this.espa�osPreenchidos = 0;
	}

	boolean insereElemento(int valor) {
		if (this.vetor.length > espa�osPreenchidos) {
			this.vetor[espa�osPreenchidos] = valor;
			espa�osPreenchidos++;
			return true;
		}
		return false;
	}

	int obtemElemento(int i) {
		if (espa�osPreenchidos < i) {
			return -1;
		}
		return this.vetor[i];

	}

	int obtemTamanho() {
		return this.espa�osPreenchidos;
	}
}