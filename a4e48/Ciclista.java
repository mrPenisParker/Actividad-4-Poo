/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4e48;

public abstract class Ciclista {
    private int identificador;
    private String name;
    private int timeA = 0;
    public Ciclista(int identificador, String name) {
        this.identificador = identificador;
        this.name = name;
        }
    abstract String imprimirTipo();
    
    protected int getIdentificador() {
        return identificador;
        }
    protected void setIdentificador() {
        this.identificador = identificador;
        }
    protected String getName(){
        return name;
        }
    protected void setName(String name) {
        this.name = name;
        }
    protected int getPosicionG(int posicionG) {
        return posicionG;
        }
    protected void setPosicionG(int posicionG) {
        posicionG = posicionG;
        }
    protected int getTimeA() {
        return timeA;
        }
    protected void setTimeA(int timeA) {
        this.timeA = timeA;
        }
    protected void imprimir() {
        System.out.println("Identificador = " + identificador);
        System.out.println("Nombre = " + name);
        System.out.println("Tiempo Acumulado = " + timeA);
}
}
