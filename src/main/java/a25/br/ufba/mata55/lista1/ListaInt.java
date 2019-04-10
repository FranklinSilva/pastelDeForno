package a25.br.ufba.mata55.lista1;

public class ListaInt {
	int capacidade;
	int[] valores;
	
	ListaInt(int capacidade) {
		this.capacidade = capacidade;
		this.valores = new int[capacidade];
		
	}
	
	public int obtemTamanho() {
		int elementos = 0;		
		for (int i=0; i<this.capacidade; i++) {
			elementos++;
			            
        }
        return elementos;
	}
	
	public boolean insereElemento(int valor) {		
		int elementos = this.obtemTamanho();
        if(elementos < this.capacidade) {
            this.valores[elementos] = valor;
            return true;
        }
        else {
            return false;            
        }
	}
	
	public int obtemElemento(int i) {
        if (i>(capacidade-1)) {
            return this.valores[i];
        }
        else {
            return -1;
        }
	}

}
