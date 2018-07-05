import java.util.Scanner;

public class BinaryCalculator {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int currentNum = scanner.nextInt();
            int nextNum = scanner.nextInt();
            System.out.println(minimumSteps(currentNum, nextNum));
        }
    }

    public static int minimumSteps(int a, int b){
        final int ADD = 3;
        final int DELETE = -2;
        int count = 0;
        while(a!=b){
            if(a<b){
                a = a+ADD;
                count++;
            }
            else {
                a = a+DELETE;
                count++;
            }
        }
        return count;
    }
}
