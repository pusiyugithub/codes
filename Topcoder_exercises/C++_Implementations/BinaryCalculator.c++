#include <iostream>
#include <algorithm>

using namespace std;
const int ADD = 3;
const int DELETE = -2;
class BinaryCalculator{
    public:
    int minimumSteps(int a, int b){
        int count = 0;
        while (a!=b){
            if(a<b){
                a = a+ADD;
                count++;

            } else{
                a = a+DELETE;
                count++;
            }
        }
        return count;
    }
};
int main() {
    int a;
    int b;
    cin>>a;
    cin>>b;
    BinaryCalculator *binaryCalculator = new BinaryCalculator();
    cout<<binaryCalculator->minimumSteps(a,b)<<endl;
    return 0;
}

