package com.proyecto.proyectopoo.clases;

public class Categoria {
    int codigo;
    String nombre;
    String icono;

    public Categoria(String nombre, String icono, int codigo) {
        this.nombre = nombre;
        this.icono = icono;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
}
