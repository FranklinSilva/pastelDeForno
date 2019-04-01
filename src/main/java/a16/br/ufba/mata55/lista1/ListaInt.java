package a16.br.ufba.mata55.lista1;

public class Main{

	int quantidade;
	int capacidade;
	int[] lista;

	public Main(int capacidade){
		this.capacidade = capacidade;
		this.lista = new int[capacidade];
    this.quantidade = 0;
	}

	int obtemTamanho(){
		return this.quantidade;
	}

	boolean insereElemento(int valor){
		boolean inseriu;
		if(capacidade>quantidade){
			this.lista[quantidade]=valor;
			this.quantidade++;
			inseriu = true;
		}else{
			inseriu = false;
		}

		return inseriu;
	}

	int obtemElemento(int i){
		int resultado;
		if(i < this.quantidade){
			resultado = this.lista[i];
		}else{
			resultado = -1;
		}

		return resultado;
	}

}
