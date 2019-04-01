package a21.br.ufba.mata55.lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaInt {
    
   // Scanner entrada = new Scanner(System.in);
   // int tamanholista = entrada.nextInt();
    int tamanholista;
    
    
    //cria lista pra receber inteiros
    ArrayList<Integer> lista_inteiro = new ArrayList<>(tamanholista);
    
    public ListaInt(int quantidade)
    {
        this.tamanholista = quantidade;
    }
    
    int obtemTamanho()
    {
        return lista_inteiro.size();
    }
    
    boolean insereElemento(int valor)
    {
        if (lista_inteiro.size() < this.tamanholista)
        {
         int teste = obtemTamanho();
         lista_inteiro.add(teste, valor);
         return true;
        }
        else{
            return false;
        }
    }
    
    int obtemElemento(int i)
    {
      //for(int i = 0; i < lista_inteiro.size(); i++)
      //System.out.println(lista_inteiro.get(i));
      //return lista_inteiro.indexOf(i);
        if(i < this.tamanholista){
            return lista_inteiro.get(i);
        }else{
            return -1;
        }
    }
//-----------------------------------------------               
    public static void main(String[] args) {
       ListaInt objeto = new ListaInt(5);
       
       objeto.insereElemento(1);
       objeto.insereElemento(2);
       //objeto.insereElemento(3);
       
        System.out.println(objeto.obtemElemento(6));
    }
}
