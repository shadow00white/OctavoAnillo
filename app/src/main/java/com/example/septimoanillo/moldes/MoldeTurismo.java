package com.example.septimoanillo.moldes;

import java.io.Serializable;

public class MoldeTurismo implements Serializable {
    private String nombre;
    private String telefono;
    private String precio;
    private  Integer foto;
    private String comentario;
    private Integer fotoAdicional;
    private  Integer fotoAdicional2;
    private float valoracion;

    //se crearon atributos de un molde:  lo cual representa cada uno de los elementos graficos que quiero controlar , estos varian dependiendo del molde elementos variables
    //molde logico: define atributos   que son cada uno de los elementos graficos que varian.
    //lista dinamica: son datos que se pueden agregar, variar, cambiar y borrar.  los elementos varian
    //atributo : variable de java que representa los elementos graficos variables de un molde
    // private modificador de acceso, proteger la integridad de los datos

    public MoldeTurismo(String garrocha, String s, String s1, String s2, int sitioturistico1, String s3, int ampliandositio10, int ampliandositio0, float v) {
    }

    public MoldeTurismo(String nombre, String telefono, String precio, Integer foto, String comentario, Integer fotoAdicional, Integer fotoAdicional2, float valoracion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
        this.comentario = comentario;
        this.fotoAdicional = fotoAdicional;
        this.fotoAdicional2 = fotoAdicional2;
        this.valoracion = valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
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

     {
    }
}
