package ar.edu.unlu.poo.labo2.artefactos;

import java.util.Objects;

public class Artefacto
{
    private String nombre;
    private int poder;
    private String tipo;

    public Artefacto(String nombre, int poder, String tipo)
    {
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getNivelDePoder()
    {
        return poder;
    }

    public String getTipo()
    {
        return tipo;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Artefacto that = (Artefacto) obj;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

}
