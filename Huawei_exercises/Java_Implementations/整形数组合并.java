import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int line1 = Integer.parseInt(scanner.nextLine());
            String line2 = scanner.nextLine();
            int line3 = Integer.parseInt(scanner.nextLine());
            String line4 = scanner.nextLine();
            String[] splitFirst = line2.split(" ");
            String[] splitSecond = line4.split(" ");
            TreeSet<Integer> t = new TreeSet<>();
            for(int i = 0; i<line1; i++){
                t.add(Integer.parseInt(splitFirst[i]));
            }
            for(int i = 0; i<line3; i++){
                t.add(Integer.parseInt(splitSecond[i]));
            }
            StringBuilder sb = new StringBuilder();
            for(Integer i:t){
                sb.append(i);
            }
            System.out.println(sb.toString());
        }
        scanner.close();
    }
}
