import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.next();
            System.out.println(Math.round(Float.parseFloat(input)));
        }
        scanner.close();

    }
}