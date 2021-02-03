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
public class Animales extends SeresVivos{
    private String tipoAnimal;
    private String reinoAniaml;
    
    private boolean esVertebrado;//true vertebrado false invertebrado

    public Animales(String tipoAnimal, String reinoAniaml, boolean esVertebrado, String tipoReproduccion, int numeroCelulas, boolean respira) {
        super(tipoReproduccion, numeroCelulas, respira);
        this.tipoAnimal = tipoAnimal;
        this.reinoAniaml = reinoAniaml;
        this.esVertebrado = esVertebrado;
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
        return "Animales{" + "tipoAnimal=" + tipoAnimal + ", reinoAniaml=" + reinoAniaml + ", esVertebrado=" + esVertebrado + '}';
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
