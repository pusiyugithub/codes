import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String firstString = sc.next();
            String secondString = sc.next();
            if(firstString.length()<100 || secondString.length()<100){
                newString(firstString, secondString);
            }
        }
        sc.close();
    }

    public static void newString(String firstString, String secondString){
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> newString = new ArrayList<>();
        String appendString[] = {"", "0", "00","000", "0000", "00000", "000000", "0000000"};
        int i = 0;
        while(i<firstString.length()-8){
            a.add(firstString.substring(i, i+8));
            i = i+8;
        }
        a.add(firstString.substring(i, firstString.length()));

        i = 0;
        while(i<secondString.length()-8){
            a.add(secondString.substring(i, i+8));
            i = i+8;
        }
        a.add(secondString.substring(i, secondString.length()));
        for(String s:a){
            s = new StringBuffer(s).append(appendString[8-s.length()]).toString();
            newString.add(s);
        }
        for(String s: newString){
            System.out.println(s);
        }

    }

}