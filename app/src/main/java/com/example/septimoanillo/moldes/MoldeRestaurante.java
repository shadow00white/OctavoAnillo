package com.example.septimoanillo.moldes;

import java.io.Serializable;

public class MoldeRestaurante implements Serializable {

    private String nombreRestaurante;
    private String telefono;
    private String precio;
    private String platoRecomendado;
    private Integer foto;
    private String comentario;
    private Integer fotoAdicional;
    private Integer fotoAdicional2;
    private float valoracion;

    public MoldeRestaurante() {
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
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

    public String getPlatoRecomendado() {
        return platoRecomendado;
    }

    public void setPlatoRecomendado(String platoRecomendado) {
        this.platoRecomendado = platoRecomendado;
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

    public MoldeRestaurante(String nombreRestaurante, String telefono, String precio, String platoRecomendado, Integer foto, String comentario, Integer fotoAdicional, Integer fotoAdicional2, float valoracion) {
        this.nombreRestaurante = nombreRestaurante;
        this.telefono = telefono;
        this.precio = precio;
        this.platoRecomendado = platoRecomendado;
        this.foto = foto;
        this.comentario = comentario;
        this.fotoAdicional = fotoAdicional;
        this.fotoAdicional2 = fotoAdicional2;
        this.valoracion = valoracion;

    }



}




