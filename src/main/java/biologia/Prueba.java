/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biologia;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Prueba {

    public static void main(String[] args) {

        SeresVivos claseA1 = new SeresVivos("sexual", 12643652, true);
        SeresVivos claseA2 = new SeresVivos("asexual", 128391, true);

        Animales claseB1 = new Animales("bipedo", "mamifero", true, "sexual", 0, true);
        Animales claseB2 = new Animales("bipedo", "mamifero", true, "asexual", 0, true);
        
        Mamifero claseC1 = new Mamifero("Accipitridae", "Ave", true, "sexual", 0, true);
        Mamifero claseC2 = new Mamifero("Canino", "mamifero", true, "sexual", 324112, true);
        
        Ave claseD1 = new Ave("Felino", "", true, "sexual", 0, true);
        Ave claseD3 = new Ave("gallopavo", "ave", true, "sexual", 2375472, true);
        ArrayList<SeresVivos> array = new ArrayList<>();

        System.out.println(claseC2);

    }
}
