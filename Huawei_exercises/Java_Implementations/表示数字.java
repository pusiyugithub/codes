import java.util.ArrayList;
import java.util.Scanner;

public class Test12 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String result = "";
            String[] nums = line.replaceAll("[^\\d]", " ").split("\\s+");
            String[] notNums = line.replaceAll("\\d", " ").split("\\s+");
            ArrayList<String> notNumsArray = new ArrayList<>();
            ArrayList<String> numsArray = new ArrayList<>();
            for(String s: notNums){
                if(!s.equals("")){
                    notNumsArray.add(s);
                }
            }
            for(String s: nums){
                if(!s.equals("")){
                    numsArray.add("*"+s+"*");
                }
            }
            if(Character.isDigit(line.charAt(0))){
                for (String s:notNumsArray){
                    result = result + "$"+s;
                }
                result = result + "$";
            }
            else {
                for (String s:notNumsArray){
                    result = result +s+"$";
                }
            }
            for(String s:numsArray){
                result = result.replaceFirst("\\$", s);
            }
            System.out.println(result.replaceAll("\\$", ""));
        }
        scanner.close();
    }
}
