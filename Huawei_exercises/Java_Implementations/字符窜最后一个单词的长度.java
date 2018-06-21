import java.util.Scanner;
public class Main {
    public static void main(String args[]){
       System.out.print(new StringBuffer(new Scanner(System.in).nextLine()).reverse().toString().split(" ")[0].length());
    }
}
