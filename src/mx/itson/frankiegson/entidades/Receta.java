/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.frankiegson.entidades;

import com.google.gson.Gson;
import java.util.List;
import mx.itson.frankiegson.enumerador.Dificultad;

/**
 *
 * @author
 */
public class Receta {
    
    private String nombre;
    private String descripcion;
    private int duracion;
    private int numPorciones;
    private List <Ingrediente> ingredientes;
    private List <Paso> pasos; 
    private Dificultad dificultad;
    private Usuario usuario;

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the numPorciones
     */
    public int getNumPorciones() {
        return numPorciones;
    }

    /**
     * @param numPorciones the numPorciones to set
     */
    public void setNumPorciones(int numPorciones) {
        this.numPorciones = numPorciones;
    }

    /**
     * @return the ingredientes
     */
    public List <Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(List <Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    /**
     * @return the pasos
     */
    public List <Paso> getPasos() {
        return pasos;
    }

    /**
     * @param pasos the pasos to set
     */
    public void setPasos(List <Paso> pasos) {
        this.pasos = pasos;
    }

    /**
     * @return the dificultad
     */
    public Dificultad getDificultad() {
        return dificultad;
    }

    /**
     * @param dificultad the dificultad to set
     */
    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }
    public Receta deserielizar(String json){
    Receta receta = new Receta();
    try{ 
        
        receta = new Gson().fromJson(json, Receta.class);
    }catch(Exception ex) {
        System.out.print("Ocurrio un error: "+ ex.getMessage());
        }
    return receta;
    }
}
