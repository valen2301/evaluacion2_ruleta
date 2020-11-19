/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoruleta;

/**
 *
 * @author Dell
 */
public class revolver {
    private int R;
    

    
    public boolean disparar(){
        
        boolean exito = false;
         R = (int) (Math.random() * 6);
        if (R == 1){
            
            exito = true;
        }
        return exito;
    }
    
}
