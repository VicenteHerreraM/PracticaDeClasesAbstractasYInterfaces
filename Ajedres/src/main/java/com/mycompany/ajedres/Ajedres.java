/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ajedres;

/**
 *
 * @author vice1
 */
public class Ajedres {

    public static void main(String[] args) {
        Caballo caballo = new Caballo();
        Peon peon = new Peon();
        caballo.comer();
        caballo.colorPieza();
        peon.comer();
        peon.colorPieza();
        
    }
}
