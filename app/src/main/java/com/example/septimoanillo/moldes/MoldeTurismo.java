package com.example.septimoanillo.moldes;

public class MoldeTurismo {
    private String nombre;
    private String nombrecontacto;
    private String telefono;
    private String precio;
    private  Integer foto;
    //se crearon atributos de un molde:  lo cual representa cada uno de los elementos graficos que quiero controlar , estos varian dependiendo del molde elementos variables
    //molde logico: define atributos   que son cada uno de los elementos graficos que varian.
    //lista dinamica: son datos que se pueden agregar, variar, cambiar y borrar.  los elementos varian
    //atributo : variable de java que representa los elementos graficos variables de un molde
    // private modificador de acceso, proteger la integridad de los datos

    public MoldeTurismo() {
    }

    public MoldeTurismo(String nombre, String nombrecontacto, String telefono, String precio, Integer foto) {
        this.nombre = nombre;
        this.nombrecontacto = nombrecontacto;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getNombreTurismo() {
        return nombre;
    }

}
