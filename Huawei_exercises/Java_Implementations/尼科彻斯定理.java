import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);    
        while(scanner.hasNext()){
            int input = Integer.parseInt(scanner.nextLine());
            int firstNum = (int)Math.pow(input, 2)-input +1;
            StringBuffer sb = new StringBuffer();
            if(input==1){
                System.out.println(firstNum);
            }
            else{
                for(int i = 0; i<input-1; i++){
                    sb.append(String.valueOf(firstNum)).append("+");
                    firstNum = firstNum+2;
                }
                sb.append(String.valueOf(firstNum));
                System.out.println(sb.toString());
            }
        }
        scanner.close();
    }
}