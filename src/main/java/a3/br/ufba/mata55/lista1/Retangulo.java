package a3.br.ufba.mata55.lista1;

public class Retangulo {
	public double alt;
	public double lar;
	
	public Retangulo(double alt, double lar) {
		this.alt = alt;
		this.lar = lar;
	}
	public Retangulo() {
		alt=1;
		lar=1;
	}
	public double calculaArea() {
		return lar*alt;
	}
	public double calculaPerimetro() {
		return lar+alt;
	}
}
