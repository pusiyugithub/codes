import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedHashSet;

public class Main{
    public static void main(String args[]){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        ArrayList<Character> a = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        String input = new StringBuffer(new Scanner(System.in).nextLine()).reverse().toString();
        for(int i = 0; i<input.length(); i++){
            set.add(input.charAt(i));
        }
        a.addAll(set);
        for(int i = 0; i<a.size(); i++){
            sb.append(a.get(i));
        }
        System.out.print(sb.toString().trim());
    }
}