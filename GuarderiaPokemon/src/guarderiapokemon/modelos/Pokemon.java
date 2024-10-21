/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guarderiapokemon.modelos;

import java.util.*;

/**
 *
 * @author Cristian Alex Torres Velásquez
 */

public class Pokemon {
    
    public static final int MAXMOVS = 4;
    public static final int MAXEVS = 2;
    public static final String NOMBRE= "";
    public static final int EXPERIENCIA = 0;
    public static final String TIPO = "NINGUNO";
    //public static final TipoPokemon TIPOPOKEMON = TipoPokemon.NINGUNO;
    public static final int NIVEL = 1;
    public static final int EXPERIENCIASIGUIENTENIVEL = 100;
    public static final int PUNTOSVIDA = 1;
    public static final boolean ESEVOLUCIONADO = false;
    
    private String nombre;
    //private TipoPokemon tipo;
    private String tipo;
    private int experiencia;
    private int nivel;
    private int experienciaSiguienteNivel;
    private int puntosVida;
    private int vidaMaxima;
    private boolean esEvolucionado;
    private List<String> movimientos = new ArrayList<>();
    private List<String> formasEvolucionadas = new ArrayList<>();

    public Pokemon(String nombre, String tipo, int experiencia, int nivel, int experienciaSiguienteNivel, int puntosVida, int vidaMaxima, boolean esEvolucionado, List<String> movimientos, List<String> formasEvolucionadas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.experienciaSiguienteNivel = experienciaSiguienteNivel;
        this.puntosVida = puntosVida;
        this.vidaMaxima = vidaMaxima;
        this.esEvolucionado = esEvolucionado;
        this.movimientos = movimientos;
        this.formasEvolucionadas = formasEvolucionadas;
    }

    public Pokemon() {
        this.nombre = NOMBRE;
        //this.tipo = TipoPokemon.NINGUNO;
        this.tipo = TIPO;
        this.experiencia = EXPERIENCIA;
        this.nivel = NIVEL;
        this.experienciaSiguienteNivel = EXPERIENCIASIGUIENTENIVEL;
        this.puntosVida = PUNTOSVIDA;
        this.esEvolucionado = ESEVOLUCIONADO;
    }
    
    public Pokemon(Pokemon otro){
        this(otro.nombre, otro.tipo, otro.experiencia, otro.nivel, otro.experienciaSiguienteNivel, otro.puntosVida, otro.vidaMaxima, otro.esEvolucionado, otro.movimientos, otro.formasEvolucionadas);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Se implementará mas adelante
    /*
    public TipoPokemon getTipo() {
        return tipo;
    }

    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }
    */
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperienciaSiguienteNivel() {
        return experienciaSiguienteNivel;
    }

    public void setExperienciaSiguienteNivel(int experienciaSiguienteNivel) {
        this.experienciaSiguienteNivel = experienciaSiguienteNivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public boolean isEsEvolucionado() {
        return esEvolucionado;
    }

    public void setEsEvolucionado(boolean esEvolucionado) {
        this.esEvolucionado = esEvolucionado;
    }

    public List<String> getMovimientos() {
        return movimientos;
    }

    public void setMoves(ArrayList<String> movimientos) {
        this.movimientos = movimientos;
    }

    public List<String> getFormasEvolucionadas() {
        return formasEvolucionadas;
    }

    public void setFormasEvolucionadas(ArrayList<String> formasEvolucionadas) {
        this.formasEvolucionadas = formasEvolucionadas;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", tipo=" + tipo + ", experiencia=" + experiencia + ", nivel=" + nivel + ", experienciaSiguienteNivel=" + experienciaSiguienteNivel + ", puntosVida=" + puntosVida + ", vidaMaxima=" + vidaMaxima + ", esEvolucionado=" + esEvolucionado + ", moves=" + movimientos + ", formasEvolucionadas=" + formasEvolucionadas + '}';
    }
    
    public void subirNivel() {
        // Comprobamos si el Pokémon ha ganado suficiente experiencia para subir de nivel
        while (this.experiencia >= this.experienciaSiguienteNivel) {
            this.experiencia -= this.experienciaSiguienteNivel;

            this.nivel++;
            System.out.println(this.nombre + " ha subido al nivel " + this.nivel + "!");

            this.vidaMaxima += 10; 
            this.puntosVida = this.vidaMaxima;

            this.experienciaSiguienteNivel += 50;

            //IMPLEMENTAR MAS ADELANTE METODO EVOLUCIONAR
            //evolucionar();
        }
    }
    
}
