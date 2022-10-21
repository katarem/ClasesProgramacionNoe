package clases.practicas;

public class Condicionales3 {
    
    public static void main(String[] args) {
        
        int edad = 18;
        boolean mayorEdad = true;
        boolean puto = true;

        if(!(edad>18)){
            mayorEdad = false;
        }
        else if(mayorEdad==true && edad<21){
            System.out.println("Eres mayor de edad, pero aun eres joven");
        }
        else if(mayorEdad==false || edad<18){
            System.out.println("Aun eres un chiquillo");
        }
        if(!(mayorEdad==true) && puto==true){
            System.out.println("Eres demasiado pequeño para prostituirte");
        }
        else if(mayorEdad && edad>21){
            if(puto)
                System.out.println("Bueno eres mayor de edad eres libre de hacer lo que quieras con tu cuerpo");
            else
                System.out.println("Mayor de edad y una persona de bien");
        }


    }


}
