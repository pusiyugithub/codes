import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String addend = scanner.nextLine();
			String augend = scanner.nextLine();
			System.out.println(AddLongInteger(addend, augend));
		}
		scanner.close();
	}
	
	public static String AddLongInteger(String addend, String augend)
	 {
		String zeros = "";
		int carry = 0;
		String sum = "";
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
	   if(addend.length()>augend.length()){
		   String temp = addend;
		   addend =  augend;
		   augend = temp;
	   }
	   for(int i = 0; i<augend.length()-addend.length(); i++){
		   zeros = zeros+"0";
	   }
	   addend = zeros+addend;
	   augend = new StringBuffer(augend).reverse().toString();
	   addend = new StringBuffer(addend).reverse().toString();

	   for(int i = 0; i<augend.length(); i++){
		   a1.add(Integer.parseInt(augend.substring(i, i+1)));
	   }
	   for(int i = 0; i<addend.length(); i++){
		   a2.add(Integer.parseInt(addend.substring(i, i+1)));
	   }
	  
	   
	   for(int i = 0; i<augend.length(); i++){
		   if(a1.get(i)+a2.get(i)+carry>=10){
			   result.add(a1.get(i)+a2.get(i)+carry-10);
			   carry = 1;
		   }
		   else{
			   result.add(a1.get(i)+a2.get(i)+carry);
			   carry = 0;
		   }
	   }
	   if(carry == 1){
		   result.add(carry);
	   }
	   
	   for(int i = result.size()-1; i>=0; i--){
		   sum  = sum+String.valueOf(result.get(i));
	   }
	  return sum;     
	 }
}
