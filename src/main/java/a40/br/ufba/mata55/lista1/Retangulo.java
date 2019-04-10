package a40.br.ufba.mata55.lista1;

public class Retangulo {
	double largura;
	double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura=largura;
		this.altura=altura;
	}
	
	public Retangulo() {
		this.largura=1;
		this.altura=1;
	}
	
	double calculaArea() {
		return largura*altura;
	}
	double calculaPerimetro() {
		return (2*largura + 2*altura);
	}
	
}

