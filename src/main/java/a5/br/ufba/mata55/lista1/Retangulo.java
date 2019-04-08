package a5.br.ufba.mata55.lista1;

public class Retangulo {
	double largura;
	double altura;

	Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	Retangulo(){
		this.largura = 1;
		this.altura = 1;
	}

	double calculaArea() {
		return largura * altura;
		
	}

	double calculaPerimetro() {
		return (altura + largura) * 2;
	}
}
