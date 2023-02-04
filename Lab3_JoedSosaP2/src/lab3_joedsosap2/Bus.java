/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_joedsosap2;

/**
 *
 * @author joeds
 */
public class Bus extends Vehiculo {
    private String tipo;
    private int cantpasa;

    public Bus(String color1, String marca1, String modelo1, int año1, int par, int pasajeros) {
    }

    public Bus( int cantpasa, String color, String marca, String modelo, int año, double precio, int numLlantas) {
        super(color, marca, modelo, año, precio, numLlantas);
        this.tipo = tipo;
        this.cantpasa = cantpasa;
        setTipo(cantpasa);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int cantpasa) {
        this.tipo = tipo;
        if(cantpasa >51){
            this.tipo = "Rapidito";
        }else{
            this.tipo = "De Ruta";
        }  
                    
                    
        
    }

    public int getCantpasa() {
        return cantpasa;
    }

    public void setCantpasa(int cantpasa) {
        this.cantpasa = cantpasa;
    }

    @Override
    public String toString() {
        return "Bus{" + "tipo=" + tipo + ", cantpasa=" + cantpasa + '}';
    }
    
}
