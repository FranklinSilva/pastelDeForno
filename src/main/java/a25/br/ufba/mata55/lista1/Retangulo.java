package a25.br.ufba.mata55.lista1;

public class Retangulo {
	
	 double altura;
	 double largura;
	
	Retangulo(double largura, double altura) {        
        this.altura = altura;
        this.largura = largura;
    }
	Retangulo() {        
        this.altura = 1;
        this.largura = 1;
    }
	public double calculaArea() {
		return altura*largura;
		
	}
	
	public double calculaPerimetro(){
		return (altura*2) + (largura*2);
	}
	
	

}


