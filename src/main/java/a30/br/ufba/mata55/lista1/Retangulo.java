/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a30.br.ufba.mata55.lista1;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Retangulo {
   
    double largura;
    double altura;

    
    public double calculaArea(){
        double result;
        result  = largura*altura;
        return result;
    }
    
    public double calculaPerimetro(){
        double result;
        result = (largura*2) + (altura*2);
        return result;
    }
    
    public Retangulo(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
    }
    
    public Retangulo(){
        this.altura = 1;
        this.largura = 1;
    }
}
