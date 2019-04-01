package a23.br.ufba.mata55.lista1;

public class ListaInt {
		int []lista;
		int tamanho;
	
		int obtemTamanho() {
			tamanho = this.lista.length;
			return tamanho;
		}
		boolean insereElemento (int valor) {
			for(int i=0; i<lista.length; i++) { 
				if(lista[i]==0) {
					lista[i]=valor;
					return true;
									
				}
			}	
			return false;	
		
		}
		int obtemElemente (int i) {
			if(lista[i]!=0) {
				return lista[i];
			}
						
			return -1;
			
		}
		

}
