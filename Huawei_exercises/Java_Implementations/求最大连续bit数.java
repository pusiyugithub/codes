import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String input = Integer.toBinaryString(Integer.parseInt(scanner.nextLine()));
            if(input.contains("11111111")) {
                System.out.println("8");
             }
            else if(input.contains("1111111")){
                System.out.println("7");
            }
            else if(input.contains("111111")){
                System.out.println("6");
            }else if(input.contains("11111")){
            System.out.println("5");
            }else if(input.contains("1111")){
              System.out.println("4");
            }
            else if(input.contains("111")){
              System.out.println("3");
            }else if(input.contains("11")){
                System.out.println("2");
            }
            else if(input.contains("1")){
               System.out.println("1");
             }
             else{
              System.out.println("0");
             }
             }
        scanner.close();
        

    }
}