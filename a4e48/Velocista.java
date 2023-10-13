/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4e48;

public class Velocista extends Ciclista{
    private double pP;
    private double vP;
    
    public Velocista(int identificador, String name, double pP, double vP) {
        super(identificador, name);
        this.pP = pP;
        this.vP = vP;
        }
    protected double getPotenciaPromedio() {
        return pP;
        }
    protected void setPotenciaPromedio(double pP) {
        this.pP = pP;
        }
    protected double getvelocidadPromedio() {
        return vP;
        }
    protected void setVelocidadPromedio(double vP) { 
        this.vP = vP;
        }
    protected void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio = " + pP);
        System.out.println("Velocidad promedio = " + vP);
        }       
    protected String imprimirTipo() {
        return "Es un velocista";
    }
}
