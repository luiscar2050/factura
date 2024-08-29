package edu.misena.factura.model;

public class Cliente {
    private String nombre;
    private String nif; // Número de Identificación Fiscal

    // Getter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo nif
    public String getNif() {
        return nif;
    }

    // Setter para el atributo nif
    public void setNif(String nif) {
        this.nif = nif;
    }
}
