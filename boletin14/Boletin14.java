/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConversorTemperaturas c;
        Scanner sc;
        float F,temp;
        sc=new Scanner(System.in);
        c=new ConversorTemperaturas();
        System.out.println("Introduce temperatura:");
        temp=sc.nextFloat();
        try{
            F=c.CtoF(temp);
            System.out.println("CtoF:" + F);
            c.CtoRe(temp);
        }catch(TemperaturaErradaException e){
           System.out.println(" " + e.toString());
        }
    }
    
}
