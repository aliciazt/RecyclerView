package com.example.aliciazarate.entregable3_recyclerview;

/**
 * Created by Alicia Zarate on 17/9/2017.
 */
//ESTE CODIGO ES LA PLANTILLA DEL OBJETO QUE SERA ALOJADO DENTRO DE CADA UNA DE LAS CASILLAS DEL RECYCLERVIEW


public class imagenesvo {
    private String Nombre;
    private String info;
    private int foto;
    public imagenesvo(){

    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getInfo() {
        return info;
    }

    public int getFoto() {
        return foto;
    }

    public imagenesvo(String nombre, String info, int foto) {
        Nombre = nombre;
        this.info = info;
        this.foto = foto;
    }
}
