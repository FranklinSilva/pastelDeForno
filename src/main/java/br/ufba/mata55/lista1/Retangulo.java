package br.ufba.mata55.lista1;

public class Retangulo {
	double largura;
	double altura;
	
	public Retangulo() {
		largura = 1.0;
		altura = 1.0;
	}
	
	public Retangulo(double larg, double alt) {
		largura = larg;
		altura = alt;
	}
	
	double calculaArea() {
		return largura * altura;
	}
	double calculaPerimetro() {
		return 2 * largura + 2 * altura;
	}
}
