/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4e48;
import java.util.*;
public class Equipo {
    private String name;
    private static double time;
    private String P;
    Vector ListaC;
    
    public Equipo(String name, String P) {
        this.name = name;
        this.P = P;
        time = 0; 
        ListaC = new Vector(); 
     }
    public String getName() {
        return name;
        }
    public void setName(String name) {
        this.name = name;
        }
    private String getPais() {
        return P;
        }
    private void setPais(String P) {
        this.P = P;
    }
    public void añadirCiclista(Ciclista ciclista) {
        ListaC.add(ciclista);
        }
    public void listarEquipo() {
        for (int i = 0; i < ListaC.size(); i++) {
        Ciclista c = (Ciclista) ListaC.elementAt(i);
        System.out.println(c.getName());
        }
    }
    public void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.next();
        for (int i = 0; i < ListaC.size(); i++) {
        Ciclista c = (Ciclista) ListaC.elementAt(i);
        if (c.getName().equals(nombreCiclista)) {
        System.out.println(c.getName());
        }
    }
    }
    public void calcularTime() {
        for (int i = 0; i < ListaC.size(); i++) {
        Ciclista c = (Ciclista) ListaC.elementAt(i);
        time = time + c.getTimeA();
        }
    }
    public void imprimir() {
        System.out.println("Nombre del equipo = " + name);
        System.out.println("Pais = " + P);
        System.out.println("Tiempo total del equipo = " + time);
        }
}
