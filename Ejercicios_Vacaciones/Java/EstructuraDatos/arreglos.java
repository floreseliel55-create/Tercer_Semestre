package EstructuraDatos;

public class arreglos {
    public static void main(String[] args){
        // estructura de datos mas conocida
        int[] arreglo = new int[9];
        //podemos insertar, buscar, eliminar, mostrar, ordenar, modificar datos mediante los arreglos
        int v=arreglo.length;
        int suma=0;
        for(int i=0;i<v;i++){
            arreglo[i]=suma++;
            if(i==v-1){
                System.out.print(arreglo[i]);
            }
            else{
                System.out.print(arreglo[i]+",");
            }
        }
    }
}
