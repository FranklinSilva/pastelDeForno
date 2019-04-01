package a19.br.ufba.mata55.lista1;
import java.util.*;

public class Retangulo{
	
	private static final double NULL = 0;
	private double altura;
	private double largura;
	
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}


	public double area() {
		if (altura != 0 && largura !=0) {
		
			return (altura*largura);
		}
		else {
		 return (1);
		}
	}
	public double perimetro() {
		if (altura != 0 && largura !=0) {
		
			return((altura*2)+(largura*2));
		
		}else {
			return (1);
		}
	}
	

public static void main(String[] args) {
	Retangulo retangulo1 = new Retangulo();
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite a altura do retangulo=");
	double altura = entrada.nextDouble();
	System.out.println("Digite a largura do retangulo=");
	double largura = entrada.nextDouble();
	
	
	retangulo1.setAltura(altura);
	retangulo1.setLargura(largura);
	
	System.out.println("Área do rentangulo="+retangulo1.area());
	System.out.println("Perímetro do retangulo="+retangulo1.perimetro());
  }
}