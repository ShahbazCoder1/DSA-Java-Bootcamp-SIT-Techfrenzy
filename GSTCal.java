/* QUESTION:
 * A shopkeeper offers 10% discount on the printed price of a mobile phone. However, a customer 
 * has to pay 9% GST on the remaining amount. Write a program in Java to calculate the amount to be paid by the 
 * customer taking printed price as an input.
 */

import java.util.Scanner;
public class GSTCal {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Printed Price: ");
        int prc = sc.nextInt();
        double dis = prc - (0.1 * prc);
        System.out.println("\nNew amount after 10% discount: ₹" + dis);
        double gst = dis + (0.09 * dis);
        System.out.println("GST: ₹" + (0.09 * dis));
        System.out.println("Amount to be paid: ₹" + gst);
        sc.close();
    }
}
