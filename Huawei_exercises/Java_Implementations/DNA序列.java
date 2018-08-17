import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String sequence = scanner.nextLine();
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println(findLongestSequence(sequence, num));
        }
        scanner.close();
    }

    public static String findLongestSequence(String sequence, int num){
        if(sequence.length() == num){
            return sequence;
        }
        String currentSequence = "";
        int index = -1;
        for (int i = 0; i<sequence.length()-num; i++){
            String subSequence = sequence.substring(i, i+num);
            int length = subSequence.replaceAll("[AT]", "").length();
            if(length>index){
                index = length;
                currentSequence = subSequence;
            }
        }
        return currentSequence;
    }
}
