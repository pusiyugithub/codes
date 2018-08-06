import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s1 = scanner.next();
            String s2 = scanner.next();
            longestCommon(s1, s2);
        }
        scanner.close();
    }

    public static String longestCommon(String s1, String s2){
        if(s1.length()>s2.length()){
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        for(int i = s1.length(); i>0; i--){
           for(int j = 0; j<=s1.length()-i; j++){
                if(s2.contains(s1.substring(j, j+i))){
                    System.out.println(s1.substring(j,j+i));
                    return s1.substring(j,j+i);
                }
           }
        }
        return "";
    }

}
