import java.util.Scanner;
public class Solution1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        String result = "";
        for (int i = 0; i < inputString.length(); i++) {
            char choice = inputString.charAt(i);
            if (Character.isUpperCase(choice))
                result += Character.toLowerCase(choice);
            else
                result += Character.toUpperCase(choice);
        }
        System.out.print(result);
    }
}