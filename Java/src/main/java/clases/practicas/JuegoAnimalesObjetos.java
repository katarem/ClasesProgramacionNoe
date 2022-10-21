package clases.practicas;

import java.util.Scanner;

import clases.practicas.Objetos.Animal;

public class JuegoAnimalesObjetos {
    public static void main(String[] args) {
        Animal a = Animal.createAnimal();
        Scanner entrada = new Scanner(System.in);
        boolean win = false;
        int cont = 0, intento = 1;
        String[] preguntas = {a.getPatas(),a.getOrejas(),a.getHocico(),a.getSonido(),a.getSonido()};
        System.out.println("Debes adivinar qué animal es con las pistas dadas.");
        while (!win) {
            System.out.println(preguntas[cont]);
            String respuesta = entrada.nextLine();
            if(respuesta.equalsIgnoreCase(a.getEspecie())){
                System.out.println("Lo adivinaste! Era un " + a.getEspecie() + " y tomaste " + intento + " intentos.");
                win = true;
            }
            if(cont==preguntas.length-1)
                cont = -1;
            cont++;
            intento++;
        }
        System.out.println("Espero que te haya gustado el juego");
        entrada.close();        
    }
}
