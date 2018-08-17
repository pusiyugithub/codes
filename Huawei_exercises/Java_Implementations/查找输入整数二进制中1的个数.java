import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(findNumberOf1(scanner.nextInt()));
        }
        scanner.close();
    }
    public static int findNumberOf1(int num)
    {
        String bin = Integer.toBinaryString(num);
        bin = bin.replace("0", "");
        return bin.length();
    }
}
