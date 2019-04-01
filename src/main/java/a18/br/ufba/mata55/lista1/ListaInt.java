package a18.br.ufba.mata55.lista1;
import java.lang.reflect.Array;
import java.util.*;


public class ListaInt {
	
	 static boolean bool; 
	 
	
	public static boolean insereElemento(boolean bool,int tamanhoLista,int[] vetor) {
		
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
	
	public static int obtemTamanho(int [] vetor) {
		
		int tamanhoLista = vetor.length;
		return(tamanhoLista);
	}
	
	
	public static int obtemElemento(int n, int [] vetor) {
		
		for (int i = 0; i < vetor.length; i++) {
		
			if(vetor[i] == n){
				return(vetor [i]);
				}
			}
			return (-1);
			}
		
	
	
	public static void main(String[] args) {
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.println("Digite o tamanho desejado da lista: ");
		int tamanho = entrada.nextInt();
		
		int [] vetor = new int[tamanho];
		
		// Preenchimento do vetor;
		
		int i=0;
		while ( i < tamanho){
			System.out.println("Digite "+(i + 1)+" o numero:");
			vetor[i] = entrada.nextInt();
			i++;
			}
		
	  
		//obter número solicitado;

		System.out.println("Digite o valor para pesquisar: ");
		int num =entrada.nextInt();
		int resultado = obtemElemento(num,vetor);
	   if(resultado == num) {
		System.out.println("O valor Encontrado: " +resultado);
	   }
	   else {
		   System.out.println("O valor " + num + " não foi encontrado:"+ -1);
	   }
	   
	   
	  //Obter tamanho;
	    
	    obtemTamanho(vetor);
	    int tamanhoLista = obtemTamanho(vetor);
	    System.out.println("Tamanho Total da Lista: " +tamanhoLista);
	    
	    
	    
	    //Insere valor na lista caso ainda não esteja completa;
	    
	    System.out.println("Digite o valor a inserir: ");
	     num = entrada.nextInt();
	    insereElemento(bool,tamanhoLista,vetor);
	    boolean inserido = insereElemento(bool,tamanhoLista,vetor);
	    System.out.println(inserido);
	}

}
