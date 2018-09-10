import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String input = line.split(" ")[0]+line.split(" ")[1];
            ArrayList<Character> oddLetters = new ArrayList<>();
            ArrayList<Character> evenLetters = new ArrayList<>();
            for(int i = 0; i < input.length(); i++){
                if(i%2==0){
                    evenLetters.add(input.charAt(i));
                }
                else {
                    oddLetters.add(input.charAt(i));
                }
            }
            Collections.sort(oddLetters);
            Collections.sort(evenLetters);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i<input.length()/2; i++){
                sb.append(evenLetters.get(i)).append(oddLetters.get(i));
            }
            if(input.length()%2!=0){
                sb.append(evenLetters.get(evenLetters.size()-1));
            }
            for(int i = 0; i<sb.length(); i++){
                if(Character.isDigit(sb.charAt(i)) || sb.charAt(i)>=65 && sb.charAt(i)<=70 || sb.charAt(i)>=97 && sb.charAt(i)<=102){
                    sb.setCharAt(i, func(sb.charAt(i)));
                }
            }
            System.out.println(sb.toString());

        }
        scanner.close();

    }
    public static char func(char c) {
        return hexIntToChar(Integer.parseInt(new StringBuilder(String.format("%04d", Integer.parseInt(Integer.toBinaryString(convertCharToHexInt(c))))).reverse().toString(), 2));
    }

    public static int convertCharToHexInt(char c){
        if(c=='A' || c=='a'){
            return 10;
        }
        else if(c=='B' || c=='b'){
            return 11;
        }
        else if(c=='C' || c=='c'){
            return 12;
        }
        else if(c=='D' || c=='d'){
            return 13;
        }
        else if(c=='E' || c=='e') {
            return 14;
        }
        else if(c=='F' || c=='f') {
            return 15;
        }
        else {
            return c-48;
        }

    }

    public static char hexIntToChar(int i){
        if(i==10){
            return 'A';
        }
        else if(i == 11){
            return 'B';
        }
        else if(i == 12){
            return 'C';
        }
        else if(i == 13){
            return 'D';
        }
        else if(i == 14){
            return 'E';
        }
        else if(i == 15){
            return 'F';
        }
        else {
            return (char)(i+48);
        }
    }

}
