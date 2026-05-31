import java.util.Scanner;
public class Solution1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = "";
        String ab = a + b;
        for (int i = 0; i < ab.length(); i++) {
            if (ab.charAt(i) != ' ') {
                c += ab.charAt(i);
            }
        }
        System.out.print(c);
    }
}

#2