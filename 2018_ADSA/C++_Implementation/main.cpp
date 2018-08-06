#include<iostream>
#include<vector>
#include<string>
#include<cstring>
#include<algorithm>

using namespace std;
int base;
void checkMaxLength(string&, string&);
string schoolMethod(string, string);
string sub(string, string);
string Karatsuba(string, string);
string deleteZeros(string);
string addPowerZeros(string, int);
string mult(string, string);
string division(string, string);


int main(){
    string firstNum;
    string secondNum;
    cin>>firstNum;
    cin>>secondNum;
    cin>>base;
    cout<<schoolMethod(firstNum, secondNum)<<" "<<Karatsuba(firstNum, secondNum)<<" "<<division(firstNum, secondNum)<<endl;
    return 0;
}

string schoolMethod(string firstNum, string secondNum){
    checkMaxLength(firstNum, secondNum);
    int carry = 0;
    vector<char> v;
    
    for(int i = firstNum.length()-1; i>=0; i--){
        if((int)(firstNum[i]-48)+(int)(secondNum[i]-48)+carry < base){
            v.push_back((char)((int)(firstNum[i]-48)+(int)(secondNum[i]-48)+carry+48));
            carry = 0;
        }
        else{
            v.push_back((char)((int)(firstNum[i]-48)+(int)(secondNum[i]-48)+carry-base+48));
            carry = 1;
        }
    }
    v.push_back((char)(carry+48));
    string additionResult;
    for(int i = v.size()-1; i>=0; i--){
        additionResult = additionResult + v[i];
    }
    
    if(additionResult == "0"){
        return additionResult;
    }
    
    return deleteZeros(additionResult);

}

void checkMaxLength(string &firstNum, string &secondNum){
    firstNum = deleteZeros(firstNum);
    secondNum = deleteZeros(secondNum);
    int largeLength = max(firstNum.length(), secondNum.length());
    int smallLength = min(firstNum.length(), secondNum.length());
    int addZeros = largeLength - smallLength;
    if(firstNum.length()<largeLength){
        for(int i = 0; i<addZeros; i++){
            firstNum = "0" + firstNum;
        }
    }
    if(secondNum.length()<largeLength){
        for(int i = 0; i<addZeros; i++){
            secondNum = "0" + secondNum;
        }
    }
}


string sub(string firstNum, string secondNum){
    checkMaxLength(firstNum, secondNum);
    vector<char> v;
    int carry = 0;
    bool index = false;
    if(firstNum < secondNum){
        string temp;
        temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        index = true;
    }
    for(int i = firstNum.length()-1; i>=0; i--){
        
        if((int)(firstNum[i]-48)-(int)(secondNum[i]-48)-carry < 0){
            v.push_back((char)(base+(int)(firstNum[i]-48)-(int)(secondNum[i]-48)-carry+48));
            carry = 1;
        }
        else{
            v.push_back((char)((int)(firstNum[i]-48)-(int)(secondNum[i]-48)-carry+48));
            carry = 0;
        }
    }
    string subResult;
    for(int i = v.size()-1; i>=0; i--){
        subResult = subResult + v[i];
    }

    if(subResult == "0"){
        return subResult;
    }
    else if(index == true){
        return "-"+deleteZeros(subResult);
    }
    else{
        return deleteZeros(subResult);
    }
    
   
}

