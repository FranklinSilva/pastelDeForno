package a15.br.ufba.mata55.lista1;

public class ListaInt {
	int t;
	int v[];
	
	public ListaInt(int c) {
		this.t = c;
		v = new int[c];
	}
	
	public int obtemTamanho () {
		int c = 0;
		for (int i = 0; i < this.t; i++) {
			if (this.v[i] != 0) {
				c=c+1;
			}else {	
			}
		}
		return c;
	}
	public boolean insereElemento (int valor) {
		boolean ie=false;
		for (int i = 0; i < this.t; i++) {
			if (this.v[i] != 0) {
				this.v[i] = valor;
				ie=true;
			}else {
				ie=false;
			}
		}
		return ie;
	}
	public int obtemElemento(int i) {
		int e;
		if (this.v[i] != 0) {
			e = this.v[i];
		}else {
			e=-1;
		}
		return e;
	}
}
