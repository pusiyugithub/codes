import java.util.*;

public class Test2 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String key = scanner.nextLine();
            String data = scanner.nextLine();
            System.out.println(func(key, data));
        }
        scanner.close();
    }

    public static String func(String key, String data){
        HashMap<Character, Character> map = new HashMap<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        key = key.toUpperCase();
        for(int i = 0; i<key.length(); i++){
            set.add(key.substring(i, i+1));
        }
        String newKey = "";
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            newKey = newKey + iterator.next();
        }
        String alphabet = "";
        for(int i = 65; i<91; i++){
            alphabet = alphabet + (char)i;
        }
        String keyAlphabet = alphabet;
        for(int i = 0; i<newKey.length(); i++){
            keyAlphabet = keyAlphabet.replace(newKey.substring(i, i+1), "");
        }
        keyAlphabet = newKey + keyAlphabet;
        for(int i = 0; i<26; i++){
            map.put(alphabet.charAt(i), keyAlphabet.charAt(i));
        }
        alphabet = alphabet.toLowerCase();
        keyAlphabet = keyAlphabet.toLowerCase();
        for(int i = 0; i<26; i++){
            map.put(alphabet.charAt(i), keyAlphabet.charAt(i));
        }
        char[] dataArray = data.toCharArray();
        for(int i = 0; i<dataArray.length; i++){
            if(Character.isAlphabetic(dataArray[i])){
                dataArray[i] = map.get(dataArray[i]);
            }
        }
        return new String(dataArray);
    }
}
