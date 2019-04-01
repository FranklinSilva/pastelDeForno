package a22.br.ufba.mata55.lista1;

import java.util.Scanner;

public class Retangulo {
    
    double largura;
    double altura;
//-----------------------------------------------    
    public Retangulo(double larg, double altu)
    {
        this.largura = larg;
        this.altura = altu;
    }
    
    public Retangulo()
    {
        this.largura = 1;
        this.altura = 1;
    }
//-----------------------------------------------  
    double calculaArea()
    {
        return largura * altura;
    }
    
    double calculaPerimetro()
    {
        return (largura + altura)*2;
    }  
//-----------------------------------------------
    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        double largura = entrada.nextDouble();
        double altura = entrada.nextDouble();
        
        Retangulo objeto = new Retangulo(largura, altura);
        System.out.println(objeto.calculaArea());

        Retangulo tiagoobjeto = new Retangulo();
        System.out.println(tiagoobjeto.calculaPerimetro());
    }
}
