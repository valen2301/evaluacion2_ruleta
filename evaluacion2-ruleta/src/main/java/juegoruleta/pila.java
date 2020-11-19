/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoruleta;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class pila {
    
    private Nodo ultimovaloringresado;
    int tamano = 0;
    String lista = "";
    
    public pila(){
        ultimovaloringresado = null;
        tamano = 0;
    }
    
    public void InsertarNodo(int nodo){
        
        Nodo nuevo_nodo = new Nodo (nodo);
        nuevo_nodo.siguiente = ultimovaloringresado;
        ultimovaloringresado = nuevo_nodo;
        tamano++;
        
    }
    
    public void MV (){
        
        Nodo recorrido = ultimovaloringresado;
        while (recorrido != null){
            lista+= recorrido.informacion+"\n";
            recorrido = recorrido.siguiente;
        }
        
        JOptionPane.showInputDialog(null, lista);
        lista = "";
    }
    
}
