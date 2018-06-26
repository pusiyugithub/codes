#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    string str;
    getline(cin, str);
    reverse(str.begin(), str.end());
    int count = 0;
    for(int i = 0; i<str.length(); i++){
        if(str[i] != 32){
            count++;
        } else
            break;
    }
    cout<<count<<endl;
    return 0;
}