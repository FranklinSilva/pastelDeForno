package a13.br.ufba.mata55.lista1;

public class Retangulo {
	double altura, largura;
	
	public Retangulo() {
		altura = largura = 1;
	}
	
	public Retangulo(double alturaent, double larguraent) {
		altura = alturaent;
		largura = larguraent;
	}

	public double calculaarea() {
		return altura*largura;
	}
	
	public double calculaperimetro() {
		return (altura*2 + largura*2);
	}
}
