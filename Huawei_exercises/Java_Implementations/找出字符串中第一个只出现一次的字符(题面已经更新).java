import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String input = scanner.nextLine();
            String afterReplace = input;
            LinkedHashSet<Character> origin = new LinkedHashSet<>();
            LinkedHashSet<Character> second = new LinkedHashSet<>();
            for (int i = 0; i< input.length(); i++){
                origin.add(input.charAt(i));
            }
            Iterator it = origin.iterator();
            while (it.hasNext()){
                String c = String.valueOf(it.next());
                afterReplace = afterReplace.replaceFirst(c, "");
            }

            for (int i = 0; i< afterReplace.length(); i++){
                second.add(afterReplace.charAt(i));
            }
            origin.removeAll(second);
            if (origin.size()==0){
                System.out.println("-1");
            }
            else {
                for (Character c: origin){
                    if (input.contains(String.valueOf(c))){
                        System.out.println(c);
                        break;
                    }
                }
            }

        }
        scanner.close();

    }


}


