import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.println(count(scanner.nextInt()));
        }
        scanner.close();
    }
    public static int count(int n){
        if(n<=0 || n>500000){
            return -1;
        }
        int index = 0;
        for(int i = 1; i<=n; i++){
            int sum = 0;
            for(int k = 1; k< i; k++){
                if(i%k == 0){
                    sum = sum + k;
                }
            }
            if(sum == i){
                index++;
            }
        }
        return index;
    }
}

