import java.util.Scanner;
public class Test {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            int count = 0;
            for(int a= 0; a<=num; a++){
                String s1 = String.valueOf(a);
                String s2 = new StringBuffer(new StringBuffer(String.valueOf(a * a)).reverse().substring(0, s1.length())).reverse().toString();
                if(s1.equals(s2)){
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
