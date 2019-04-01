package a33.br.ufba.mata55.lista1;

public class Retangulo {
	double largura;
	double altura;

	public Retangulo() {
		largura = 1;
		altura = 1;
  	}

  	public Retangulo(double largura, double altura) {
  		this.largura = largura;
  		this.altura = altura;
  	}

  	double calculaArea(){
  		return largura * altura;
  	}

  	double calculaPerimetro(){
  		return 2 * (largura + altura);
  	}
}