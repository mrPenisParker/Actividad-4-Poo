/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a4e48;
public class A4E48 {

    public static void main(String[] args) {
        Equipo Eq1 = new Equipo("Sky","Estados Unidos");
        Velocista Ve1 = new Velocista(123979, "Geraint Thomas", 320, 25);
        Escalador Es1 = new Escalador(123980, "Egan Bernal", 25, 10);
        Contrarrelojista Cr1 = new Contrarrelojista(123981, "Jonathan Castroviejo", 120);
        Eq1.añadirCiclista(Ve1);
        Eq1.añadirCiclista(Es1);
        Eq1.añadirCiclista(Cr1);
        Ve1.setTimeA(365);
        Es1.setTimeA(385);
        Cr1.setTimeA(370);
        Eq1.calcularTime();
        Eq1.imprimir();
        Eq1.listarEquipo();
    } 
}
