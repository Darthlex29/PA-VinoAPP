/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.Controlador;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import javax.swing.JFileChooser;

/**
 *
 * @author DAVID MOLINA
 */
public class InterfazAleatorio {
    JFileChooser fc;
    Controlador control;
    InputStreamReader isr;
    BufferedReader teclado;
    private File fl;
    RandomAccessFile archivo;


    public InterfazAleatorio(Controlador archivo) {
        control = archivo;
        isr = new InputStreamReader(System.in);
        teclado = new BufferedReader(isr);
    }
    
    public File cargar() {
        fc = new JFileChooser(System.getProperty("user.dir"));
        fc.showOpenDialog(fc);
        return fc.getSelectedFile();
    }
}