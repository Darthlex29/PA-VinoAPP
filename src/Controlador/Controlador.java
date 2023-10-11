/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.ArrayList;
import Modelo.VinoVO;
import Vista.Interfaz;
import Vista.InterfazAgregar;
import Vista.InterfazAleatorio;
import Vista.InterfazFunciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import javax.swing.ButtonGroup;
/**
 *
 * @author DAVID MOLINA
 * public class Controlador implements ActionListener {
 */
public class Controlador implements ActionListener{

    private VinoDAO miVinoDAO;
    private VinoVO miVino;
    private Interfaz ventana1;
    private InterfazAgregar ventana2;
    private InterfazFunciones ventana3;
    private InterfazAleatorio ventana4;
    private int Contador = 0, opcion = 0, buscador = 0;
    boolean salir = false, modopciones = true;
    String caracteristica, maridaje;
    ButtonGroup grupoRadioBotones;
    
    private long tamreg, canreg;
    private File fl;
    RandomAccessFile archivo;
    Interfaz Vista;
    
    public Controlador(VinoDAO miVinoDAO, Interfaz ventana1, InterfazAgregar ventana2, InterfazFunciones ventana3) throws IOException{
        
        this.ventana1 = ventana1;
        this.ventana2 = ventana2;
        this.ventana3 = ventana3;
        establecerejemplos();
//        this.vista.menuUsuario(this);
        this.miVinoDAO = miVinoDAO;
        
        ventana4 = new InterfazAleatorio(this);
        this.tamreg = 58;
        this.canreg = 0;
        try {
            fl = ventana4.cargar();
            archivo = new RandomAccessFile(fl, "rw");
        } catch (FileNotFoundException fnfe) {
            this.ventana2.mostrarMensaje("Archivo no encontrado. ");
        } catch (NullPointerException NuPE){
            this.ventana2.mostrarMensaje("Archivo no seleccionado. ");
        }
        
        this.ventana1.btnmodificarVino.addActionListener((ActionListener) this);
        this.ventana1.btnAgregarVino.addActionListener((ActionListener) this);
        this.ventana1.btnMostrarVino.addActionListener((ActionListener) this);
        this.ventana1.btnEliminarVino.addActionListener((ActionListener) this);
        this.ventana1.btnSalir.addActionListener((ActionListener) this);
        this.ventana1.btnBuscarVino1.addActionListener((ActionListener) this);
        
        this.ventana2.btnRadio1.addActionListener((ActionListener) this);
        this.ventana2.btnRadio2.addActionListener((ActionListener) this);
        this.ventana2.btnRadio3.addActionListener((ActionListener) this);
        this.ventana2.btnRadio4.addActionListener((ActionListener) this);
        this.ventana2.btnRadio5.addActionListener((ActionListener) this);
        this.ventana2.btnRadio6.addActionListener((ActionListener) this);
        this.ventana2.btnContinuar.addActionListener((ActionListener) this);
        this.ventana2.btnVAM.addActionListener((ActionListener) this);
        this.ventana2.btnSalir.addActionListener((ActionListener) this);
        this.ventana2.btnLimpiar.addActionListener((ActionListener) this);
        
        this.ventana3.btnRadio1.addActionListener((ActionListener) this);
        this.ventana3.btnRadio2.addActionListener((ActionListener) this);
        this.ventana3.btnRadio3.addActionListener((ActionListener) this);
        this.ventana3.btnRadio4.addActionListener((ActionListener) this);
        this.ventana3.btnRadio5.addActionListener((ActionListener) this);
        this.ventana3.btnRadio6.addActionListener((ActionListener) this);
        this.ventana3.btnBuscar.addActionListener((ActionListener) this);
        this.ventana3.btnconfirmar.addActionListener((ActionListener) this);
        this.ventana3.btnSalir.addActionListener((ActionListener) this);
        this.ventana3.btnVAM.addActionListener((ActionListener) this);
        this.ventana3.btnMaridaje.addActionListener((ActionListener) this);
        
        grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(ventana2.btnRadio1);
        grupoRadioBotones.add(ventana2.btnRadio2);
        grupoRadioBotones.add(ventana2.btnRadio3);
        grupoRadioBotones.add(ventana2.btnRadio4);
        grupoRadioBotones.add(ventana2.btnRadio5);
        grupoRadioBotones.add(ventana2.btnRadio6);
        grupoRadioBotones.add(ventana3.btnRadio1);
        grupoRadioBotones.add(ventana3.btnRadio2);
        grupoRadioBotones.add(ventana3.btnRadio3);
        grupoRadioBotones.add(ventana3.btnRadio4);
        grupoRadioBotones.add(ventana3.btnRadio5);
        grupoRadioBotones.add(ventana3.btnRadio6);
    }
 
