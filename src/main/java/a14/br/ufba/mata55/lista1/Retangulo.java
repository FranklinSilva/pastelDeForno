package a14.br.ufba.mata55.lista1;

import java.util.*;


public class Retangulo {
	static double altura;
	static double largura;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public static double calculaArea () {
		return altura*largura;
	}
	
	public static double calculaPerimetro () {
		return (altura*2) + (largura*2);
	}
		
	public static void main (String[] Arg) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite altura: ");
		altura = input.nextDouble();
		System.out.println("Digite largura: ");
		largura = input.nextDouble();
		
		System.out.println("Valor area" + calculaArea());
		System.out.println ("Valor perimetro: " +calculaPerimetro());		
	}
}

