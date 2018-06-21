import java.util.Scanner;
import java.util.TreeSet;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            TreeSet<Integer> t = new TreeSet();
            if(num<=1000){
               for(int i = 0; i<num; i++){
                   t.add(scanner.nextInt());
               }
            }
            System.out.print(ans(t));
        }
        scanner.close();
    }

    public static String ans(TreeSet<Integer> t){
        StringBuffer sb = new StringBuffer();
        for(Integer i: t){
            sb.append(i).append("\n");
        }

        return sb.toString();
    }
}
