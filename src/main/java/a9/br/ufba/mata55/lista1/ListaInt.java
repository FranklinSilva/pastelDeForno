package a9.br.ufba.mata55.lista1;

public class ListaInt {

	int contador = 0;
	int[] array;

	ListaInt(int tamanhoDaLista) {
		this.array = new int[tamanhoDaLista];
	}

	int obtemTamanho() {
		return this.contador;
	}

	boolean insereElemento(int valor) {
		if (this.contador < array.length) {
			this.array[this.contador] = valor;
			this.contador++;
			return true;
		} else
			return false;
	}

	int obtemElemento(int i) {
		if (i < 0 && i >= this.array.length) {
			return -1;
		}
		else return this.array[i];
	}
}