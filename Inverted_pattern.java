// https://www.geeksforgeeks.org/problems/triangle-pattern-1661493231/1

import java.util.Scanner;
public class Inverted_pattern {

    public void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (n - i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inverted_pattern obj = new Inverted_pattern();
        System.out.println("Enter the Inverted Praymid size: ");
        int n = sc.nextInt();
        obj.printTriangle(n);
        sc.close();
    }
}
