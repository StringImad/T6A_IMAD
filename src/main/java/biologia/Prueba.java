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

//        Ave claseD1 = new Ave("Felino", "ave", true, "sexual", 0, true);
                Ave claseD1 = new Ave("oblicuas", 12, "octagonal", "aguileño", "ave", true, "sexual", 891201, true);

        Ave claseD2 = new Ave("huecas", 4, "tipo iglu", "agaporni", "ave", true, "sexual", 273912, true);

        ArrayList<SeresVivos> arraySeres = new ArrayList<>();

        arraySeres.add(claseA1);
        arraySeres.add(claseA2);
        arraySeres.add(claseB1);
        arraySeres.add(claseB2);
        arraySeres.add(claseC1);
        arraySeres.add(claseC2);
        arraySeres.add(claseD1);
        arraySeres.add(claseD2);
        System.out.println(claseC2);

        System.out.println("-----------------------------");
        for (SeresVivos aux : arraySeres) {
            System.out.println(aux);
            aux.estaVivo();
            // Conversiones explícitas
            if (aux instanceof Animales) {
                System.out.println("Es vertebrado?"+ ((Animales) aux).isEsVertebrado());
              
            }
            if (aux instanceof Mamifero) {
//                Mamifero aux = (Mamifero) aux;
//                tmp.aguantefrio();
//                ((Mamifero) aux).aguantefrio();
                
                System.out.println("Aguante al frio: "+((Mamifero) aux).getCantidadPelo());

            }
            if (aux instanceof Ave) {
//                Ave temporal = (Ave) aux;
//                temporal.getNumeroHuevos();
                System.out.println("Cantidad de huevos: "+((Ave) aux).getNumeroHuevos());
//                ((Ave) aux).getTipoPlumas();

            }
        }

//        for (SeresVivos arraySere : arraySeres) {
//
//            arraySeres.forEach(System.out::println);
//        }

        arraySeres.indexOf(claseD1);

        arraySeres.contains(claseB1);

        arraySeres.remove(claseA1);

    }
}
