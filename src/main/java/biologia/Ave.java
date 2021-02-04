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
public class Ave extends Animales{
    private String tipoPlumas;
    private int numeroHuevos;
    private String tipoNido;

    public Ave(String tipoAnimal, String reinoAniaml, boolean esVertebrado, String tipoReproduccion, int numeroCelulas, boolean respira) {
        super(tipoAnimal, reinoAniaml, esVertebrado, tipoReproduccion, numeroCelulas, respira);
    }
    
    public void prosperacionEspecie(){
        if(numeroHuevos>10){
            System.out.println("Prosperacion alta");
        }else{
            System.out.println("Prosperacion baja");
        }
    }
    
        @Override
       public void estaVivo() {
        if (getNumeroCelulas() > 0 && isRespira()== true) {
            System.out.println("Esta vivo");
        } else {
            System.out.println("No esta vivo o no es un ser vivo");
        }
    }

    public String getTipoPlumas() {
        return tipoPlumas;
    }

    public void setTipoPlumas(String tipoPlumas) {
        this.tipoPlumas = tipoPlumas;
    }

    public int getNumeroHuevos() {
        return numeroHuevos;
    }

    public void setNumeroHuevos(int numeroHuevos) {
        this.numeroHuevos = numeroHuevos;
    }

    public String getTipoNido() {
        return tipoNido;
    }

    public void setTipoNido(String tipoNido) {
        this.tipoNido = tipoNido;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.tipoPlumas);
        hash = 53 * hash + this.numeroHuevos;
        hash = 53 * hash + Objects.hashCode(this.tipoNido);
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
        final Ave other = (Ave) obj;
        if (this.numeroHuevos != other.numeroHuevos) {
            return false;
        }
        if (!Objects.equals(this.tipoPlumas, other.tipoPlumas)) {
            return false;
        }
        if (!Objects.equals(this.tipoNido, other.tipoNido)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+"Ave{" + "tipoPlumas=" + tipoPlumas + ", numeroHuevos=" + numeroHuevos + ", tipoNido=" + tipoNido + '}';
    }
    
}
