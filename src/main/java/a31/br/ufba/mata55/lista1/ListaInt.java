package a31.br.ufba.mata55.lista1;

public class ListaInt {
	int[] vetor;
	int tam;
	int c=0;
	ListaInt(int y){
		tam = y;
		vetor = new int[tam];
	}
	boolean insereElemento(int valor) {
		if (c<tam) {
			vetor[c]=valor;
			c++;
			return true;
		}else {
			return false;
		}
	}
	int obtemTamanho() {
		return c;
	}
	int obtemElemento(int i) {
		if (i>c) {
			return -1;
		}else {
			return vetor[i];
		}
	}
}
