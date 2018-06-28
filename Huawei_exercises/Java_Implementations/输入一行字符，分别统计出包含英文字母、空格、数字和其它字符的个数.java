import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int letterNum = 0;
            int digitNum = 0;
            int whiteSpace = 0;
            int other = 0;
            String input = scanner.nextLine();
            for(int i = 0; i<input.length(); i++){
                if(Character.isLetter(input.charAt(i))){
                    letterNum++;
                }
                else if(Character.isDigit(input.charAt(i))){
                    digitNum++;
                }
                else if(Character.isWhitespace(input.charAt(i))){
                    whiteSpace++;
                }
                else {
                    other++;
                }

            }
            System.out.println(letterNum);
            System.out.println(whiteSpace);
            System.out.println(digitNum);
            System.out.println(other);
        }
        scanner.close();

    }

}


