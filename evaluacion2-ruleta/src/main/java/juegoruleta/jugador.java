/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoruleta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class jugador {

    private int d;
    private jugador[] jugadores;

    private int id;
    private String nombre;
    public boolean vivo;

    public jugador(int id) {

        this.id = id;
        this.nombre = "jugador " + id;
        this.vivo = true;
    }

    public void disparar(revolver r) {
        
    
        if (r.disparar()) {

            this.vivo = false;//muere el jugador
            System.out.println("el " + nombre + " ha sido asesinado...");
            

        } else {
            System.out.println("el " + nombre + " se ha salvado");
        }
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

}
