/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a30.br.ufba.mata55.lista1;

/**
 *
 * @author mathe
 */
public class Conta {
    String codigo;
    double saldo;
    
    public Conta(String cod, double saldo){
        this.codigo = cod;
        this.saldo = saldo;
    }
    
    public Conta(String cod){
        this.codigo = cod;
        this.saldo = 0;
    }
    
    boolean retira(double quantia){
        if(saldo>0){
            this.saldo -= quantia;
            return true;
        }else{
            return false;
        }
    }
    
    void deposita(double quantia){
        this.saldo += quantia;
    }
    
    boolean transfere(double quantia, Conta beneficiario){
        if(this.saldo < quantia || beneficiario.codigo == null){
            return false;
        }else{
            beneficiario.saldo = quantia;
            this.saldo -= quantia;
            return true;
        }
    }
    
}
