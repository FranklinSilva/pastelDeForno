package a39.br.ufba.mata55.lista1;

public class Retangulo {
	double largura, altura;
	
	public Retangulo() {
		this.largura = this.altura = 1;
	}
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	double calculaArea() {
		return this.altura * this.largura;
	}
	
	double calculaPerimetro() {
		return this.altura*2 + this.largura*2;
	}
}