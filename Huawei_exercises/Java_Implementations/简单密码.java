import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.nextLine();
            char[] array = input.toCharArray();

            for(int i = 0; i<array.length; i++){
                if(Character.isUpperCase(array[i])){
                    array[i] = isUpper(array[i]);
                }
                else if(Character.isLowerCase(array[i])){
                    array[i] = isLower(array[i]);
                }
            }

            StringBuilder sb = new StringBuilder();
            for(char c: array){
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
        scanner.close();
    }

    public static char isUpper(char c){
        if(c!='Z'){
            return Character.toLowerCase((char)(c+1));
        }
        return 'a';
    }

    public static char isLower(char c){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('a', '2');
        map.put('b', '2');
        map.put('c', '2');
        map.put('d', '3');
        map.put('e', '3');
        map.put('f', '3');
        map.put('g', '4');
        map.put('h', '4');
        map.put('i', '4');
        map.put('j', '5');
        map.put('k', '5');
        map.put('l', '5');
        map.put('m', '6');
        map.put('n', '6');
        map.put('o', '6');
        map.put('p', '7');
        map.put('q', '7');
        map.put('r', '7');
        map.put('s', '7');
        map.put('t', '8');
        map.put('u', '8');
        map.put('v', '8');
        map.put('w', '9');
        map.put('x', '9');
        map.put('y', '9');
        map.put('z', '9');
        return map.get(c);
    }
}
