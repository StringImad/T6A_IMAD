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
public class SeresVivos {

    private String tipoReproduccion;//
    private int numeroCelulas;
    private boolean respira;//true = si

    //Inventa un método “metodoA” en la clase A
    public void estaVivo() {
        if (numeroCelulas > 0 && respira == true) {
            System.out.println("Esta vivo");
        } else {
            System.out.println("No esta vivo o no es un ser vivo");
        }
    }

    public SeresVivos() {
    }

    public SeresVivos(String tipoReproduccion, int numeroCelulas, boolean respira) {
        this.tipoReproduccion = tipoReproduccion;
        this.numeroCelulas = numeroCelulas;
        this.respira = respira;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public int getNumeroCelulas() {
        return numeroCelulas;
    }

    public void setNumeroCelulas(int numeroCelulas) {
        this.numeroCelulas = numeroCelulas;
    }

    public boolean isRespira() {
        return respira;
    }

    public void setRespira(boolean respira) {
        this.respira = respira;
    }

    @Override
    public String toString() {
        return "SeresVivos{" + "tipoReproduccion=" + tipoReproduccion + ", numeroCelulas=" + numeroCelulas + ", respira=" + respira + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.tipoReproduccion);
        hash = 97 * hash + this.numeroCelulas;
        hash = 97 * hash + (this.respira ? 1 : 0);
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
        final SeresVivos other = (SeresVivos) obj;
        if (this.numeroCelulas != other.numeroCelulas) {
            return false;
        }
        if (this.respira != other.respira) {
            return false;
        }
        if (!Objects.equals(this.tipoReproduccion, other.tipoReproduccion)) {
            return false;
        }
        return true;
    }
   
    
}
