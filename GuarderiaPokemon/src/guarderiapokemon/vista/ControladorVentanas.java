/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guarderiapokemon.vista;

import javax.swing.JFrame;

/**
 *
 * @author frangarcia
 */
public class ControladorVentanas {
    //-------------------------------------------------
    // Atributos
    //-------------------------------------------------
    public static final ControladorVentanas instance = new ControladorVentanas();
    private final PantallaCarga pantallaCarga;
    private final PantallaInicio pantallaInicio;

    
    //-------------------------------------------------
    // Constructor
    //-------------------------------------------------
    private ControladorVentanas(){
        pantallaCarga = new PantallaCarga();
        pantallaInicio = new PantallaInicio();
    }
    
    
    
    //-------------------------------------------------
    // Funcionalidades
    //-------------------------------------------------
    public void abrirCerrarInitialView(boolean abrir){
        pantallaCarga.setVisible(abrir);
    }
    
    public void abrirCerrarMainView(JFrame ventanaOrigen, boolean abrir){
        pantallaInicio.setVisible(abrir);
        if(ventanaOrigen!= null){
            ventanaOrigen.setVisible(!abrir);
        }
    }
    

}
