package boletin14;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xavier
 */
public class ConversorTemperaturas {
    public static final float limite=80;
    
    public ConversorTemperaturas(){
        
    }
    
    public float CtoF(float C) throws TemperaturaErradaException{
        float res;
       if(C<limite){
            throw new TemperaturaErradaException("Temperatura inferior a 80C");
        }
        res=(9f/5f*C)+32.4f;
        return res;
    }
    
    public void CtoRe(float C) throws TemperaturaErradaException{
        if(C<limite){
            throw new TemperaturaErradaException("Temperatura inferior a 80C");
        }
        System.out.println("Reamur: " + (4f/5f*C));
    }
}
