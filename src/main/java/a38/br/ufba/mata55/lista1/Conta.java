package a38.br.ufba.mata55.lista1;
//Autor: Tiago Moraes
import java.util.Scanner;

public class Conta {
    
    String codigo;
    double saldo; 
	
public Conta(String codi, double sald){
    
    this.codigo = codi;
    this.saldo = sald;
}

public Conta(String codi){

    this.codigo = codi;
    this.saldo = 0;
}
 
boolean retira(double quantia) {
    
    if(this.saldo > quantia){
    this.saldo = this.saldo - quantia;
    return true; 
    }
    
    else{	
        return false;
    }
}
        
void deposita(double quantia){
        
    this.saldo = this.saldo + quantia;
    }
        

   

boolean transfere(double quantia,Conta beneficiario){
    
    if(this.saldo < quantia || beneficiario == null){
        return false;
        }        
    
    else{
        this.saldo -= quantia;
        beneficiario.saldo = beneficiario.saldo + quantia;
        return true;
        }
    }
}
