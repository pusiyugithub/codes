import java.util.*;

public class Test2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(func(scanner.nextLine()));
        }
        scanner.close();
    }

    public static String func(String line){
        char[] array = line.toCharArray();
        String result = "";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < array.length; i++){
            if(!map.containsKey(array[i])){
                map.put(array[i], 1);
            }
            else {
                map.replace(array[i], map.get(array[i])+1);
            }
        }
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>(){
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if(o2.getValue()==o1.getValue()){
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(Map.Entry<Character, Integer> e: list){
            result = result + e.getKey();
        }
        return result;
    }
}
