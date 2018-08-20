import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println(func(line));
        }
        scanner.close();
    }

    public static String func(String line){
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0; i<line.length(); i++){
            for(int j = 0; j<=i; j++){
                if(line.substring(j, line.length()-i+j).matches("[0-9]+")){
                    arrayList.add(line.substring(j, line.length()-i+j));
                }
            }
            if(!arrayList.isEmpty()){
                String result = "";
                for(String s:arrayList){
                    result = result + s;
                }
                return result+","+arrayList.get(0).length();
            }
        }
        return "";
    }
}
