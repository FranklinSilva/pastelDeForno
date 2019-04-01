package a10.br.ufba.mata55.lista1;

public class ListaInt {
	
	int listaInt[];
	int tamanho;
	int tam;

	public ListaInt(int tamanho) {
		this.tamanho=tamanho;
		this.listaInt= new int[tamanho];
		this.tam=0;
	}
	
	int obtemTamanho() {
		return this.tamanho;
	}
	
	boolean insereElemento(int valor) {
		if(tam <tamanho) {
			listaInt[tam]=valor;
			this.tam++;
			return true;			
		}
		else {
			return false;
		}
	}
	int obtemElemento(int i) {
		if(i<this.tam||i<0) {
			return listaInt[i];
		}
		else {
			return -1;
		}
	}
		

}
