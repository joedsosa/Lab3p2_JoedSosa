/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_joedsosap2;

/**
 *
 * @author joeds
 */
public class Camion extends Vehiculo{
    private int cargMax;
    private int altura;
    private boolean retro;

    public Camion(String color, String marca, String modelo, int año, double precio, int numLlantas) {
        super(color, marca, modelo, año, precio, numLlantas);
    }

    public Camion(int cargMax, int altura, boolean retro, String color, String marca, String modelo, int año, double precio, int numLlantas) {
        super(color, marca, modelo, año, precio, numLlantas);
        this.cargMax = cargMax;
        this.altura = altura;
        this.retro = retro;
    }

    

   

    public int getCargMax() {
        return cargMax;
    }

    public void setCargMax(int cargMax) {
        this.cargMax = cargMax;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetro() {
        return retro;
    }

    public void setRetro(boolean retro) {
        this.retro = retro;
    }

    @Override
    public String toString() {
        return "Camion{" + "cargMax=" + cargMax + ", altura=" + altura + ", retro=" + retro + '}';
    }
    
}
