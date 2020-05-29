/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogenerico;

/**
 *
 * @author sebastian
 */
public class Maestro {
    
    private int ValorPagar;
    private int Capacidades;
 
    public Maestro(int ValorPagar, int Capacidades) {
        this.ValorPagar = ValorPagar;
        this.Capacidades = Capacidades;
    }
 
    public int getValorPagar() {
        return ValorPagar;
    }
 
    public void setValorPagar(int ValorPagar) {
        this.ValorPagar = ValorPagar;
    }
 
    public int getCapacidades() {
        return Capacidades;
    }
 
    public void setCapacidades(int Capacidades) {
        this.Capacidades = Capacidades;
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
        final Maestro other = (Maestro) obj;
        if (this.ValorPagar != other.ValorPagar) {
            return false;
        }
        if (this.Capacidades != other.Capacidades) {
            return false;
        }
        return true;
    }
 
    @Override
    public String toString(){
        return "Valor a pagar:"+ValorPagar+","+" Capacidades:"+Capacidades;
    }
    
}
