import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
           int num = Integer.parseInt(scanner.nextLine());
           Integer[] integers = new Integer[num];
           String[] s = scanner.nextLine().split(" ");
           int iSortFlag = Integer.parseInt(scanner.nextLine());
           for (int i=0; i<num; i++){
               integers[i] = Integer.parseInt(s[i]);
           }

           sortIntegerArray(integers, iSortFlag);

        }
        scanner.close();

    }

    public static void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag){
        ArrayList<Integer> a = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<pIntegerArray.length; i++){
            a.add(pIntegerArray[i]);
        }
        Collections.sort(a);
        if(iSortFlag==1){
            Collections.reverse(a);
        }
        for (int i = 0; i<a.size(); i++){
            sb.append(a.get(i)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

}


