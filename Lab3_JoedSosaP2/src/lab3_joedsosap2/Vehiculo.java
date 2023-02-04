/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_joedsosap2;

/**
 *
 * @author joeds
 */
public class Vehiculo {
    protected String color;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precio;
    protected int numLlantas;

    public Vehiculo() {
    }

    public Vehiculo(String color, String marca, String modelo, int año, double precio, int numLlantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.numLlantas = numLlantas;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", precio=" + precio + ", numLlantas=" + numLlantas + '}';
    }
    
    
}
