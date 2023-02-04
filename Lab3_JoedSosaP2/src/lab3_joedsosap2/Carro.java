/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_joedsosap2;

/**
 *
 * @author joeds
 */
public class Carro extends Vehiculo{
    
    private int puertas;
    private String motor;
    private int maxvel;

    public Carro(String color, String marca, String modelo, int año, double precio, int numLlantas) {
        super(color, marca, modelo, año, precio, numLlantas);
    }

    

    public Carro(int puertas, String motor, int maxvel, String color, String marca, String modelo, int año, double precio, int numLlantas) {
        super(color, marca, modelo, año, precio, numLlantas);
        this.puertas = puertas;
        this.motor = motor;
        this.maxvel = maxvel;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getMaxvel() {
        return maxvel;
    }

    public void setMaxvel(int maxvel) {
        this.maxvel = maxvel;
    }

    @Override
    public String toString() {
        return "Carro{" + "puertas=" + puertas + ", motor=" + motor + ", maxvel=" + maxvel + '}';
    }

  


    

   
    
}
