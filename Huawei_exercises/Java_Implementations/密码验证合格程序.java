import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Test{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            identifyPassword(scanner.nextLine());
        }
        scanner.close();
    }

    public static void identifyPassword(String password){
        if(password.length()>8 && isContainFourSymbols(password) && notDuplicatie(password)){
            System.out.println("OK");
        }
        else{
            System.out.println("NG");
        }
    }

    public static boolean isContainFourSymbols(String password){
        int index = 0;
        if(password.replaceFirst("\\p{Digit}", "").length()<password.length()){
            index++;
        }
        if(password.replaceFirst("\\p{Lower}", "").length()<password.length()){
            index++;
        }
        if(password.replaceFirst("\\p{Upper}", "").length()<password.length()){
            index++;
        }
        if(password.replaceFirst("[^\\p{Alnum}]", "").length()<password.length()){
            index++;
        }
        if(index<3){
            return false;
        }
        else {
            return true;
        }


    }

    public static boolean notDuplicatie(String password){
        ArrayList<String> subPasswordsArray = new ArrayList<>();
        HashSet<String> subPasswordsSet = new HashSet<>();
        for(int i = 0; i<password.length()-3; i++){
            subPasswordsArray.add(password.substring(i, i+3));
            subPasswordsSet.add(password.substring(i, i+3));
        }
        if(subPasswordsArray.size() == subPasswordsSet.size()){
            return true;
        }
        else{
            return false;
        }
    }

}