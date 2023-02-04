/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_joedsosap2;

import java.util.ArrayList;

/**
 *
 * @author joeds
 */
public class Concesionaria {
    private String nombre;
    private int ID;
    private String direc;
    private int saldo;
    private ArrayList<Vehiculo> vehiculos = new ArrayList();
    private ArrayList<Clientes> cliente = new ArrayList();

    public Concesionaria() {
    }

    public Concesionaria(String nombre, int ID, String direc, int saldo) {
        this.nombre = nombre;
        this.ID = ID;
        this.direc = direc;
        this.saldo = saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Clientes> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Clientes> cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombre=" + nombre + ", ID=" + ID + ", direc=" + direc + ", vehiculos=" + vehiculos + ", cliente=" + cliente + '}';
    }
    
}
