package clases.practicas;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

        int[] arrayBasica = new int[10];

        for (int i = 0; i < arrayBasica.length; i++)
            arrayBasica[i] = i+1;

        ArrayList<Integer> arrayEpica = new ArrayList<Integer>();

        for (int i = 0; i < 4000; i++)
            arrayEpica.add(i+1);

        for (int i = 0; i < arrayBasica.length; i++)
            System.out.println(arrayBasica[i]);

        for (int i = 0; i < arrayEpica.size(); i++)
            arrayEpica.get(i);
            
    }
}