    private void obtenerRegistros() {
        miVinoDAO = new VinoDAO();
        VinoVO miVino;
        ArrayList<VinoVO> listaVinos = miVinoDAO.listaDeVinos();
        ventana1.limpiarTablav1();
        if (listaVinos.size() > 0) {
            int numeroVino = 0;
            for (int i = 0; i < listaVinos.size(); i++) {
                numeroVino++;
                miVino = listaVinos.get(i);
//                System.out.println("****************Vino No. " + numeroVino + "**********");
//                vista.imprimirVino(miVino);
                pasarDatos(miVino);
            }
        } else {
            ventana2.mostrarMensaje("Actualmente no existen registros de ese vino");
        }
    }

    private void buscarVino(int codigo) {
        miVinoDAO = new VinoDAO();
        VinoVO vinoEncontrado = miVinoDAO.consultarVino("vino","codigo",codigo);
        if (vinoEncontrado != null) {
            ventana3.cambiotx("buscarvino", imprimirVino(vinoEncontrado));
            System.out.println(vinoEncontrado.getCepadevinos());
            maridaje=textoMaridaje(miVinoDAO.consultarMaridaje(vinoEncontrado.getCepadevinos()));
        } else {
            ventana2.mostrarMensaje("No existen un vino con ese nombre");
        }
    }
    
    private void modificarVino(int codigo, String dato, String cambio) {
        VinoVO vinoEncontrado = miVinoDAO.consultarVino("vino","codigo",codigo);
        if (vinoEncontrado != null) {
            ventana3.cambiotx("vinomodificado1",imprimirVino(vinoEncontrado));
            if (miVinoDAO.modificarVino(codigo, dato, cambio)) {
                vinoEncontrado = miVinoDAO.consultarVino("vino","codigo",codigo);
                ventana3.cambiotx("vinomodificado2",imprimirVino(vinoEncontrado));
            } else {
                ventana2.mostrarMensaje("No se pudo modificar el vino");
            }
        } else {
            ventana2.mostrarMensaje("No existen vinos con ese codigo");
        }
    }

    private void eliminarVino(int codigo, boolean imprimir) {
        VinoVO vinoEncontrado = miVinoDAO.consultarVino("vino","nombre",codigo);
        if (vinoEncontrado != null) {
            
            if(imprimir){
                ventana3.cambiotx("vinoeliminado",imprimirVino(vinoEncontrado));
            }
            if (miVinoDAO.eliminarVino(codigo)) {
                if(imprimir){
                    ventana2.mostrarMensaje("Vino Eliminado");
                }
            } else {
                ventana2.mostrarMensaje("No se pudo eliminar el vino");
            }
        } else {
            ventana2.mostrarMensaje("No existen un vino con ese codigo");
        }
    }
    
