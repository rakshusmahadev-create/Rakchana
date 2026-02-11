Program(Armstrong or not a armstrong)
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while(n > 0) {
            int r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }

        if(sum == temp)
            System.out.print("Armstrong");
        else
            System.out.print("Not Armstrong");
    }
}
i/p:
765
o/p:
  Not Armstrong

  Program(Character checking)
  import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int digitCount = 0;
        int alphaCount = 0;
        int specialCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphaCount++;
            }
            else {
                specialCount++;
            }
        }

        if (digitCount == input.length()) {
            System.out.println("Digit");
        }
        else if (alphaCount == input.length()) {
            System.out.println("Alphabet");
        }
        else if (specialCount == input.length()) {
            System.out.println("Special Character");
        }
        else {
            System.out.println("Mixed Input");
        }
    }
}
i/p:
  765
  o/p
  Digit
