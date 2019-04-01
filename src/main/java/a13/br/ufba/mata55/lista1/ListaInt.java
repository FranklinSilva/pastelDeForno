package a13.br.ufba.mata55.lista1;

public class ListaInt {

	int[] array;
	int numelementos = 0;
	
	public ListaInt(int tamanho) {
		array = new int[tamanho];
		}
	
	public int obtemtamanho() {
		return numelementos;
	}
	
	public boolean insereelemento(int valor) {
		if(numelementos == array.length)
			return false;
		else {
			array[numelementos] = valor;
			numelementos++;
			return true;
		}
	}
	
	public int obtemelemento(int i) {
		if(i >= array.length) return -1;
		else return array[i];
	}
}
