import java.util.Scanner;
public class prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		boolean is_prime = true;
		if(n<=1){
			is_prime = false;
		}
		else{
		for(int i=2; i<n; i++){
			if(n%i == 0){
				is_prime = false;
				break;
			}
		}
		}
		
		if(is_prime){
			System.out.println("This is a prime");
		}
		else{
			System.out.println("This is not a prime");
		}
	}
}
		
		
		