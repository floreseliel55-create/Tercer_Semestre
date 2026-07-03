#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main(){

    string cadena="abc";
    int n=cadena.size()+1;
    vector<string> prefijos;
    for(int i=0; i<n; i++){
        prefijos.push_back(cadena.substr(0,i));
    }
    for(int j=0;j<prefijos.size();j++){
        cout<< prefijos[j]<< endl;
    }


    

    return 0;
}