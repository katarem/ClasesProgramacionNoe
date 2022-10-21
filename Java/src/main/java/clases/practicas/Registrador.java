package clases.practicas;

import java.util.ArrayList;
import java.util.Scanner;
import clases.practicas.Objetos.Jugador;
public class Registrador{
    public static void main(String[] args) {
        ArrayList<Jugador> j = new ArrayList<Jugador>();
        boolean seguir = true;
        Scanner entrada = new Scanner(System.in);
        while (seguir) {
            System.out.println("Bienvenido al Registrador de jugadores!\nIntroduce el nombre del jugador: ");
            String nombre = entrada.next();
            System.out.println("Equipo: ");
            String equipo = entrada.next();
            System.out.println("Posición: ");
            int pos = entrada.nextInt();
            System.out.println("¿Está lesionado? (S/N)");
            boolean lesionado;
            if(entrada.next().equalsIgnoreCase("s"))
                lesionado = true;
            else
                lesionado = false;
            j.add(new Jugador(nombre, equipo, pos, lesionado));
            System.out.println("¿Quiere registrar otro jugador? (S/N)");
            if(entrada.next().equalsIgnoreCase("n"))
                seguir = false;
        }
        entrada.close();
        System.out.println("Gracias por usar el programa. Ha registrado:");
        System.out.println(j.toString());
        
    }

}