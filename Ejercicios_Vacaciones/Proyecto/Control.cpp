#include <iostream>
#include <vector>
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

void alumnosAprobados(vector<Estudiante> alumnos){
    for(int i=0;i<alumnos.size();i++){
        if(alumnos[i].getCalificacion()>=70){
            cout<<alumnos[i].getNombre()<<endl;
        }
    }
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    vector<Estudiante> alumnos;
    int n;
    cout<<"Ingrese la cantidad de estudiantes"<<endl;
    cin>>n;

    for(int i=0;i<n;i++){
        string nombre;
        int calificacion;
        cout<<"Ingrese nombre: "<<endl;
        cin>>nombre;
        cout<<"Ingrese calificacion: "<<endl;
        cin>>calificacion;

        alumnos.push_back(Estudiante(nombre, calificacion));
    }

    for(int j=0;j<alumnos.size();j++){
        cout<<alumnos[j].getNombre()<<endl;
        cout<<alumnos[j].getCalificacion()<<endl;
    }

    cout<<"Alumnos aprobados: "<< endl;
    alumnosAprobados(alumnos);
    return 0;
}