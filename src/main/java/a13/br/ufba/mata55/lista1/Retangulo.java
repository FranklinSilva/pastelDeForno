package a13.br.ufba.mata55.lista1;

public class Retangulo {
	double altura, largura;
	
	public Retangulo() {
		altura = largura = 1;
	}
	
	public Retangulo(double larguraent, double alturaent) {
		altura = alturaent;
		largura = larguraent;
	}

	public double calculaArea() {
		return altura*largura;
	}
	
	public double calculaPerimetro() {
		return (altura*2 + largura*2);
	}
}
