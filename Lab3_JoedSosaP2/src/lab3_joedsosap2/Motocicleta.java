/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_joedsosap2;

/**
 *
 * @author joeds
 */
public class Motocicleta extends Vehiculo{
    private boolean motorElectrico;
    private String Desp;

    public Motocicleta(String color, String marca, String modelo, int año, double precio, int numLlantas) {
        super(color, marca, modelo, año, precio, numLlantas);
    }

    public Motocicleta(boolean motorElectrico, String Desp, String color, String marca, String modelo, int año, double precio, int numLlantas) {
        super(color, marca, modelo, año, precio, numLlantas);
        this.motorElectrico = motorElectrico;
        this.Desp = Desp;
    }

    public boolean isMotorElectrico() {
        return motorElectrico;
    }

    public void setMotorElectrico(boolean motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    public String getDesp() {
        return Desp;
    }

    public void setDesp(String Desp) {
        this.Desp = Desp;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "motorElectrico=" + motorElectrico + ", Desp=" + Desp + '}';
    }

   

}

    
    
