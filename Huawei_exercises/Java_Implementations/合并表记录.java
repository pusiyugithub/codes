import java.util.*;

public class Test11{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int num = Integer.parseInt(scanner.nextLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int i = 0; i< num; i++){
                String line = scanner.nextLine();
                int key = Integer.parseInt(line.split( " ")[0]);
                int value = Integer.parseInt(line.split( " ")[1]);
                if(!map.containsKey(key)){
                    map.put(key ,value);
                }
                else {
                    map.replace(key, map.get(key), map.get(key)+value);
                }
            }
            for(Map.Entry<Integer, Integer> m:map.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }

        }
        scanner.close();
    }
}