import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        System.out.println(Integer.parseInt(new StringBuffer(String.valueOf(new Scanner(System.in).nextInt())).reverse().toString()));
    }
}
