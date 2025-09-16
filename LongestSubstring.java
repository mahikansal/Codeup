import java.util.Scanner;

public class LongestSubstring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            String current = "";
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                if (current.indexOf(c) != -1) {
                    break;
                }

                if (current.length() > maxLength) {
                    maxLength = current.length();
                }
            }
        }

        System.out.println("Output: " + maxLength);

        sc.close();
    }
}
