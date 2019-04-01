package a24.br.ufba.mata55.lista1;

public class ListaInt {
    int [] vetor;
    int capacidadeDaLista;
    int tamanho;
    public ListaInt(int clienteDaClasse) {
        vetor = new int [clienteDaClasse];
        capacidadeDaLista = clienteDaClasse;
        tamanho = 0;
    }
    public int obtemTamanho() {
        return this.tamanho;
    }
    public boolean insereElemento(int valor) {
        if(this.tamanho<this.capacidadeDaLista) {
            this.vetor[this.tamanho] = valor;
            this.tamanho++;
            return true;
        }
        else {
            return false;
        }
    }
    public int obtemElemento(int i) {
        if(i>=this.vetor.length || i<0) {
        return -1;
        }
        else {
            return this.vetor[i];
        }
    }
    
    /////////////////////////////////////////
    public static void main(String[] args) {
		ListaInt x = new ListaInt(5);
		System.out.println(x.obtemTamanho());	 
		x.insereElemento(10);
		x.insereElemento(10);
		x.insereElemento(10);
		x.insereElemento(10);
		x.insereElemento(10);
		x.insereElemento(10);
		System.out.println(x.obtemElemento(-1));
	}
} 

