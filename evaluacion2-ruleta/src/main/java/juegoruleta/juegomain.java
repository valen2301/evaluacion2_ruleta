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
public class juegomain {
    
    public static void main(String[] args){
        
       juego Juego = new juego(10);  
       
       while(!Juego.finjuego()){
       Juego.ronda(); 
    
    System.out.println("el juego ha terminado  ");
    
    
    }
    }
}
