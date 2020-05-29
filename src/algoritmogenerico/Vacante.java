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
public class Vacante {
    private int Presupuesto;
    private Maestro[] maestros;
 
    private int ValorPagar;
    private int Capacidades;
 
    public Vacante(int Presupuesto, int nummaestros) {
        this.Presupuesto = Presupuesto;
        this.maestros = new Maestro[nummaestros];
        this.Capacidades = 0;
        this.ValorPagar = 0;
    }
 
    public Maestro[] getmaestros() {
        return maestros;
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
 
    public int getPresupuesto() {
        return Presupuesto;
    }
 
    public void setPresupuesto(int Presupuesto) {
        this.Presupuesto = Presupuesto;
    }
 
    /**
     * Añade un Maestro a la vacante
     * @param e 
     */
    public void aniadirMaestro(Maestro e) {
 
        for (int i = 0; i < this.maestros.length; i++) {
            if (this.maestros[i] == null) {
                this.maestros[i] = e; //lo añade
                this.Capacidades+=e.getCapacidades(); // aumenta el Capacidades
                this.ValorPagar+=e.getValorPagar(); // Aumenta el piso
                break;
            }
        }
 
    }
 
    /**
     * Vaciamos la vacante
     */
    public void clear() {
        this.ValorPagar=0;
        this.Capacidades=0;
        for (int i = 0; i < this.maestros.length; i++) {
            this.maestros[i] = null;
        }
    }
 
    /**
     * Elimina Maestro dado
     * @param e 
     */
    public void eliminarMaestro(Maestro e) {
        for (int i = 0; i < this.maestros.length; i++) {
            if (this.maestros[i].equals(e)) {
                this.maestros[i] = null; //el Maestro fuera
                this.ValorPagar-=e.getValorPagar(); //Reduce el ValorPagar
                this.Capacidades-=e.getCapacidades(); // reduce el Capacidades
                break;
            }
        }
    }
     
    /**
     * Indica si existe un Maestro
     * @param e
     * @return 
     */
    public boolean existeMaestro(Maestro e) {
        for (int i = 0; i < this.maestros.length; i++) {
            if (this.maestros[i] != null && this.maestros[i].equals(e)) {
                return true;
            }
        }
        return false;
    }
 
    /**
     * Muestra la vacante
     * @return 
     */
    public String toString() {
        String cadena="";
        for (int i = 0; i < this.maestros.length; i++) {
            if (this.maestros[i] != null) {
                cadena+=maestros[i]+"\n";
            }
        }
        cadena+="Valor a pagar: " + getValorPagar()+"\n";
        cadena+="Capacidades: " + getCapacidades()+"\n";
        return cadena;
    }
}
