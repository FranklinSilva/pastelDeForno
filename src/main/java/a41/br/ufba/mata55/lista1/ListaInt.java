package a41.br.ufba.mata55.lista1;


public class ListaInt {
	
	public static int tamanho;
	public static String cliente;
	 public static boolean bool; 
	
	
	 public static int getTamanho() {
		return tamanho;
	}

	public static void setTamanho(int tamanho) {
		ListaInt.tamanho = tamanho;
	}

	public static String getCliente() {
		return cliente;
	}

	public static void setCliente(String cliente) {
		ListaInt.cliente = cliente;
	}

	public  boolean isBool() {
		return bool;
	}

	public  void setBool(boolean bool) {
		ListaInt.bool = bool;
	}

	public ListaInt() {
		
	}
	public ListaInt(String cliente) {
		
		ListaInt.cliente = cliente;
		
		
	}
	public ListaInt(String cliente,int tamanho) {
		
		ListaInt.cliente = cliente;
		ListaInt.tamanho = tamanho;
		
	}
	
	public  boolean insereElemento(int[] vetor) {
		
		if(vetor.length < tamanhoLista ) {
			
			for(int i=0; i<vetor.length;i++) {
				vetor [i] = tamanhoLista;
				return(true);
				}	
		}
		else {
			return(false);
		}	
		return (bool);
	}
	
	public   int obtemTamanho(int [] vetor) {
		
		int tamanhoLista = vetor.length;
		return(tamanhoLista);
	}
	
	
	public   int obtemElemento(int n, int [] vetor) {
		
		for (int i = 0; i < vetor.length; i++) {
		
			if(vetor[i] == n){
				return(vetor [i]);
				}
			}
			return (-1);
			}
		
	
	
	

}
