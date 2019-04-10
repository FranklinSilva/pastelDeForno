/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a30.br.ufba.mata55.lista1;

/**
 *
 * @author mathe
 */
public class ListaInt {
    int qnt;
    int[] vetor;
    
    public ListaInt(int quantidade){
        this.qnt = quantidade;
        vetor = new int[qnt];
    }
    
    int obtemTamanho(){
        return this.vetor.length;                
    }
    
    boolean insereElemento(int valor){
        int tamUso = obtemTamanho();
        if(tamUso == qnt){
            return false;
        }else{
            this.vetor[qnt++] = valor;
            return true;
        }
    }
    
    int obtemElemento(int i){
        if(i > this.qnt){
            return -1;
        }else{
            return this.vetor[i];
        }
        
    }
}
