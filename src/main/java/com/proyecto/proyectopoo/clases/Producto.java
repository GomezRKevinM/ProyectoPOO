package com.proyecto.proyectopoo.clases;

public class Producto {
    int codigo;
    String nombre;
    String marca;
    double precio;
    String descripcion;
    String imagen;
    int tiempoGarantia;
    double precioUnitario;
    double descuento;
    double iva;
    int unidades;
    int stock;
    double ivanSinDescuento;
    double ivaConDescuento;
    boolean disponibilidad;
    Categoria categoria;

    public Producto(int codigo, String nombre, double precio, String descripcion, double precioUnitario, Categoria categoria, String marca, String imagen) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.categoria = categoria;
        this.marca = marca;
        this.imagen = imagen;
    }

}
