import java.util.Scanner;
public class Tablee{
	public static void main(String[] args){
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1 ; i<=10; i++){
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}

		