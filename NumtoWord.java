import java.util.Scanner;

public class NumtoWord {

    static String[] ones = {
        "", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine", "ten", "eleven", "twelve", "thirteen",
        "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    static String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"
    };

    static String convertToWords(int num) {
        String result = "";

        if (num >= 1000) {
            result += ones[num / 1000] + " thousand ";
            num %= 1000;
        }
        if (num >= 100) {
            result += ones[num / 100] + " hundred ";
            num %= 100;
        }
        if (num >= 20) {
            result += tens[num / 10] + " ";
            num %= 10;
        }
        if (num > 0) {
            result += ones[num] + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (0–9999): ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("zero");
        } else {
            System.out.println(convertToWords(num));
        }

        sc.close();
    }
}
