package EstructuraDatos.Colas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


// Programa que almacena tickets(Clientes que encontraron errores en una app o sistema de la empresa y solicitan ayuda a soporte)
public class Tickets {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Queue<String> tickets = new LinkedList<>();
        String opcion;
        int op = 1;
        
        while(op != 4){
            System.out.println();
            System.out.println("Bienvenido a soporte");
            System.out.println("¿Que accion desea Realizar?");
            System.out.println("1- Reportar Error: ");
            System.out.println("2- Consultar avances de un reporte:");
            System.out.println("3- Consultar cola:");
            System.out.println("4- Salir");
            System.out.println();

            try{
                opcion = sc.nextLine();
                op = Integer.parseInt(opcion);

                switch(op){
                    case 1:
                        String nombre;
                        System.out.println("Porfavor ingrese el error: ");
                        nombre = sc.nextLine();
                        tickets.offer(nombre);
                        System.out.println("Reporte registrado con exito: ");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Ticket actual: "+tickets.peek());
                        double num=Math.random()*(10-1)+1;
                        if(num<8){
                            System.out.println("El ticket actual se ah resuelto: ");
                            tickets.poll();
                        }
                        else{
                            System.out.println("Aun no hemos podido solucionar el ticket: ");
                        }
                        break;
                    case 3:
                        System.out.println(tickets);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                }
            } catch(NumberFormatException e){
                System.out.println("Ingrese un numero: ");
            } catch(NullPointerException e){
                System.out.println("No hay tickets por revisar: ");
            }
        }
        
        System.out.println("Programa finalizado: ");
    }
}
