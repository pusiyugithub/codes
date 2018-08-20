import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Test3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            int[][] array = new int[num][num];
            int startValue = 0;
            for(int k = 0; k< num; k++){
                for(int i = k; i>=0; i--){
                    int j = k-i;
                    array[i][j] = ++startValue;
                }
            }
            for(int i =0 ;i <num; i++){
               for(int j = 0; j<num; j++){
                   if(array[i][j]>0){
                       System.out.print(array[i][j]+" ");
                   }
               }
               System.out.println();
            }
        }
        scanner.close();
    }
}
