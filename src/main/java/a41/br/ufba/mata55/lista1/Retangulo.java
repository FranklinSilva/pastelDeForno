package a41.br.ufba.mata55.lista1;
import java.util.*;

public class Retangulo{
	
	public static final double NULL = 0;
	public double largura;
	public double altura;
	
	

	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		
		this.altura = altura;
		
		
	}
	public Retangulo() {
		altura=largura=1;
	}
	
	public double calculaArea() {
		if ( largura !=0 && altura != 0) {
		
			return (largura *altura );
		}
		else {
		 return (1);
		}
	}
	
	public double calculaPerimetro() {
		if (largura !=0 && altura != 0) {
		
			return((largura*2)+(altura*2));
		
		}else {
			return (1);
		}
	}
	
}
	
