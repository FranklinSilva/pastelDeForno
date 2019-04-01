package a25.br.ufba.mata55.lista1;

public class Retangulo {
	
	 double altura;
	 double largura;
	
	Retangulo(double altura, double largura) {        
        this.altura = altura;
        this.largura = largura;
    }
	
	public double calculaArea() {
		return altura*largura;
		
	}
	
	public double calculaPerimetro(){
		return (altura*2) + (largura*2);
	}
	
	

}


