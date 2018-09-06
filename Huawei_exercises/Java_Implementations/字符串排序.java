import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String input = scanner.nextLine();
            ArrayList<Character> letters = new ArrayList<>();
            ArrayList<Integer> indexs = new ArrayList<>();
            HashMap<Integer, String> map = new HashMap<>();
            for(int i = 0; i<input.length(); i++){
                if(Character.isLetter(input.charAt(i))){
                    letters.add(input.charAt(i));
                }
                else {
                    indexs.add(i);
                    map.put(i, String.valueOf(input.charAt(i)));
                }
            }
            Collections.sort(letters, new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    if(Character.isLetter(o1)&&Character.isLetter(o2)){
                        return Character.toLowerCase(o1)-Character.toLowerCase(o2);
                    }
                    return 0;
                }
            });
            StringBuilder sb = new StringBuilder();
            StringBuilder testing = new StringBuilder();
            for(Character c:letters){
                sb.append(c);
            }
            for(int i = 0; i<indexs.size(); i++){

                sb.insert(indexs.get(i), map.get(indexs.get(i)));
            }
            System.out.println(sb.toString());

        }
        scanner.close();
    }
}
