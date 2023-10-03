package com.example.septimoanillo.moldes;

import java.io.Serializable;

public class MoldeHotel implements Serializable {
    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;
    private String comentario;
    private Integer fotoAdicional;
    private  Integer fotoAdicional2;
    private float valoracion;

    private int button;  // preguntar que tipo de dato es el boton para agregarlo al adaptador y molde hotel


    public MoldeHotel() {// CONSTRUCTOR VACIO
    }

    public MoldeHotel(String nombre, String precio, String telefono, Integer foto, String comentario, Integer fotoAdicional, Integer fotoAdicional2, float valoracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
        this.foto = foto;
        this.comentario = comentario;
        this.fotoAdicional = fotoAdicional;
        this.fotoAdicional2 = fotoAdicional2;
        this.valoracion = valoracion;
    }

    // CONSTRUCTOR LLENO// metodo get  and set, los atributos, datos que se asocian son privados Yo  como usaurio de este programa no lo puedo usar ni mostrar,


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getFotoAdicional() {
        return fotoAdicional;
    }

    public void setFotoAdicional(Integer fotoAdicional) {
        this.fotoAdicional = fotoAdicional;
    }

    public Integer getFotoAdicional2() {
        return fotoAdicional2;
    }

    public void setFotoAdicional2(Integer fotoAdicional2) {
        this.fotoAdicional2 = fotoAdicional2;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
}
