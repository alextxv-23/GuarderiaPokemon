/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guarderiapokemon.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian Alex Torres Velásquez
 */
public class Guarderia {
    private List <Pokemon> listaPokemon;
    private int capacidad;
    private String nombre;

    public Guarderia() {
        listaPokemon = new ArrayList<>();
        capacidad = 1;
        nombre = "";
    }

    public Guarderia(int capacidad, String nombre) {
        listaPokemon = new ArrayList<>();
        this.capacidad = capacidad;
        this.nombre = nombre;
    }
    
    public Guarderia(Guarderia otro){
        this(otro.capacidad, otro.nombre);
    }

    public List<Pokemon> getListaPokemon() {
        return listaPokemon;
    }

    public void setListaPokemon(List<Pokemon> listaPokemon) {
        this.listaPokemon = listaPokemon;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Guarderia{" + "listaPokemon=" + listaPokemon + ", capacidad=" + capacidad + ", nombre=" + nombre + '}';
    }
    
    // Método para agregar un Pokémon a la guardería
    public boolean agregarPokemon(Pokemon pokemon) {
        if (listaPokemon.size() < capacidad) {
            listaPokemon.add(pokemon);
            System.out.println(pokemon.getNombre() + " ha sido agregado a la guardería.");
            return true;
        } else {
            System.out.println("La guardería está llena. No se puede agregar " + pokemon.getNombre() + ".");
            return false;
        }
    }

    // Método para eliminar un Pokémon de la guardería
    public boolean eliminarPokemon(Pokemon pokemon) {
        if (listaPokemon.remove(pokemon)) {
            System.out.println(pokemon.getNombre() + " ha sido eliminado de la guardería.");
            return true;
        } else {
            System.out.println(pokemon.getNombre() + " no se encuentra en la guardería.");
            return false;
        }
    }

    // Método para entrenar a un Pokémon
    public void entrenarPokemon(Pokemon pokemon, int experienciaGanada) {
        if (listaPokemon.contains(pokemon)) {
            pokemon.setExperiencia(pokemon.getExperiencia() + experienciaGanada);
            System.out.println(pokemon.getNombre() + " ha ganado " + experienciaGanada + " de experiencia.");
            pokemon.subirNivel(); // Verificar si sube de nivel
        } else {
            System.out.println(pokemon.getNombre() + " no está en la guardería.");
        }
    }

    // Método para alimentar a un Pokémon
    public void alimentarPokemon(Pokemon pokemon, int cantidadVida) {
        if (listaPokemon.contains(pokemon)) {
            int nuevaVida = pokemon.getPuntosVida() + cantidadVida;
            if (nuevaVida > pokemon.getVidaMaxima()) {
                nuevaVida = pokemon.getVidaMaxima();
            }
            pokemon.setPuntosVida(nuevaVida);
            System.out.println(pokemon.getNombre() + " ha sido alimentado. Puntos de vida actuales: " + pokemon.getPuntosVida());
        } else {
            System.out.println(pokemon.getNombre() + " no está en la guardería.");
        }
    }

    // Método para listar todos los Pokémon en la guardería
    public void listarPokemones() {
        System.out.println("Pokémon en la guardería '" + nombre + "':");
        for (Pokemon p : listaPokemon) {
            System.out.println(p);
        }
    }
    
}
