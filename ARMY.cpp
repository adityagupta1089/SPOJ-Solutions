#include <iostream>
#include <algorithm>
using namespace std;

int main(){
        int t,ng,nm;
        cin>>t;
        for(int i=0; i<t; i++) {
                cin>>ng>>nm;
                int g[ng], m[nm];
                for(int _i=0; _i<ng; _i++)
                        cin>>g[_i];
                for(int _i=0; _i<nm; _i++)
                        cin>>m[_i];
                sort(g,g+ng);
                sort(m,m+nm);
                int ig=0,im=0;
                while(ig<ng&&im<nm) {
                        if(g[ig]<m[im])
                                ig++;
                        else
                                im++;
                }
                if(ig==ng)
                        cout<<"MechaGodzilla"<<endl;
                else
                        cout<<"Godzilla"<<endl;
        }
}
