package clases.practicas;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean batallas = true;

        int limite = 100;

        for (int i = 0; i < limite; i++) {
            System.out.print(i + " ");
        }

        while (batallas) {
            
            String eleccion = "Vas a dejar de ser un batallas?\n(S/N)";
            
            if(eleccion=="S")
                batallas = false;

        }
        entrada.close();
    }
}
