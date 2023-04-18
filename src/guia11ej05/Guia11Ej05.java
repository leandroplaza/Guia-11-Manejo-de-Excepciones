/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11ej05;

import Entidad.AdivinarNum;

/**
 *
 * @author ezepl
 */
public class Guia11Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdivinarNum ad = new AdivinarNum();
        ad.generarNumAleatorio();
        ad.adivinarNum();
    }

}
