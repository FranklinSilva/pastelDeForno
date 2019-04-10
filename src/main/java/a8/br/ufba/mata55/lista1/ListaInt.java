package a8.br.ufba.mata55.lista1;

public class ListaInt {

	int[] array;
	ListaInt(int tamanho){
        this.array = new int[tamanho];
    }
	int obtemTamanho() {
		return array.length;
	}
	
	boolean insereElemento(int valor) {
		if ( array[array.length-1] == 0 ) {
		array[array.length-1] = valor;
		return true;
		}
		else return false;
	}
	
	int obtemElemento(int i) {
		if ( i >= 0 && i < array.length ) return array[i];
		else return -1;
		
	}
	
	
}
