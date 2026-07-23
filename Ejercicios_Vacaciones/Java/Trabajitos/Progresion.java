package Ejercicios_Vacaciones.Java.Trabajitos;
import java.util.Scanner;
import java.util.Scanner;

public class Progresion {
    //Programa que mide la progresion de algo en una barra

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Progression Programm: ");

        int xp=0;
        int nivel=1;
        int acum=0;
        while(nivel<3){
            
            System.out.println("Ingrese XP: ");
            xp=sc.nextInt();
            acum+=xp;
            if(acum>=100){
                while(acum>=100){
                acum=acum-100;
                nivel++;
             }
            }
        }
        System.out.println(nivel);
        System.out.println(acum);
    }
}
