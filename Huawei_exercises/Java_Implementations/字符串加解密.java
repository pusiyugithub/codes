import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            System.out.println(new String(Encrypt(s1.toCharArray())));
            System.out.println(new String(unEncrypt(s2.toCharArray())));
        }
        scanner.close();
    }

    public static char[] Encrypt(char[] c){
        for(int i = 0; i<c.length; i++){
            if(Character.isAlphabetic(c[i])){
                if(c[i]=='z' || c[i]=='Z'){
                    c[i] = (char)((int)c[i]-25);
                }
                else{
                    c[i] = (char)((int)c[i]+1);
                }
                if(Character.isUpperCase(c[i])){
                    c[i] = Character.toLowerCase(c[i]);
                }
                else{
                    c[i] = Character.toUpperCase(c[i]);
                }
            }
            else if(Character.isDigit(c[i])){
                if(c[i] == '9'){
                    c[i] = (char)((int)c[i]-9);
                }
                else{
                    c[i] = (char)((int)c[i]+1);
                }
            }
        }
        return c;
    }

    public static char[] unEncrypt(char[] c){
        for(int i = 0; i<c.length; i++){
            if(Character.isAlphabetic(c[i])){
                if(c[i]=='a' || c[i]=='A'){
                    c[i] = (char)((int)c[i]+25);
                }
                else{
                    c[i] = (char)((int)c[i]-1);
                }
                if(Character.isUpperCase(c[i])){
                    c[i] = Character.toLowerCase(c[i]);
                }
                else{
                    c[i] = Character.toUpperCase(c[i]);
                }
            }

            else if(Character.isDigit(c[i])){
                if(c[i] == '0'){
                    c[i] = (char)((int)c[i]+9);
                }
                else{
                    c[i] = (char)((int)c[i]-1);
                }
            }
        }
        return c;
    }

    
}