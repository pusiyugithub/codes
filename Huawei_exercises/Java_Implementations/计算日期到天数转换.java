import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private HashMap<Integer, Integer> map = null;
    Main(){
        map = new HashMap<>();
        map.put(1, 31);
        map.put(2, 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
    }

    public HashMap<Integer, Integer> getMap(){
        return map;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            Main m = new Main();

            int year = Integer.parseInt(scanner.next());
            int month = Integer.parseInt(scanner.next());
            int day = Integer.parseInt(scanner.next());
            int result = day;
            if(year % 4 == 0){
                m.getMap().replace(2, 28, 29);
            }
            for(int i = 1; i<month; i++){
                result = result + m.getMap().get(i);
            }
            System.out.println(result);

        }
        scanner.close();
    }
}