string Karatsuba(string firstNum, string secondNum){
    
    checkMaxLength(firstNum, secondNum);
    if(firstNum.length()<4){
       
        return mult(firstNum, secondNum);
    }
    else{
        int k = firstNum.length()/2;

        string a0 = firstNum.substr(firstNum.length()-k, firstNum.length());
        string a1 = firstNum.substr(0, firstNum.length()-k);
        string b0 = secondNum.substr(firstNum.length()-k, firstNum.length());
        string b1 = secondNum.substr(0, firstNum.length()-k);


        // cout<<k<<endl;
        // cout<<a0<<endl;
        // cout<<a1<<endl;
        // cout<<b0<<endl;
        // cout<<b1<<endl;


        // cout<<endl;
        // string PRODUCTa1b1 = Karatsuba(a1, b1);
        // string PRODUCTa1b0 = Karatsuba(a1, b0);
        // string PRODUCTa0b1 = Karatsuba(a0, b1);
        // string PRODUCTa0b0 = Karatsuba(a0, b0);
        // string SUMa1a0 = schoolMethod(a1, a0);
        // string SUMb1b0 = schoolMethod(b1, b0);

        // string firstPart = addPowerZeros(PRODUCTa1b1, 2*k);
        // string secondPart =addPowerZeros(sub(Karatsuba(SUMa1a0, SUMb1b0), schoolMethod(PRODUCTa1b1, PRODUCTa0b0)), k);
        // string thirdPart  = PRODUCTa0b0;
        // return firstPart + secondPart + thirdPart;

        return schoolMethod(schoolMethod(addPowerZeros(Karatsuba(a1, b1), 2*k), addPowerZeros(sub(Karatsuba(schoolMethod(a1, a0), schoolMethod(b1, b0)), schoolMethod(Karatsuba(a1, b1), Karatsuba(a0, b0))), k)), Karatsuba(a0, b0));
        // return "testing";
        // return PRODUCTa1b1;
    }
    
    
}

string deleteZeros(string str){
    int index = 0;
    for(int i = 0; i<str.length(); i++){
        if(str[i] == '0'){
            index++;
        }
        else{
            break;
        }
    }
    if(index == str.length()){
        return "0";
    }
    str = str.erase(0, index);
    return str;
}

string addPowerZeros(string str, int zeroNums){
    str = deleteZeros(str);
    if(str == "0"){
        return str;
    }
    if(zeroNums == 0){
        return str;
    }
    else{
        for(int i = 0; i<zeroNums; i++){
            str = str + "0";
        }
        return str;
    }
}

string mult(string firstNum, string secondNum){
    checkMaxLength(firstNum, secondNum);
    if(firstNum.length() == 1 && secondNum.length()==1){
            if(firstNum[0]=='0' || secondNum[0] == '0'){
                return "0";
            }
            int i1 = (int)(firstNum[0]-48);
            int i2 = (int)(secondNum[0]-48);
            string result;

            if(i1 * i2 < base){
                result = result + (char)(i1*i2+48);
            }
            else{
                result = result + (char)(i1 * i2 / base+48) + (char)(i1 * i2 % base+48);
            }
            return result;
    }
    
    int k = firstNum.length()/2;
    string a0 = firstNum.substr(firstNum.length()-k, firstNum.length());
    string a1 = firstNum.substr(0, firstNum.length()-k);
    string b0 = secondNum.substr(firstNum.length()-k, firstNum.length());
    string b1 = secondNum.substr(0, firstNum.length()-k);
    string p1 = addPowerZeros(mult(a1, b1), 2*k);
    string p2 = addPowerZeros(schoolMethod(mult(a1, b0), mult(a0, b1)), k);
    string p3 = mult(a0, b0);
    return schoolMethod(schoolMethod(p1,p2), p3);
}

string division(string firstNum, string secondNum){
    firstNum = deleteZeros(firstNum);
    secondNum = deleteZeros(secondNum);
    if(firstNum == "0"){
        return "0";
    }
    if(secondNum == "0"){
        return "Error";
    }
    
    if(firstNum.length() < secondNum.length()){
        return "0";
    }
    else if(firstNum.length() == secondNum.length() && firstNum < secondNum){
       return "0";    
    }
    else{
       
        string index = secondNum;
        string lastIndex = "0";
        while(firstNum.length() > index.length()){
            lastIndex = index;
            index = addPowerZeros(index, 1);
        }
        if(firstNum >= index){
            string quotient = addPowerZeros("1", index.length()- secondNum.length());
            firstNum = sub(firstNum, index);
            return schoolMethod(quotient, division(firstNum, secondNum));
        }
        else{
            string quotient = addPowerZeros("1", lastIndex.length()- secondNum.length());
            firstNum = sub(firstNum, lastIndex);
            return schoolMethod(quotient, division(firstNum, secondNum));
        }
        
       
    }
}   


