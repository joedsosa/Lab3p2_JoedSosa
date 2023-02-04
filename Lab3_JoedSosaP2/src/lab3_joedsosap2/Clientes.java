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
public class Clientes {

    
   private int identi;
   private String nom;
   ArrayList<Vehiculo> vehicleowned = new ArrayList();
   private double saldo;

    public Clientes() {
    }

    public Clientes(int identi, String nom, double saldo) {
        this.identi = identi;
        this.nom = nom;
        this.saldo = saldo;
    }

   
    public int getIdenti() {
        return identi;
    }

    public void setIdenti(int identi) {
        this.identi = identi;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVehicleowned(ArrayList<Vehiculo> vehicleowned) {
        this.vehicleowned = vehicleowned;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Vehiculo> getVehicleowned() {
        return vehicleowned;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "identi=" + identi + ", nom=" + nom + ", vehicleowned=" + vehicleowned + ", saldo=" + saldo + '}';
    }
   
}
