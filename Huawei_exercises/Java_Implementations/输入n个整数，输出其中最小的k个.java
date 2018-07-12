import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            StringBuffer sb = new StringBuffer();
            String firstLine = sc.nextLine();
            String[] splitFirstLine = firstLine.split(" ");
            int arraySize = Integer.parseInt(splitFirstLine[0]);
            int num = Integer.parseInt(splitFirstLine[1]);

            String secondLine = sc.nextLine();
            String[] splitSecondLine = secondLine.split(" ");
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0; i<splitSecondLine.length; i++){
                a.add(Integer.parseInt(splitSecondLine[i]));
            }
            Collections.sort(a);

            for(int i=0; i<num; i++){
                sb.append(a.get(i)).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
        sc.close();


    }
}

