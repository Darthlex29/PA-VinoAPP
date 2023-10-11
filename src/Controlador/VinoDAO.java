/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Modelo.VinoVO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAVID MOLINA
 */
public class VinoDAO {

    private Connection con;
    private Statement st;
    private ResultSet rs;
    private Controlador cr;

    public VinoDAO() {
        con = null;
        st = null;
        rs = null;
    }
    //tabla = tabla a buscar, columna = la columna donde voy a buscar el aspecto que ingreso. 
    public VinoVO consultarVino(String tabla, String columna, int codigo) {
        VinoVO vino = null;
        String consulta = "SELECT * FROM vino where codigo=" + codigo +"";
        try {
            con = (Connection) Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                vino = new VinoVO();
                vino.setCodigo(Integer.parseInt(rs.getString("codigo")));
                vino.setNombre(rs.getString("nombre"));
                vino.setCasaproductora(rs.getString("casaproductora"));
                vino.setPais(rs.getString("pais"));
                vino.setColor(rs.getString("color"));
                vino.setEdad(rs.getString("edad"));
                vino.setNiveldeazucar(rs.getString("niveldeazucar"));
                vino.setCepadevinos(rs.getString("cepadevinos"));
                vino.setGascarbonico(rs.getString("gascarbonico"));
                vino.setCrianza(rs.getString("crianza"));
                vino.setMetododeelaboracion(rs.getString("metododeelaboracion"));
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            cr.mandarMensaje("No se pudo realizar la consulta");
        }
        return vino;
    }
    
    
    public Object[] consultarDato(String caracteristica, String Tabla){
        Object [] dato = new Object[3];
        String consulta = "SELECT * FROM "+Tabla+" WHERE caracteristica='" + caracteristica +"'";
        try {
            con = (Connection) Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                dato[0]=(rs.getString("caracteristica"));
                dato[1]=((rs.getString("descripcion")));
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la consulta");
        }
        return dato;
    } 
    public Object[] consultarMaridaje(String cepadevinos){
        String Tabla = "Maridaje";
        Object [] dato = new Object[7];
        String consulta = "SELECT * FROM "+Tabla+" WHERE cepadevinos='" + cepadevinos +"'";
//        String consulta = "SELECT * FROM maridaje WHERE cepadevinos='" + caracteristica +"'";
        try {
            con = (Connection) Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                dato[0]=(rs.getString("cepadevinos"));
                dato[1]=(rs.getString("QuesoNueces"));
                dato[2]=((rs.getString("CarneAves")));
                dato[3]=(rs.getString("Comidademar"));
                dato[4]=((rs.getString("salsas")));
                dato[5]=((rs.getString("hierbasespecias")));
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la consulta");
        }
        return dato;
    } 

    
    public ArrayList<VinoVO> listaDeVinos() {
        ArrayList<VinoVO> misVinos = new ArrayList<VinoVO>();
        String consulta = "SELECT * FROM Vino";
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                VinoVO vinito = new VinoVO();
                vinito.setCodigo(rs.getInt("codigo"));
                vinito.setNombre(rs.getString("nombre"));
                vinito.setCasaproductora(rs.getString("casaproductora"));
                vinito.setPais(rs.getString("pais"));
                vinito.setColor(rs.getString("color"));
                vinito.setEdad(rs.getString("edad"));
                vinito.setNiveldeazucar(rs.getString("niveldeazucar"));
                vinito.setCepadevinos(rs.getString("cepadevinos"));
                vinito.setGascarbonico(rs.getString("gascarbonico"));
                vinito.setCrianza(rs.getString("crianza"));
                vinito.setMetododeelaboracion(rs.getString("metododeelaboracion"));
                misVinos.add(vinito);
            }
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            cr.mandarMensaje("No se pudo realizar la consulta");
        }
        return misVinos;
    }

    
    public void insertarDatos(VinoVO vino) {
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            String insercion = "INSERT INTO vino VALUES( " + vino.getCodigo() + 
                    ",'" + vino.getNombre() + "','" + vino.getCasaproductora()+ "','" + 
                    vino.getPais()+ "','" + vino.getColor() + "','" + vino.getEdad() + "','" +
                    vino.getNiveldeazucar() + "','" + vino.getCepadevinos() + "','" +
                    vino.getGascarbonico() + "','" + vino.getCrianza() + "','" +
                    vino.getMetododeelaboracion() + "')";
            st.executeUpdate(insercion);
            st.close();
            Conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("No se pudo realizar la insercion");
        }
    }
     
    public boolean modificarVino(int codigo, String dato, String cambio) {
        String consulta = "update vino set "+dato+"= '"+ cambio +"' where codigo=" + codigo + "";
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            st.executeUpdate(consulta);
            st.close();
            Conexion.desconectar();
            return true;
        } catch (SQLException ex) {
            cr.mandarMensaje("No se pudo realizar la modifcacion");
        }
        return false;
    }
    
    public boolean eliminarVino(int codigo) {
        String consulta = "DELETE FROM vino where codigo=" + codigo +"";
        try {
            con = Conexion.getConexion();
            st = con.createStatement();
            st.executeUpdate(consulta);
            st.close();
            Conexion.desconectar();
            return true;
        } catch (SQLException ex) {
            cr.mandarMensaje("No se pudo realizar la eliminacion");
        }
        return false;
    }
}

