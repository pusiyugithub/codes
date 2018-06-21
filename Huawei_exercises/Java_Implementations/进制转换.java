import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String input = sc.next();
            System.out.println(Integer.parseInt(input.substring(2), 16));
        }
        sc.close();
    }
}