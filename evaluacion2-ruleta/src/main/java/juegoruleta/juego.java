/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoruleta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class juego {
  
    int x;
    private jugador [] jugadores;
    private revolver revolver;
    
    public juego (int numJugadores){
        
        numJugadores = Integer.parseInt(JOptionPane.showInputDialog("escriba numero de jugadores"));
        
        jugadores = new jugador [numJugadores]; 
        
        for(int i=0;i<jugadores.length;i++){
            jugadores[i]=new jugador(i+1);
            
             revolver = new revolver();
            
        }
        
    }
    
       public boolean finjuego (){
        
        for (int i=0; i<jugadores.length;i++){
            if (jugadores[i].vivo = false){
                x=x+1;
                if (x>= (jugadores.length-1)){
                                    return true;

                   
                }
            }
            
            
        }
       return false; 
    }
    
    public void ronda(){
        
     
        for (int i=0; i<jugadores.length;i++){
            if (jugadores[i].vivo = true){
               
          
          jugadores[i].disparar(revolver);   
              
            }
      }   
        
      
    }
    
 

    
}
