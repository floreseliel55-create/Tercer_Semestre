package ProyectosED;
// Sergio Eliel Flores Urquidy Estructura de Datos
// Clase herramienta para crear herramientas y poder manejarlas en el taller
public class Herramienta {

    // atributos privados de una herramienta
    private String nombre;
    private int cantidadTotal;
    private int prestado;

    public Herramienta(String nombre, int cantidadTotal){
        this.nombre=nombre;
        this.cantidadTotal=cantidadTotal;
        // cuando se crea una herramienta todavia no se ah prestado nada
        this.prestado=0;
    }
    // metodo de prestar que devuelve true si se pudo prestar y false si es que no se pudo prestar la herramienta
    public boolean prestar(int cantidad){
        int disponible=cantidadTotal-prestado;
        // comprueba si la cantidad a prestar sea mayor que 0, y si se ah prestado mas de la herramienta disponible y si se puede prestar la cantidad que me piden
        if(cantidadTotal>0 && prestado<cantidadTotal && cantidad<=disponible && cantidad>0){

            // se guarda que se ah prestado la herramienta
            prestado=prestado+cantidad;
            return true;
        }
        // de otro modo no se puede prestar
        else{
            return false;
        }
    }
    // metodo que pide devolver una cantidad
    public boolean devolver(int cantidad){
        int disponible=cantidadTotal-prestado;
        // esto comprueba que no se devuelva mas herramientas de las que hay en el taller y que no se puedan devolver negativos ni 0
        if((cantidad+disponible)<=cantidadTotal && cantidad>0){
            // al ser devueltas disminuye las que estan prestadas
            prestado=prestado-cantidad;
            return true;
        }
        else{
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public int getPrestado() {
        return prestado;
    }

    public void setPrestado(int prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Herramienta [nombre=" + nombre + ", cantidadTotal=" + cantidadTotal + ", prestado=" + prestado + "]";
    }
    
}
