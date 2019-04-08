package a3.br.ufba.mata55.lista1;

public class Retangulo {
	public double altura;
	public double largura;
	
	public Retangulo(double lar, double alt) {
		this.altura = alt;
		this.largura = lar;
	}
	public Retangulo() {
		altura=1;
		largura=1;
	}
	public double calculaArea() {
		return largura*altura;
	}
	public double calculaPerimetro() {
		return largura+altura;
	}
}
