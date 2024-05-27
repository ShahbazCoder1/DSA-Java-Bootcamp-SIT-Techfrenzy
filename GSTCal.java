/* QUESTION:
 * A shopkeeper offers 10% discount on the printed price of a mobile phone. However, a customer 
 * has to pay 9% GST on the remaining amount. Write a program in Java to calculate the amount to be paid by the 
 * customer taking printed price as an input.
 */

import java.util.Scanner; //import Scanner class from util package
public class GSTCal {
    public static void main (String[] args){ 
        Scanner sc = new Scanner(System.in); //sc is Scanner object
        System.out.print("Enter the Printed Price: ");
        int prc = sc.nextInt(); //input a interger price
        double dis = prc - (0.1 * prc); // Calculate discount
        System.out.println("\nNew amount after 10% discount: ₹" + dis);
        double gst = dis + (0.09 * dis); //Calculate GST
        System.out.println("GST: ₹" + (0.09 * dis));
        System.out.println("Amount to be paid: ₹" + gst); //Print the amount
        sc.close();
    }
}
