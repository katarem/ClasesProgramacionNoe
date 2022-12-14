package clases.practicas.Objetos;

public class Jugador{

    private String nombre,equipo;
    private int posicion;
    private boolean lesionado;

    public Jugador(String nombre,String equipo, int pos, boolean les) {
        
        this.nombre=nombre;
        this.equipo=equipo;
        this.posicion=pos;
        this.lesionado=les;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    public int getPosicion() {
        return posicion;
    }
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    public String isLesionado() {
        if(lesionado)
            return "está lesionado";
        return "no está lesionado";
    }
    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public String toString(){
        return String.format("%s juega en posición %d y %s, juega para el equipo %s",nombre,posicion,isLesionado(),equipo);
    }





}
