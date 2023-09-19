package com.example.septimoanillo.moldes;

import java.io.Serializable;

public class MoldeRestaurante implements Serializable {

    private String nombreRestaurante;
    private String nombrecontacto;
    private String telefono;
    private String precio;

    private Integer foto;
    private String comentario;
    private Integer fotoAdicional;
    private  Integer fotoAdicional2;
    private float valoracion;

    public MoldeRestaurante(String cascadaYSabor, String joshPrieto, String s, String s1, int restaurante1, String bandejaPaisa, String s2, int ampliandoresta1, int ampliandoresta2, float v) {
    }

    public MoldeRestaurante(String nombreRestaurante, String nombrecontacto, String telefono, String precio, Integer foto, String comentario, Integer fotoAdicional, Integer fotoAdicional2, float valoracion) {
        this.nombreRestaurante = nombreRestaurante;
        this.nombrecontacto = nombrecontacto;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
        this.comentario = comentario;
        this.fotoAdicional = fotoAdicional;
        this.fotoAdicional2 = fotoAdicional2;
        this.valoracion = valoracion;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getNombrecontacto() {
        return nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
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
}
