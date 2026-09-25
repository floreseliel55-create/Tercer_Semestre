package Ejercicios_Vacaciones.Java.Trabajitos;

public class ExamenDiagnostico {
    public static void main(String[] args){
            int[] numeros = new int[5];
            int numMayor=numeros[0];
            for(int i=0;i<5;i++){
                if(numeros[i]>numMayor){
                numMayor=numeros[i];
                }
            System.out.println("El numero mayor es: "+numMayor);
    }
    }
}
