/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guarderiapokemon;
import guarderiapokemon.modelos.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cristian Alex Torres Velásquez
 */
public class GuarderiaPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables para crear un Pokémon.
        String nombre;
        String tipo;
        int experiencia;
        int nivel;
        int experienciaSiguienteNivel;
        int puntosVida;
        int vidaMaxima;
        String[] arrayMovs;
        ArrayList<String> movimientos;
        String[] arrayEvoluciones;
        ArrayList<String> formasEvolucionadas;

        Scanner sc = new Scanner(System.in);

        // Ingreso de datos por el usuario.
        System.out.println("Introduce el nombre del Pokemon: ");
        nombre = sc.nextLine();  // Utilizamos nextLine() para permitir nombres con espacios.
        System.out.println("Introduce el tipo del Pokemon: ");
        tipo = sc.nextLine();
        System.out.println("Introduce la experiencia del Pokemon: ");
        experiencia = sc.nextInt();
        System.out.println("Introduce el nivel del Pokemon: ");
        nivel = sc.nextInt();
        System.out.println("Introduce la experiencia hasta el siguiente nivel: ");
        experienciaSiguienteNivel = sc.nextInt();
        System.out.println("Introduce los puntos de vida: ");
        puntosVida = sc.nextInt();
        System.out.println("Introduce los puntos de vida máxima: ");
        vidaMaxima = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea restante.

        System.out.println("Introduce los movimientos del Pokemon separados por espacios (máximo 4): ");
        arrayMovs = sc.nextLine().split(" ");
        movimientos = new ArrayList<>();
        movimientos.addAll(Arrays.asList(arrayMovs));

        System.out.println("Introduce las evoluciones del Pokemon separadas por espacios (máximo 2): ");
        arrayEvoluciones = sc.nextLine().split(" ");
        formasEvolucionadas = new ArrayList<>();
        formasEvolucionadas.addAll(Arrays.asList(arrayEvoluciones));

        // Creamos un Pokémon usando el constructor completo.
        Pokemon pokemon1 = new Pokemon(nombre, tipo, experiencia, nivel, experienciaSiguienteNivel, puntosVida, vidaMaxima, false, movimientos, formasEvolucionadas);
        System.out.println("\nPokémon creado con constructor completo:");
        System.out.println(pokemon1);

        // Creamos un Pokémon usando el constructor por defecto.
        Pokemon pokemon2 = new Pokemon();
        System.out.println("\nPokémon creado con constructor por defecto:");
        System.out.println(pokemon2);

        // Modificamos algunos valores de pokemon2 usando setters.
        pokemon2.setNombre("Pikachu");
        pokemon2.setTipo("Eléctrico");
        pokemon2.setNivel(5);
        pokemon2.setPuntosVida(50);
        pokemon2.setVidaMaxima(50);
        System.out.println("\nPokémon modificado usando setters:");
        System.out.println(pokemon2);

        // Creamos un Pokémon usando el constructor de copia.
        Pokemon pokemon3 = new Pokemon(pokemon1);
        System.out.println("\nPokémon creado con constructor de copia (copia de pokemon1):");
        System.out.println(pokemon3);

        // Usamos algunos getters para mostrar información específica.
        System.out.println("\nInformación específica de los Pokémon usando getters:");
        System.out.println("Nombre de pokemon1: " + pokemon1.getNombre());
        System.out.println("Nivel de pokemon2: " + pokemon2.getNivel());
        System.out.println("Tipo de pokemon3: " + pokemon3.getTipo());

        // Finalizar la entrada de datos.
        sc.close(); 
        
    }
    
}
