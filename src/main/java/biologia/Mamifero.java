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
public class Mamifero extends Animales {
    private String tipoMamifero;
    private String cantidadPelo;//mucha poca o normal
    private int numeroMesesGestacionMaterna;

    public Mamifero(String tipoAnimal, String reinoAniaml, boolean esVertebrado, String tipoReproduccion, int numeroCelulas, boolean respira) {
        super(tipoAnimal, reinoAniaml, esVertebrado, tipoReproduccion, numeroCelulas, respira);
    }
    
    
        @Override
       public void estaVivo() {
        if (getNumeroCelulas() > 0 && isRespira()== true) {
            System.out.println("Esta vivo");
        } else {
            System.out.println("No esta vivo o no es un ser vivo");
        }
    }
    

    public String getTipoMamifero() {
        return tipoMamifero;
    }

    public void setTipoMamifero(String tipoMamifero) {
        this.tipoMamifero = tipoMamifero;
    }

    public String getCantidadPelo() {
        return cantidadPelo;
    }

    public void setCantidadPelo(String cantidadPelo) {
        this.cantidadPelo = cantidadPelo;
    }

    public int getNumeroMesesGestacionMaterna() {
        return numeroMesesGestacionMaterna;
    }

    public void setNumeroMesesGestacionMaterna(int numeroMesesGestacionMaterna) {
        this.numeroMesesGestacionMaterna = numeroMesesGestacionMaterna;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.tipoMamifero);
        hash = 83 * hash + Objects.hashCode(this.cantidadPelo);
        hash = 83 * hash + this.numeroMesesGestacionMaterna;
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
        final Mamifero other = (Mamifero) obj;
        if (this.numeroMesesGestacionMaterna != other.numeroMesesGestacionMaterna) {
            return false;
        }
        if (!Objects.equals(this.tipoMamifero, other.tipoMamifero)) {
            return false;
        }
        if (!Objects.equals(this.cantidadPelo, other.cantidadPelo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "tipoMamifero=" + tipoMamifero + ", cantidadPelo=" + cantidadPelo + ", numeroMesesGestacionMaterna=" + numeroMesesGestacionMaterna + '}';
    }
    
    
    
}
