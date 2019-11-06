/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_5;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin6_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*5- Dados 3 números que se supon distintos ,
        indicar cal é o maior**/
        Scanner sc = new Scanner(System.in);   
        System.out.println("dame un numero:");
        int num1 = sc.nextInt();
        System.out.println("dame otro numero:");
        int num2 = sc.nextInt();
        System.out.println("dame otro numero:");
        int num3 = sc.nextInt();
        
        
        Numeros numero = new Numeros();
        
        String msg =numero.comprobarNumeros(num1, num2,num3);
        
        System.out.println(msg);
    }
    
}
