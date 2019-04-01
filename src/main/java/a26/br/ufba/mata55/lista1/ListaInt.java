/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a26.br.ufba.mata55.lista1;

/**
 *
 * @author Lucas
 */
public class ListaInt {
    private int[] array;
    private int topo;
    
    public ListaInt(int tamanho){
        this.array = new int[tamanho];
        this.topo = 0;
    }
    
    int obtemTamanho(){
        return this.array.length;
    }
    
    boolean insereElemento(int valor){
        if(!(this.topo == this.array.length)){
            this.array[this.topo] = valor;
            this.topo++;
            return true;
        }
        return false;
    }
    
    int obtemElemento(int i){
        if(i > this.array.length-1){
            return -1;
        }
        
        return this.array[i];
    }

}
