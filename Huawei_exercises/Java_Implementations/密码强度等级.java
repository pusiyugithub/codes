import java.util.Scanner;

public class Test14{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.println(GetPwdSecurityLevel(scanner.nextLine()));
        }
        scanner.close();
    }
    public static String GetPwdSecurityLevel(String pPasswordStr){
        int score = checkLength(pPasswordStr)+checkAlphabet(pPasswordStr)+checkDigit(pPasswordStr)+checkSymbol(pPasswordStr)+checkBonus(pPasswordStr);
        if(score>=90){
            return "VERY_SECURE";
        }
        else if(score>=80){
            return "SECURE";
        }
        else if(score>=70){
            return "VERY_STRONG";
        }
        else if(score>=60){
            return "STRONG";
        }
        else if(score>=50){
            return "AVERAGE";
        }
        else if(score>=25){
            return "WEAK";
        }
        return "VERY_WEAK";
    }

    public static int checkLength(String pPasswordStr){
        if(pPasswordStr.length() <= 4){
            return 5;
        }
        else if(pPasswordStr.length()>=5 && pPasswordStr.length()<=7) {
            return 10;
        }
        else {
            return 25;
        }
    }

    public static int checkAlphabet(String pPasswordStr){
        String temp = pPasswordStr.replaceFirst("[a-z]", "").replaceFirst("[A-Z]","");
        if(pPasswordStr.length()-temp.length()==2){
            return 20;
        }
        else if(pPasswordStr.length()-temp.length()==1){
            return 10;
        }
        else {
            return 0;
        }
    }

    public static int checkDigit(String pPasswordStr){
        String temp = pPasswordStr.replaceFirst("[0-9]", "").replaceFirst("[0-9]","");
        if(pPasswordStr.length()-temp.length()==2){
            return 20;
        }
        else if(pPasswordStr.length()-temp.length()==1){
            return 10;
        }
        else {
            return 0;
        }
    }

    public static int checkSymbol(String pPasswordStr) {
        String temp = pPasswordStr.replaceFirst("\\W", "").replaceFirst("\\W","");
        if(pPasswordStr.length()-temp.length()==2){
            return 25;
        }
        else if(pPasswordStr.length()-temp.length()==1){
            return 10;
        }
        else {
            return 0;
        }
    }

    public static int checkBonus(String pPasswordStr){
        if(checkAlphabet(pPasswordStr) == 20 && checkDigit(pPasswordStr)>=10 && checkSymbol(pPasswordStr)>=10){
            return 5;
        }
        else if(checkAlphabet(pPasswordStr) >= 10 && checkDigit(pPasswordStr)>=10 && checkSymbol(pPasswordStr)>=10){
            return 3;
        }
        else if(checkAlphabet(pPasswordStr) >= 10 && checkDigit(pPasswordStr)>=10){
            return 2;
        }
        return 0;
    }




}

