import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public String reverse(String sentence){
        ArrayList<String> a = new ArrayList<>();
        String[] stringArrays = sentence.split(" ");
        for(int i = 0; i<stringArrays.length; i++){
            a.add(stringArrays[i]);
        }
        Collections.reverse(a);
        StringBuffer sb = new StringBuffer();
        for(int i =0; i<a.size(); i++){
            sb.append(a.get(i)).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.print(new Main().reverse(sentence));

    }
}