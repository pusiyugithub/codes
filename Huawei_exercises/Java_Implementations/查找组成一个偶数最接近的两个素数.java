import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            findTwoPrimes(scanner.nextInt());
        }
        scanner.close();
    }

    public static void findTwoPrimes(int num){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<String> pairs = new ArrayList<>();
        for(int i = 1; i<num; i++){
            if (isPrime(i)) {
                    a.add(i);
            }
        }
        for(int i = 0; i<a.size(); i++){
            for(int j = 0; j<a.size(); j++){
                if(i<=j && a.get(i)+a.get(j)==num){
                    pairs.add(String.valueOf(a.get(i))+" "+String.valueOf(a.get(j)));
                }
            }
        }
        String result = pairs.get(pairs.size()-1);
        System.out.println(result.split(" ")[0]);
        System.out.println(result.split(" ")[1]);

    }

    public static boolean isPrime(int num){
        for(int i = 2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
