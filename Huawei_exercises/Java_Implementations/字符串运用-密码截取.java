import java.util.Scanner;

public class Test3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(func(scanner.nextLine()));
        }
        scanner.close();
    }

    public static int func(String line){
        for(int i = 0; i<line.length(); i++){
            for(int j = 0; j<=i; j++){
                String subString = line.substring(j, line.length()-i+j);
                String converse = new StringBuffer(subString).reverse().toString();
                if(subString.equals(converse)){
                    return subString.length();
                }
            }
        }
        return 0;
    }
}
