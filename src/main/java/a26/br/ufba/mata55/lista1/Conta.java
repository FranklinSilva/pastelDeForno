/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a26.br.ufba.mata55.lista1;

/**
 *
 * @author Lucas
 */
public class Conta {
    
    double saldo;
    String codigo;
    
    public Conta(String codigo){
        this.codigo = codigo;
        this.saldo = 0;
    }
    
    public Conta(String codigo, double saldo){
        this.saldo = saldo;
        this.codigo = codigo;
    }
    
    boolean retira(double quantia, Conta beneficiario){
        if(quantia > this.saldo){
            return false;
        } else {
            beneficiario.saldo += quantia;
            return true;
        }
    }
    
    void deposita(double quantia){
        this.saldo += quantia;
    }
    
    
    
}
