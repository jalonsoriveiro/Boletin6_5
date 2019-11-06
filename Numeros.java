/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

/**
 *
 * @author jalonsoriveiro
 */
public class Numeros {
    
    
    public String comprobarNumeros(int num1,int num2,int num3){
    
    if(num1>num2 && num1>num3){
    
        return ("El primer numero es el mayor "+num1);
    
    }
    else if(num2>num1 && num2 > num3) {
    
        return("El segundo numero es el mayor "+num2);
    }
    else
        return("EL tercer numero es el mayor"+num3);
    }
    
}
