#include <iostream>
#include <stdint.h>
using namespace std;

int main(){
        int t;
        cin>>t;
        for (int i = 0; i < t; i++) {
                int64_t val =1;
                int64_t n; cin>>n;
                val=(n*(n+2)*(2*n+1)/8);
                cout<<val<<endl;
        }
}
