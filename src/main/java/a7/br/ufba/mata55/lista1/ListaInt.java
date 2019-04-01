package a7.br.ufba.mata55.lista1;

class ListaInt {
    int[] lista;
    int tamanho;

    ListaInt(int tamanho){
        this.lista = new int[tamanho];
    }
    int obtemTamanho() {
        return this.lista.length;
    }
    boolean insereElemento(int valor) {
        if(this.lista.length > this.tamanho){
            this.lista[this.tamanho++] = valor;
            return true;
        }
        return false;
    }
    int obtemElemento(int i) {
        if (i >= 0 && i <= this.lista.length){
            return this.lista[i];
        }
        return -1;
    }
}
