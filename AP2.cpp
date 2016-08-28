#include <iostream>
#include <stdint.h>

using namespace std;

int main(){
        //a, a+d, a+2d ... a+(n-3)d, a+(n-2)d, a+(n-1)d
        //sum = (n/2)[2a+(n-1)d]
        // x=a+2d, y=a+(n-3)d
        // (n/2)[x+y]=sum, n=2*sum/(x+y)
        // y-x = (n-5)d => d = (y-x)/(n-5)
        int64_t t; cin>>t;
        for (size_t i = 0; i < t; i++) {
                int64_t x,y,s; cin>>x>>y>>s;
                int64_t n=2*s/(x+y);
                cout<<n<<endl;
                int64_t d =(y-x)/(n-5);
                int64_t a = x-2*d;
                for (size_t i = 0; i < n; i++) {
                        cout<<a+i*d<<" ";
                }
        }
}
