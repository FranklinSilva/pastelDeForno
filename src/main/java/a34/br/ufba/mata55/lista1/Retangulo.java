package a34.br.ufba.mata55.lista1;

public class Retangulo {
	
	double largura, altura;
	double area;
	double perimetro;
	
	public Retangulo() {
		largura = 1;
		altura = 1;
	}
	
	public Retangulo(double larg, double alt) {
		largura = larg;
		altura = alt;
	}
	
	
	double calculaArea() {
		area = altura*largura;
		return area;
	}
	
	double calculaPerimetro() {
		perimetro = (altura*2)+(largura*2);
		return perimetro;
	}

}
