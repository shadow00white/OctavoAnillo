package com.example.septimoanillo.moldes;

public class MoldeRestaurante {

    private String nombreRestaurante;
    private String nombrecontacto;
    private String telefono;
    private String precio;
    private  Integer foto;
    private String platorecomendado;

    public MoldeRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public MoldeRestaurante(String nombreRestaurante, String nombrecontacto, String telefono, String precio, Integer foto, String platorecomendado) {
        this.nombreRestaurante = nombreRestaurante;
        this.nombrecontacto = nombrecontacto;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
        this.platorecomendado = platorecomendado;
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

    public String getPlatorecomendado() {
        return platorecomendado;
    }

    public void setPlatorecomendado(String platorecomendado) {
        this.platorecomendado = platorecomendado;
    }
}
