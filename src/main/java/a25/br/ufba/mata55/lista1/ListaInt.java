package a25.br.ufba.mata55.lista1;

public class ListaInt {
	int capacidade;
	int[] valores;
	
	ListaInt(int capacidade) {
		this.capacidade = 0;
		this.valores = new int[capacidade];
		
	}
	
	public int obtemTamanho() {
		return capacidade;
	}
	
	public boolean insereElemento(int valor) {	
        if(capacidade < valores.length) {
            valores[capacidade] = valor;
            capacidade++;
            return true;
        }
        else {
            return false;            
        }
	}
	
	public int obtemElemento(int i) {
        if (i>=0 && i<capacidade) {
            return valores[i];
        }
        else {
            return -1;
        }
	}

}
