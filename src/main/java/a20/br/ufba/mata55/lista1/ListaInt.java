package a20.br.ufba.mata55.lista1;

public class ListaInt {

    int vetor[];
    int tamanho = 0;
    
    public ListaInt(int qtd) {
        vetor = new int[qtd];
    }
   
    boolean insereElemento (int valor) {
    	if (this.tamanho != vetor.length) {
    		vetor[this.tamanho] = valor;
    		this.tamanho++;
    		return true;
    	} 
    	return false;
    	
    	}

    int obtemTamanho() {
    	return this.tamanho;
    }
    
    int obtemElemento(int i){
    	if(i > this.tamanho) {
    		return -1;
    	} else {
    		return vetor[i];
    	}
    }
   
    public static void main (String args[]) {
        ListaInt li = new ListaInt(3);
        System.out.println(li.tamanho);
        System.out.println(li.insereElemento(5));
        System.out.println(li.obtemElemento(0));
        System.out.println(li.obtemElemento(1));
        System.out.println(li.tamanho);
        System.out.println(li.insereElemento(15));
        System.out.println(li.obtemElemento(11));
        
        
        
        
    }
}
