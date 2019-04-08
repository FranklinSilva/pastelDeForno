package a12.br.ufba.mata55.lista1;

public class Retangulo {
	// atributos
	double largura, altura;
	
	// construtores
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	public Retangulo() {
		largura = 1;
		altura = 1;
	}
	
	// metodos
	double calculaArea() {
		return largura*altura;
	}
	double calculaPerimetro() {
		return (largura+altura)*2;
	}
	
}
