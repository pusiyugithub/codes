import java.util.HashSet;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        HashSet<Character> set = new HashSet();
        String input = new Scanner(System.in).nextLine();
        for(int i = 0; i<input.length(); i++){
            set.add(input.charAt(i));
        }
        System.out.print(set.size());
    }
}