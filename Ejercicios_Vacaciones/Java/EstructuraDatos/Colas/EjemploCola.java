package EstructuraDatos.Colas;
//bibliotecas a utilizar
import java.util.LinkedList;
import java.util.Queue;

// Codigo para Entender y usar la sintaxis de las colas 
public class EjemploCola {
    public static void main(String[] args){

        // se crea un objeto de forma parecida al ArrayList
            Queue<String> cola = new LinkedList<>();

            // offer es para añadir a la cola como si de un arreglo se tratase:
            cola.offer("Cliente 1:");
            cola.offer("Cliente 2:");
            cola.offer("Ultimo Cliente:");

            //se usa el toString de la cola y se imprime lo que hay en ella (Pendiente)
            System.out.println("Cola Creada "+cola);
            //nos muestra el cliente que vamos a atender segun el orden de primeras entradas primeras salidas
            System.out.println("Siguiente en atender: "+cola.peek());
            // una vez atendido lo sacamos de la cola
            System.out.println("Atendido: "+cola.poll());
            //verificamos la cola nuevamente y nos quedan 2 clientes mas por atender
            System.out.println("Cola restante: "+cola);
    }

}
