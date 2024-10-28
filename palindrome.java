import java.util.Scanner;

public class palindrome {

    public boolean isPalindrome(int x) {
        int n = x, rev = 0, d;
        while (n != 0) {
            d = n % 10;
            rev = d + (rev * 10);
            n = n / 10;
        }
        if (rev == x)
            return true;
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        palindrome ob = new palindrome();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean y = ob.isPalindrome(n);
        System.out.println(y);
    }
}
