package a38.br.ufba.mata55.lista1;
//Autor: Tiago Moraes
import java.util.ArrayList;

public class ListaInt {
    int quantidade;
    
 ArrayList<Integer> valoreslista = new ArrayList<Integer>(quantidade);
 
public ListaInt(int qtd){
    this.quantidade = qtd;
}
 
int obtemTamanho(){
    return this.valoreslista.size();
}

boolean insereElemento(int valor){
    if(this.valoreslista.size() < this.quantidade){    
    int posicao = obtemTamanho();
    
    valoreslista.add(posicao, valor);
    return true;
    }
    
    else{
        return false;
    }
}

int obtemElemento(int i){
    if (i < this.quantidade) {
     return valoreslista.get(i);
    } 
    
    else{
        return -1;
    }
  }  
}
