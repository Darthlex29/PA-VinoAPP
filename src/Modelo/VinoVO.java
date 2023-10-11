/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DAVID MOLINA
 */
public class VinoVO {
    int codigo;
    String nombre, casaproductora,pais, color,edad,niveldeazucar,
            cepadevinos,gascarbonico,crianza,metododeelaboracion;

    public VinoVO(int codigo, String nombre, String casaproductora, String pais, String color, String edad, String niveldeazucar, String cepadevinos, String gascarbonico, String crianza, String metododeelaboracion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.casaproductora = casaproductora;
        this.pais = pais;
        this.color = color;
        this.edad = edad;
        this.niveldeazucar = niveldeazucar;
        this.cepadevinos = cepadevinos;
        this.gascarbonico = gascarbonico;
        this.crianza = crianza;
        this.metododeelaboracion = metododeelaboracion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public VinoVO(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCasaproductora() {
        return casaproductora;
    }

    public void setCasaproductora(String casaproductora) {
        this.casaproductora = casaproductora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNiveldeazucar() {
        return niveldeazucar;
    }

    public void setNiveldeazucar(String niveldeazucar) {
        this.niveldeazucar = niveldeazucar;
    }

    public String getCepadevinos() {
        return cepadevinos;
    }

    public void setCepadevinos(String cepadevinos) {
        this.cepadevinos = cepadevinos;
    }

    public String getGascarbonico() {
        return gascarbonico;
    }

    public void setGascarbonico(String gascarbonico) {
        this.gascarbonico = gascarbonico;
    }

    public String getCrianza() {
        return crianza;
    }

    public void setCrianza(String crianza) {
        this.crianza = crianza;
    }

    public String getMetododeelaboracion() {
        return metododeelaboracion;
    }

    public void setMetododeelaboracion(String metododeelaboracion) {
        this.metododeelaboracion = metododeelaboracion;
    }
    
    public void limpiarDatos(){
        this.nombre = "";
        this.casaproductora = "";
        this.pais = "";
        this.color = "";
        this.edad = "";
        this.niveldeazucar = "";
        this.cepadevinos = "";
        this.gascarbonico = "";
        this.crianza = "";
        this.metododeelaboracion = "";
    }

    @Override
    public String toString() {
        return "VinoVO{" + "codigo=" + codigo + ", nombre=" + nombre + ", casaproductora=" + casaproductora + ", pais=" + pais + ", color=" + color + ", edad=" + edad + ", niveldeazucar=" + niveldeazucar + ", cepadevinos=" + cepadevinos + ", gascarbonico=" + gascarbonico + ", crianza=" + crianza + ", metododeelaboracion=" + metododeelaboracion + '}';
    }
    
    
}
