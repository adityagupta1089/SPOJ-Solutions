#include <iostream>
#include <math.h>
#include <iomanip>
using namespace std;

int main(){
        double n; cin>>n;
        do {
                const double pi = 3.1415926535897;
                cout<<fixed<<setprecision(2)<<n*n/(2*pi)<<endl;
                cin>>n;
        } while(n!=0);
        return 0;
}
