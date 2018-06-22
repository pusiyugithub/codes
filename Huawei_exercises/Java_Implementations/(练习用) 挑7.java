import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.next();
            if(Integer.parseInt(input)<=30000){
                System.out.println(countNum(input));
            }
        }

    }
    public static int countNum(String input){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 7; i<=Integer.parseInt(input); i++){
            if(Integer.toString(i).contains("7")){
                a.add(i);
            }
            else if(i%7==0){
                a.add(i);
            }
        }
        return a.size();
    }
}
