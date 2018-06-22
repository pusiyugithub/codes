import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;


public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if(n>=1&&n<=1000){
            ArrayList<String> arrayList = new ArrayList<>();
            for(int i= 0; i<n; i++){
                String str = sc.nextLine();
                if(str.length()>100){
                    System.exit(1);
                }
                arrayList.add(str);
            }
            Comparator c = new Comparator(){
                @Override
                public int compare(Object o1, Object o2) {
                    String s1 = (String)o1;
                    String s2 = (String)o2;
                    if(s1.compareTo(s2)>0){
                        return 1;
                    }
                    else if(s1.compareTo(s2)==0){
                        return 0;
                    }
                    return -1;
                }
            };
            Collections.sort(arrayList, c);
            for(String s:arrayList){
                System.out.println(s);
            }
        }
        else{
            System.exit(1);
        }

    }
}
