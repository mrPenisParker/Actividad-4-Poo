/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4e48;

public class Contrarrelojista extends Ciclista {
    private double vM;
    public Contrarrelojista(int identificador, String nombre, double vM) {
        super(identificador, nombre);
        this.vM = vM;
        }
    protected double getVelocidadMáxima() {
        return vM;
        }
    protected void setVelocidadMáxima(double vM) {
        this.vM = vM;
        }
    protected void imprimir() {
        super.imprimir();
        System.out.println("Aceleración promedio = " + vM);
        }
    protected String imprimirTipo() {
        return "Es un constrarrelojista";
    }

}
