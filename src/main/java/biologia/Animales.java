/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biologia;

import java.util.Objects;

/**
 *
 * @author MSI
 */
public class Animales extends SeresVivos {

    private String tipoAnimal;
    private String reinoAniaml;

    private boolean esVertebrado;//true vertebrado false invertebrado

    public Animales(String tipoAnimal, String reinoAniaml, boolean esVertebrado, String tipoReproduccion, int numeroCelulas, boolean respira) {
        super(tipoReproduccion, numeroCelulas, respira);
        this.tipoAnimal = tipoAnimal;
        this.reinoAniaml = reinoAniaml;
        this.esVertebrado = esVertebrado;
    }
    //Crea un método “metodoB” que sólo exista en la clase B. No está sobrescrito.

    public void tipoEsqueleto() {

        if (esVertebrado == true) {
            System.out.println("Viviparo");
        } else {
            System.out.println("Oviparo");
        }
    }
    
    public void reinoAnimalDefecto(){
        
        if(reinoAniaml.equals("Mamifero")||reinoAniaml.equals("Ave")){
            System.out.println("Esta dentro de los seres vivos registrados");
        }else{
            System.out.println("No esta dentro de los seres vivos registrrados");
        }
        
    }
    

    //Sobrescribe el “metodoA” en B, C y D. 
    @Override
    public void estaVivo() {
        if (getNumeroCelulas() > 0 && isRespira() == true) {
            System.out.println("Esta vivo");
        } else {
            System.out.println("No esta vivo o no es un ser vivo");
        }
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getReinoAniaml() {
        return reinoAniaml;
    }

    public void setReinoAniaml(String reinoAniaml) {
        this.reinoAniaml = reinoAniaml;
    }

    public boolean isEsVertebrado() {
        return esVertebrado;
    }

    public void setEsVertebrado(boolean esVertebrado) {
        this.esVertebrado = esVertebrado;
    }

    @Override
    public String toString() {
        return super.toString()+"Animales{" + "tipoAnimal=" + tipoAnimal + ", reinoAniaml=" + reinoAniaml + ", esVertebrado=" + esVertebrado + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.tipoAnimal);
        hash = 83 * hash + Objects.hashCode(this.reinoAniaml);
        hash = 83 * hash + (this.esVertebrado ? 1 : 0);
        return hash;
    }


    
    
        @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animales other = (Animales) obj;
        if (this.esVertebrado != other.esVertebrado) {
            return false;
        }
        if (!Objects.equals(this.tipoAnimal, other.tipoAnimal)) {
            return false;
        }
        if (!Objects.equals(this.reinoAniaml, other.reinoAniaml)) {
            return false;
        }
        return true;
    }

}
