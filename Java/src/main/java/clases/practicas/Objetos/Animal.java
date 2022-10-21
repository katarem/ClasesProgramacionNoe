package clases.practicas.Objetos;

public class Animal {
    
    String patas;
    String especie;
    boolean tieneHocico;
    boolean tienePico;
    String orejas;
    String sonido;
    String cola;
    String color;

    public Animal(){
    }

    public static Animal createAnimal(){
        int i = (int)(Math.random()*4+1);
        Animal[] creado = {new Serpiente(),new Perro(),new Gato(),new Pajaro()};
        return creado[i];
    }


    public String getPatas(){
        return "tiene " + patas + " patas";
    }

    public String getOrejas(){
        return "tiene " + orejas + " orejas";
    }

    public String getSonido(){
        return "su sonido es: " + sonido;
    }

    public String getColor(){
        return "es de color: " + color;
    }

    public void setSonido(String sonido){
        this.sonido = sonido;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getHocico(){
        if(tieneHocico)
            return "tiene hocico";
        else
            return "no tiene hocico";
    }

    public String getEspecie(){
        return especie;
    }

    public String toString(){
        return "Es un " + especie + " " + getPatas() + " " + getOrejas() + " " + getColor() + " " + getHocico()+ " " + getSonido();
    }

}
