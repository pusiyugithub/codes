import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            ArrayList<Integer> a = new ArrayList<>();
            int num = Integer.parseInt(scanner.next());
            int factor = 2;
            while(!isPrimeNum(num)){
                    if(num%factor==0){
                        num = num/factor;
                        a.add(factor);
                        continue;
                    }
                    else {
                        factor++;
                        while(!isPrimeNum(factor)){
                            factor++;
                        }
                        continue;
                    }
            }
            a.add(num);
            for(Integer i:a){
                System.out.print(i+" ");
            }

        }
        scanner.close();

    }
    public static boolean isPrimeNum(int num){
        for(int i = 2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
