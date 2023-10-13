/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4e48;

    public class Escalador extends Ciclista {
        private double aC;
        private double gradoRampa;
        public Escalador(int identificador, String name, double aC, double gradoRampa) {
        super(identificador, name);
        this.aC = aC;
        this.gradoRampa = gradoRampa;
        }
    protected double getAceleraciónPromedio() {
        return aC;
        }
    protected void setAceleraciónPromedio(double aC) {
        this.aC = aC;
        }
    protected double getGradoRampa() {
        return gradoRampa;
        }
    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
        }
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio = " + aC);
        System.out.println("Grado de rampa = " + gradoRampa);
        }
    protected String imprimirTipo() {
        return "Es un escalador";
    }
}
    