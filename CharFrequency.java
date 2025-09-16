import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result += str.charAt(i - 1) + String.valueOf(count);
                count = 1;
            }
        }

        result += str.charAt(str.length() - 1) + String.valueOf(count);

        System.out.println("Output: " + result);

        sc.close();
    }
}
