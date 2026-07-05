#include <iostream>

using namespace std;

int secuenciaFibonacci(int limite){
    if(limite<=1){
        return limite;
    }
    else {
        return secuenciaFibonacci(limite-1)+secuenciaFibonacci(limite-2);
    }

}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int limite;
    cout<<"Ingrese limite"<<endl;
    cin>>limite;

    cout<<secuenciaFibonacci(limite)<<endl;
    

    return 0;
}