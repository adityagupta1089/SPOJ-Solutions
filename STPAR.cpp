#include <iostream>
#include <stack>
using namespace std;

int main(){
        int n; cin>>n;
        do {
                int a[n];
                for(int _i=0; _i<n; _i++) cin>>a[_i];
                stack<int> side;
                int c=1,j=0; e
                for (int i = 0;; i++) {
                        if (!side.empty()&&side.top()==c) {
                                c++; side.pop();
                        } else if (a[j]==c) {
                                c++; j++;
                        } else if(j<n) {
                                side.push(a[j++]);
                        }else{
                                break;
                        }
                }
                if(c==n+1) cout<<"yes"<<endl;
                else cout<<"no"<<endl;
                cin>>n;
        } while(n!=0);
}
