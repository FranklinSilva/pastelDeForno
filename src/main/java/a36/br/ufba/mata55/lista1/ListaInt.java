package a36.br.ufba.mata55.lista1;

public class ListaInt {
	int[] vetor;
	int tamanho = 0;
	public ListaInt(int _capacidade) {
		vetor = new int[_capacidade];
	}
	int obtemTamanho() {
		return tamanho;
	}
	boolean insereElemento(int valor) {
		if(tamanho < vetor.length) {
			vetor[tamanho] = valor;
			tamanho++;
			return true;
		}
		return false;
	}
	int obtemElemento(int i) {
		if(i < tamanho)
			return vetor[i];
		else
			return -1;
	}
}

/*
Crie uma classe, `ListaInt`, que guarda uma lista de valores `int` em um vetor (array), 
	até uma determinada quantidade de valores (capacidade da lista), 
	que deve obrigatoriamente ser informada pelo cliente da classe.
+ A classe `ListaInt` deve conter os seguintes métodos:
- `int obtemTamanho()`: retorna o número de elementos guardados na lista
- `boolean insereElemento(int valor)`: insere o valor no final da lista, 
	a não ser que a capacidade tenha sido excedida. Retorna `true` se o elemento foi inserido, `false` caso contrário.
- `int obtemElemento(int i)`: retorna o valor armazenado no índice `i`; se o índice for inválido, deve retornar `-1`.
*/