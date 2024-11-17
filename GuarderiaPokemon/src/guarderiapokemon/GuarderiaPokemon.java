/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guarderiapokemon;
import guarderiapokemon.modelos.*;
import guarderiapokemon.vista.ControladorVentanas;
import guarderiapokemon.vista.PantallaCarga;
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
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        ControladorVentanas.instance.abrirCerrarInitialView(true);
        

//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CombateView().setVisible(true);
//            }
//        });
        
        // Crear una guardería con un nombre y capacidad de 5 Pokémon
        Guarderia guarderia = new Guarderia(5, "Guardería Pokémon de Ash");
        
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

        
        // Agregar el Pokémon a la guardería
        guarderia.agregarPokemon(pokemon3);

        // Opciones adicionales de interacción
        System.out.println("¿Deseas entrenar al Pokémon? (sí/no)");
        String opcion = sc.next();
        if (opcion.equalsIgnoreCase("sí")) {
            System.out.println("¿Cuánta experiencia ha ganado?");
            int experienciaGanada = sc.nextInt();
            guarderia.entrenarPokemon(pokemon3, experienciaGanada);
        }

        System.out.println("¿Deseas alimentar al Pokémon? (sí/no)");
        opcion = sc.next();
        if (opcion.equalsIgnoreCase("sí")) {
            System.out.println("¿Cuántos puntos de vida quieres restaurar?");
            int cantidadVida = sc.nextInt();
            guarderia.alimentarPokemon(pokemon3, cantidadVida);
        }

        // Listar los Pokémon en la guardería
        guarderia.listarPokemones();
        
        
        // Finalizar la entrada de datos.
        sc.close();
        
        
    }
    
}
