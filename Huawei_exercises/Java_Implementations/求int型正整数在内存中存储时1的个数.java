import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        String binaryString = Integer.toBinaryString(new Scanner(System.in).nextInt());
        System.out.println(binaryString.length()-binaryString.replaceAll("1","").length());
    }
}
