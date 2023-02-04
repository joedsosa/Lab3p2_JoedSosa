/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_joedsosap2;

/**
 *
 * @author joeds
 */
public class Bicicleta extends Vehiculo{
    private String descripcion;
    private String tipo;
    private int radio;

    public Bicicleta(String color, String marca, String modelo, int año, double precio, int numLlantas) {
        super(color, marca, modelo, año, precio, numLlantas);
    }

    public Bicicleta(String descripcion, String tipo, int radio, String color, String marca, String modelo, int año, double precio, int numLlantas) {
        super(color, marca, modelo, año, precio, numLlantas);
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.radio = radio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "descripcion=" + descripcion + ", tipo=" + tipo + ", radio=" + radio + '}';
    }
    


    

    
   

    

   
    
}
