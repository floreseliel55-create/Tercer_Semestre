#include <iostream>


using namespace std;

int funNoRecursiva(int num){
        int resultado=1;
        int variable;
        while(num>1){
            cout<<"valor de numero: "<<num<<endl;
            resultado*=num;
            cout<<"valor resultado: "<<resultado<<endl;
            num--;
        }
        return resultado;
    }
int funRecursiva(int num){
    //cuando el numero llegue a 1 returna 1
    if(num==1){
        return 1;
    }
    // numero se multiplica por la funcion recursiva de un numero anterior y esa funcion recursiva su numero que es num-1
    // se multiplica por la funcion recursiva de n-1-1 y asi hasta que llegue a 5x4x3x2x1 etc
    else{
        return num*funRecursiva(num-1);
        //4x3x2x1
    }
}

int main(){
    // para mejorar el rendimiento
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    // programa que saque el resultado de un numero factorial usando la recursion
    int num;

    cout<<"Ingrese un numero a sacar su factorial:" <<endl;
    cin>>num;
    cout<<"El factorial del numero "<<num<<" Es :"<<funRecursiva(num)<<endl;
    // normalmente haria esto
    return 0;
}