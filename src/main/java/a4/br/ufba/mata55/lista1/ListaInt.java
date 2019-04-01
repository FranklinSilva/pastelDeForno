package a4.br.ufba.mata55.lista1;

public class ListaInt {
	public int[] vetor;
	public int i;
	
	public ListaInt(int tam) {
		vetor = new int[tam];
		i=0;
	}
	public int obtemTamanho() {
		return i; 
	}
	public boolean insereElemento(int valor) {
		if (i<vetor.length) {
			vetor[i]=valor;
			i++;
			return true;
		}
		else {
		return false;
		}
	}
	public int obtemElemento(int i) {
		if (i>0 || i>this.i) {
			return -1;
		}
		else {
		return vetor[i];
		}
	}
}
