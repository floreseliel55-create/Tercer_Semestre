#include <iostream>
#include <stdlib.h>
#include <string>

using namespace std;

class Estudiante{
    private:
     int calificacion;
     string nombre;
     

    public:
        Estudiante(string, int);
        void setCalificacion(int);
        void setNombre(string);
        int getCalificacion();
        string getNombre();

};
Estudiante::Estudiante(string nom, int cal){
    nombre=nom;
    calificacion=cal;
}
void Estudiante::setCalificacion(int cal){
    calificacion=cal;
}
void Estudiante::setNombre(string nom){
    nombre=nom;
}
int Estudiante::getCalificacion(){
    return calificacion;
}
string Estudiante::getNombre(){
    return nombre;
}