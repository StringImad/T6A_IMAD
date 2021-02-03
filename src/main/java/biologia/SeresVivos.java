/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biologia;

/**
 *
 * @author MSI
 */
public class SeresVivos {
    private String tipoReproduccion;//
    private int numeroCelulas;
    private boolean respira;//true = si
    
    //Inventa un método “metodoA” en la clase A
    public void estaVivo(){
        if(numeroCelulas >0&& respira==true){
         System.out.println("Esta vivo");
        }else{
            System.out.println("No esta vivo o no es un ser vivo");
        }
    }
    
    
}
