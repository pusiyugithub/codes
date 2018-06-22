import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        DecimalFormat d = new DecimalFormat("0.0");
        int count = 0;
        float sum = 0;
        while (scanner.hasNext()){
            a.add(scanner.nextInt());
        }
        scanner.close();
        Iterator<Integer> i = a.iterator();
        while(i.hasNext()){
            int num = i.next();
            if(num<0){
                count++;
                i.remove();
            }

        }
        System.out.println(count);
        for(Integer in: a){
            sum = sum + in;
        }
        if(a.size()!=0){
            System.out.print(d.format(sum/a.size()));
        }


    }
}
