import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String num = scanner.next();
        System.out.print(input.length()-input.toUpperCase().replace(num.toUpperCase(),"").length());
    }
}