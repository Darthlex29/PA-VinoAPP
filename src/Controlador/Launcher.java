/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Interfaz;
import Vista.InterfazAgregar;
import Vista.InterfazFunciones;
import java.io.IOException;
/**
 *
 * @author DAVID MOLINA
 */
public class Launcher {
    public static void main(String[] args) throws IOException {
        VinoDAO modelo = new VinoDAO();
        Interfaz v1 = new Interfaz();
        InterfazAgregar v2 = new InterfazAgregar();
        InterfazFunciones v3 = new InterfazFunciones();
        v1.setVisible(true);
        v2.setVisible(false);
        v3.setVisible(false);
        Controlador control = new Controlador(modelo,v1,v2, v3);
//        control.iniciar();
        
        
        
        //Se crea un objeto controlador y se le pasa a la vista
        
    }

}
