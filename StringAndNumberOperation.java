import java.util.Scanner;

public class StringAndNumberOperation {

    // Repeat character 'count' times
    static String repeatChar(char ch, int count) {
        String temp = "";
        for (int j = 0; j < count; j++) {
            temp = temp + ch;
        }
        return temp;
    }

    // Expand string like a1b3 -> abbb
    static String expandString(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i);
            int count = input.charAt(i + 1) - '0';
            result = result + repeatChar(ch, count);
        }
        return result;
    }

    // Function to convert int to string manually
	static String intToString(int num) {
    if (num == 0) return "0";
    String result = "";
    while (num > 0) {
        char digit = (char) ('0' + num % 10);
        result = digit + result;
        num /= 10;
    }
    return result;
}

	// Function to compress character frequency
	static String compressFrequency(String s) {
    String result = "";
    int n = s.length();

    for (int i = 0; i < n; i++) {
        char currentChar = s.charAt(i);
        int count = 1;

        while (i + 1 < n && s.charAt(i + 1) == currentChar) {
            count++;
            i++;
        }

        result += currentChar;
        result += intToString(count);
    }

    return result;
}
	//  Prime Function

    static boolean isPrime(int n) {
        if (n <= 1){
		return false;}
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0){ 
			return false;}
        }
        return true;
    }

    // Number to Words Function

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

    // Longest Substring Function
	 static int longestSubstringLength(String s) {
        int[] lastPos = new int[256];
        for (int i = 0; i < 256; i++) lastPos[i] = -1;

        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (lastPos[ch] >= start) {
                start = lastPos[ch] + 1;
            }

            lastPos[ch] = i; 
            int length = i - start + 1;
            if (length > maxLength) maxLength = length;
        }

        return maxLength;
    }

	//  Main Function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Expand string
        System.out.print("Enter string to expand char(char+digit): ");
        String input1 = sc.nextLine();
        System.out.println("Expanded String: " + expandString(input1));

        // Task 2: Character frequency
        System.out.print("Enter a string to find frequency: ");
        String input2 = sc.nextLine();
        System.out.println("Character Frequency Output: " + compressFrequency(input2));

        // Task 3: Prime number check
        System.out.print("Enter a number to check if it is prime: ");
        int num1 = sc.nextInt();
        if (isPrime(num1)) {
            System.out.println(num1 + " is a prime number.");
        } else {
            System.out.println(num1 + " is not a prime number.");
        }

        // Task 4: Number to words
        System.out.print("Enter an integer (0 to 9999) to convert to words: ");
        int num2 = sc.nextInt();
        if (num2 == 0) {
            System.out.println("zero");
        } else {
            System.out.println("Number in words: " + convertToWords(num2));
        }

        // Task 5: Longest substring without repeating characters
        sc.nextLine();
        System.out.print("Enter a string to find longest substring without repeating characters: ");
        String input3 = sc.nextLine();
        int maxLength = longestSubstringLength(input3);
        System.out.println("Length of longest substring without repeating characters: " + maxLength);

        sc.close();
    }
}
