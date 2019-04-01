package a37.br.ufba.mata55.lista1;

public class Retangulo {
	public double altura, largura;
	public Retangulo(){
		altura = 1;
		largura = 1;
	}
	public Retangulo(double x, double y){
		altura = x;
		largura = y;
	}
	double calculaArea() {
		return altura*largura;
	}
	double calculaPerimetro() {
		return (altura*2)+(largura*2);
	}
}

/*
 *Exercício 1. Crie uma classe `Retangulo`, que representa um retângulo, 
 *com largura e altura (do tipo `double`). É possível criar um retângulo informando largura e altura, 
 *nesta ordem, ou não informando nada (nesse caso assume-se que largura = altura = 1). 
 *Para este exercício, não é preciso checar se os valores de largura e altura são válidos. 
 *A classe deve possuir os seguintes métodos:
- `double calculaArea()`: retorna o produto da largura pela altura
- `double calculaPerimetro()`: retorna a soma dos lados do retângulo
 */