package com.example.septimoanillo.moldes;

public class MoldeHotel {
    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;

    public MoldeHotel() {// CONSTRUCTOR VACIO
    }

    public MoldeHotel(String nombre, String precio, String telefono, Integer foto) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
    }// CONSTRUCTOR LLENO// metodo get  and set, los atributos, datos que se asocian son privados Yo  como usaurio de este programa no lo puedo usar ni mostrar,

    public String getNombre() {//que es una funcion que va devolver un string un nombre, cuando lo quiera ver llamo a set
        return nombre;
    }

    public void setNombre(String nombre) {  // un nombre qu llega de la base de datos y se le asignga  a mi aplicacion
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }
}