    private void establecerejemplos(){
        Properties propiedades = new Properties();
        InputStream entrada = null;
        try {
            entrada = new FileInputStream("C:\\Users\\DAVID MOLINA\\Documents\\NetBeansProjects\\Wine App\\src\\newproperties.properties"); //ruta
            propiedades.load(entrada);
            for(int i = 1; i<=3; i++){
                miVinoDAO = new VinoDAO();
                VinoVO vinoEjemplo = new VinoVO();
                vinoEjemplo.setCodigo(i);
                vinoEjemplo.setNombre(propiedades.getProperty("Vino"+i+".nombre"));
                vinoEjemplo.setCasaproductora(propiedades.getProperty("Vino"+i+".casaproductora"));
                vinoEjemplo.setPais(propiedades.getProperty("Vino"+i+".pais"));
                vinoEjemplo.setColor(propiedades.getProperty("Vino"+i+".color"));
                vinoEjemplo.setEdad(propiedades.getProperty("Vino"+i+".edad"));
                vinoEjemplo.setNiveldeazucar(propiedades.getProperty("Vino"+i+".niveldeazucar"));
                vinoEjemplo.setCepadevinos(propiedades.getProperty("Vino"+i+".cepadevinos"));
                vinoEjemplo.setGascarbonico(propiedades.getProperty("Vino"+i+".gascarbonico"));
                vinoEjemplo.setCrianza(propiedades.getProperty("Vino"+i+".crianza"));
                vinoEjemplo.setMetododeelaboracion(propiedades.getProperty("Vino"+i+".metododeelaboracion"));
                miVinoDAO.insertarDatos(vinoEjemplo); 
                pasarDatos(vinoEjemplo);
                vinoEjemplo.limpiarDatos();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (entrada != null) {
                try {
                    entrada.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void limpiarTabla(){
        miVinoDAO = new VinoDAO();
        ArrayList<VinoVO> listaVinos = miVinoDAO.listaDeVinos();
        miVino = new VinoVO();
        for(int i = 1; i <= listaVinos.size();i++){ 
            miVino = miVinoDAO.consultarVino("vino","nombre",i);
            imprimirVino(miVino);
            try {
                escribir(miVino);
            } catch (NullPointerException e) { 
                System.out.println("Error aqui");
            }
            eliminarVino(i, false);
            
        }
        
    }
    
    public void pasarDatos(VinoVO vinito){
        Object [] vino = new Object[11];
        vino[0] = vinito.getCodigo();
        vino[1] = vinito.getNombre();
        vino[2] = vinito.getCasaproductora();
        vino[3] = vinito.getPais();
        vino[4] = vinito.getColor();
        vino[5] = vinito.getEdad();
        vino[6] = vinito.getNiveldeazucar();
        vino[7] = vinito.getCepadevinos();
        vino[8] = vinito.getGascarbonico();
        vino[9] = vinito.getCrianza();
        vino[10] = vinito.getMetododeelaboracion();
        ventana1.actualizarTabla(vino);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        miVinoDAO = new VinoDAO();
        VinoVO miVino1 = new VinoVO();
        ArrayList<VinoVO> listaVinos = miVinoDAO.listaDeVinos();
        miVino1.setCodigo(listaVinos.size() + 1);
        if (e.getSource() == this.ventana1.btnAgregarVino){
            ventana2.setVisible(true);
            ventana1.setVisible(false);
            ventana2.cambios(Contador);
            this.miVino = new VinoVO();
        }
        if (e.getSource() == this.ventana1.btnMostrarVino){
            obtenerRegistros();
        }
        if (e.getSource() == this.ventana1.btnBuscarVino1){
            ventana3.setVisible(true);
            ventana1.setVisible(false);
            ventana2.setVisible(false);
            ventana3.cambiotx("buscar","");
            buscador = 1;
        }
        if (e.getSource() == this.ventana1.btnmodificarVino){
            ventana3.setVisible(true);
            ventana1.setVisible(false);
            ventana2.setVisible(false);
            ventana3.cambiotx("modificar","");
            buscador = 2;
        }
        if (e.getSource() == this.ventana1.btnEliminarVino){
            ventana3.setVisible(true);
            ventana1.setVisible(false);
            ventana2.setVisible(false);
            ventana3.cambiotx("buscar","");
            buscador = 3;
        }
        
        if (e.getSource() == this.ventana1.btnSalir || e.getSource() == this.ventana2.btnSalir || e.getSource() == this.ventana3.btnSalir){
            limpiarTabla();
            this.ventana2.mostrarMensaje("¡Gracias por usar el programa!");
            this.ventana1.dispose();
            this.ventana1.setVisible(false);
            this.ventana2.dispose();
            this.ventana2.setVisible(false);
            this.ventana3.dispose();
            this.ventana3.setVisible(false);
            System.exit(0);
        }
        
        //ventana2________________________________________________________________
        if (e.getSource() == this.ventana2.btnRadio1) {
            caracteristica = this.ventana2.btnRadio1.getText();

            recogerDatos(Contador, miVino, caracteristica);
        }
        if (e.getSource() == this.ventana2.btnRadio2) {
            caracteristica = this.ventana2.btnRadio2.getText();

            recogerDatos(Contador, miVino, caracteristica);
        }
        if (e.getSource() == this.ventana2.btnRadio3) {
            caracteristica = this.ventana2.btnRadio3.getText();
            recogerDatos(Contador, miVino, caracteristica);
        }
        if (e.getSource() == this.ventana2.btnRadio4) {
            caracteristica = this.ventana2.btnRadio4.getText();
            recogerDatos(Contador, miVino, caracteristica);
        }
        if (e.getSource() == this.ventana2.btnRadio5) {
            caracteristica = this.ventana2.btnRadio5.getText();
            recogerDatos(Contador, miVino, caracteristica);
        }
        if (e.getSource() == this.ventana2.btnRadio6) {
            caracteristica = this.ventana2.btnRadio6.getText();
            recogerDatos(Contador, miVino, caracteristica);
        }
        if (e.getSource() == this.ventana2.btnContinuar) {
            recogerDatos(Contador, miVino, caracteristica);
            Contador++;
            ventana2.cambios(Contador);
            grupoRadioBotones.clearSelection();
            ventana2.verificadorNull();
            if(Contador>7){
                ventana1.setVisible(true);
                ventana2.setVisible(false);
                Contador=1;
                miVinoDAO.insertarDatos(miVino);
                
                pasarDatos(miVino);
            }
        }
        if(e.getSource() == this.ventana2.btnVAM || e.getSource() == this.ventana3.btnVAM){
            ventana1.setVisible(true);
            ventana2.setVisible(false);
            ventana3.setVisible(false);
            Contador=0;
            limpiarDatos();
        }
        
        if(e.getSource() == this.ventana2.btnLimpiar){
            limpiarDatos();
            ventana2.cambios(Contador);
        }
        
        //3ra ventana______________________________________________________________ 
        
        if (e.getSource() == this.ventana3.btnRadio1) {
            caracteristica = this.ventana3.btnRadio1.getText();
        }
        if (e.getSource() == this.ventana3.btnRadio2) {
            caracteristica = this.ventana3.btnRadio2.getText();
        }
        if (e.getSource() == this.ventana3.btnRadio3) {
            caracteristica = this.ventana3.btnRadio3.getText();
        }
        if (e.getSource() == this.ventana3.btnRadio4) {
            caracteristica = this.ventana3.btnRadio4.getText();
        }
        if (e.getSource() == this.ventana3.btnRadio5) {
            caracteristica = this.ventana3.btnRadio5.getText();
        }
        if (e.getSource() == this.ventana3.btnRadio6) {
            caracteristica = this.ventana3.btnRadio6.getText();
        }
        if(e.getSource() == this.ventana3.btnBuscar) {
            funcionDeFunciones(); 
        }
        if(e.getSource() == this.ventana3.btnconfirmar){
            String dato;
            dato = this.ventana3.jCElementos.getSelectedItem().toString();
            if(modopciones==true){
                modificarVino(Integer.parseInt(this.ventana3.jTVinoSele.getText()),datoCambio(dato),caracteristica);
            }else{
                modificarVino(Integer.parseInt(this.ventana3.jTVinoSele.getText()),datoCambio(dato),this.ventana3.jTmodificacion.getText());
            }
        }
        if(e.getSource() == this.ventana3.btnMaridaje){
            ventana3.cambiotx("maridaje", maridaje);
        }
    }
    
    public String imprimirVino(VinoVO vinoEncontrado){
        String vino="";
        try {
             vino = "Nombre del Vino: " + vinoEncontrado.getNombre() + 
                "<br>Casa productora del Vino: " + vinoEncontrado.getCasaproductora()+
                "<br>Pais de origen del vino:  " + vinoEncontrado.getPais()+ 
                "<br>Color del vino: " + vinoEncontrado.getColor()+"<br>Edad del vino: " 
                + vinoEncontrado.getEdad()+"<br>Nivel de azucar del vino: " + vinoEncontrado.getNiveldeazucar()
                + "<br>Cepa de vinos: " + vinoEncontrado.getCepadevinos()+
                "<br>Gas carbonico del vino: " + vinoEncontrado.getGascarbonico()+
                "<br>Crianza del vino: " + vinoEncontrado.getCrianza()+
                "<br>Metodo de elaboracion del vino: " + vinoEncontrado.getMetododeelaboracion();
        } catch (NullPointerException e) {
            ventana2.mostrarMensaje("No hay vinos registrados con esa caracteristica");
        }
        
        return vino;
    }
    
    public String textoMaridaje(Object[] maridaje){
        String elAcompañante = "Este vino puede ser acompañado de: "+maridaje[1]
                +" con "+ maridaje[2] +" o con " +maridaje[3]+" acompañado de: "
                +maridaje[4]+" y "+maridaje[5];
        return elAcompañante;
    }
    
    public void funcionDeFunciones(){
        verificadorInt();
            if(buscador==1){
                buscarVino(verificadorInt());
            }
            if(buscador==2){
                String dato;
                
                dato = this.ventana3.jCElementos.getSelectedItem().toString();
                if(dato.equals("Nombre")||dato.equals("Casa Productora")||dato.equals("Pais")){
                    modopciones = false;
                    
                }
                ventana3.cambios(dato);
            }
            if(buscador==3){
                eliminarVino(verificadorInt(), true);
            }
    }
    
    public int verificadorInt() {
        int cod = 1;
        try {
            cod = Integer.parseInt(this.ventana3.jTVinoSele.getText());
        } catch (NumberFormatException e) {
            this.ventana3.mensajeErrorLetras("Debes ingresar numeros");
        }
        return cod;
    }
    
    public void recogerDatos(int Contador, VinoVO miVino, String caracteristica){
        Object [] dato = new Object[2];
        switch (Contador){
            case 0: {
                ArrayList<VinoVO> listaVinos = miVinoDAO.listaDeVinos();
                miVino.setCodigo(listaVinos.size() + 1);
                miVino.setNombre(this.ventana2.tfNombreV.getText());
                miVino.setCasaproductora(this.ventana2.tfcasaproductora.getText());
                miVino.setPais(this.ventana2.tfpais.getText());
                break;
            }
            case 1: {
                dato = miVinoDAO.consultarDato(caracteristica, "color");
                String informacion = "<html><body>"+(String) dato[1]+"</body></html>";
                ventana2.jLInformacion.setText(informacion);
                miVino.setColor((String) dato[0]);
                break;
            }
            case 2:{
                dato = miVinoDAO.consultarDato(caracteristica, "edad");
                String informacion = "<html><body>"+(String) dato[1]+"</body></html>";
                ventana2.jLInformacion.setText(informacion); 
                miVino.setEdad((String) dato[0]);
                break;
                
            }
            case 3:{
                dato = miVinoDAO.consultarDato(caracteristica, "niveldeazucar");
                String informacion = "<html><body>"+(String) dato[1]+"</body></html>";
                ventana2.jLInformacion.setText(informacion);
                miVino.setNiveldeazucar((String) dato[0]);
                break;
            }
            case 4:{
                dato = miVinoDAO.consultarDato(caracteristica, "cepadevinos");
                String informacion = "<html><body>"+(String) dato[1]+"</body></html>";
                ventana2.jLInformacion.setText(informacion);
                miVino.setCepadevinos((String) dato[0]);
                
                break; 
            }
            case 5:{
                dato = miVinoDAO.consultarDato(caracteristica, "niveldegascarbonico");
                String informacion = "<html><body>"+(String) dato[1]+"</body></html>";
                ventana2.jLInformacion.setText(informacion);
                miVino.setGascarbonico((String) dato[0]);
                break;
            }
            case 6:{
                dato = miVinoDAO.consultarDato(caracteristica, "crianza");
                String informacion = "<html><body>"+(String) dato[1]+"</body></html>";
                ventana2.jLInformacion.setText(informacion);
                miVino.setCrianza((String) dato[0]);
                break;
            }
            case 7:{
                dato = miVinoDAO.consultarDato(caracteristica, "metododeelaboracion");
                String informacion = "<html><body>"+(String) dato[1]+"</body></html>";
                ventana2.jLInformacion.setText(informacion);
                miVino.setMetododeelaboracion((String) dato[0]);
                break;
            }
        }
    }
    
    public String datoCambio(String dato){
        switch (dato){
            case "Nombre" -> {
                return "nombre";
            }
            case "Casa Productora" -> {
                return "casaproductora";
            }
            case "Pais" -> {
                return "pais";
            }
            
            case "Color" -> {
                return "color";
            }
            case "Edad" -> {
                return "edad";
            }
            case "Nivel de azucar" -> {
                return "niveldeazucar";
            }
            case "Cepa de vinos" -> {
                return "cepadevinos";
            }
            case "Gas carbonico" -> {
                return "gascarbonico";
            }
            case "Crianza" -> {
                return "crianza";
            }
            case "Metodo de elaboracion" -> {
                return "metododeelaboracion";
            }
        }
        return "";
    }
    
    public void escribir(VinoVO vinoEncontrado) {
        try {
            //nombre
            int clave = vinoEncontrado.getCodigo();
            String nombre = vinoEncontrado.getNombre();
            String casaproductora = vinoEncontrado.getCasaproductora();
            String pais = vinoEncontrado.getPais();
            String edad = vinoEncontrado.getEdad();
            String color = vinoEncontrado.getColor();
            String nivelazucar = vinoEncontrado.getNiveldeazucar();
            String cepavinos = vinoEncontrado.getCepadevinos();
            String gascarbonico = vinoEncontrado.getGascarbonico();
            String crianza = vinoEncontrado.getCrianza();
            String metodoelaboracion = vinoEncontrado.getMetododeelaboracion();
            
            if (archivo.length() != 0) {
                archivo.seek(archivo.length());
            }
            
            archivo.writeInt(clave);
            archivo.writeChars(nombre);
            archivo.writeChars(casaproductora);
            archivo.writeChars(pais);
            archivo.writeChars(edad);
            archivo.writeChars(color);
            archivo.writeChars(nivelazucar);
            archivo.writeChars(cepavinos);
            archivo.writeChars(gascarbonico);
            archivo.writeChars(crianza);
            archivo.writeChars(metodoelaboracion);


        } catch (FileNotFoundException fnfe) {
            ventana2.mostrarMensaje("Archivo no encontrado");
        } catch (IOException ioe) {
            ventana2.mostrarMensaje("Error al escribir");
        }

    }
    
    public String stringAleatorio(String vino){
        if (vino.length() < 25) {
            for (int i = vino.length(); i < 25; i++) {
                vino = vino + " ";
            }
        } else {
            vino = vino.substring(0, 41);
        }
        return vino;
    }
    
    public void mandarMensaje (String msj){
        ventana2.mostrarMensaje(msj);
    }
    
    public void limpiarDatos (){
        grupoRadioBotones.clearSelection();
        miVino.setCasaproductora("");
        miVino.setCepadevinos("");
        miVino.setCodigo(0);
        miVino.setColor("");
        miVino.setCrianza("");
        miVino.setEdad("");
        miVino.setGascarbonico("");
        miVino.setMetododeelaboracion("");
        miVino.setNiveldeazucar("");
        miVino.setNombre("");
        miVino.setPais("");
        Contador=0;
        caracteristica="";
        buscador=0;
        opcion=0;
        ventana2.limpiarDatos();
        ventana3.limpiardatos();
    }

}
