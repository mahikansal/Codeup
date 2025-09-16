import java.util.Scanner;
public class ExpandChar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String n = sc.nextLine();
		StringBuilder  result = new StringBuilder();
		
		for(int i=0; i<n.length(); i+=2){
			char ch = n.charAt(i);
			int count = n.charAt(i+1) - '0';
			
			for(int j=0; j<count; j++){
				result.append(ch);
			}
		}
	System.out.println(result.toString());
	
	sc.close();
	}
}
			
		