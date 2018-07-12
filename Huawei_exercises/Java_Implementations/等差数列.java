import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            System.out.println(2*a+a*(a-1)*3/2);
        }
        scanner.close();
    }
}