import java.util.ArrayList;
import java.util.Scanner;

public class Test2{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = Integer.parseInt(scanner.nextLine());
            ArrayList<String> s = new ArrayList<>();
            for(int i = 0; i<num; i++){
                s.add(scanner.nextLine());
            }
            func(s);
        }
        scanner.close();

    }

    public static void func(ArrayList<String> s){
        for(String str: s){
            while(str.length() > 8){
                System.out.println(str.substring(0, 8));
                str = str.substring(8);
            }
            int l = 8 - str.length();
            for(int i = 0; i<l; i++){
                str = str + "0";
            }
            System.out.println(str);
        }
    }
}