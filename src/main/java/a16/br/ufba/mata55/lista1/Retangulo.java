package a16.br.ufba.mata55.lista1;

public class Retangulo{

	double largura;
	double altura;

	public Retangulo(double largura, double altura){
		this.largura = largura;
		this.altura = altura;
	}

	public Retangulo(){
		this.altura = 1;
		this.largura = 1;
	}

	void setLargura(double largura){
		this.largura = largura;
	}

	void setAltura(double altura){
		this.altura = altura;
	}

	double getLargura(){
		return this.largura;
	}

	double getAltura(){
		return this.altura;
	}

	double calculaArea(){
		return this.altura*this.largura;
	}
	double calculaPerimetro(){
		return (2*this.altura)+(2*this.largura);
	}
}
