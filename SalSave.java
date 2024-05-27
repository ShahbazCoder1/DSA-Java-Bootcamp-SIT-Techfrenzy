/* QUESTION:
 * A man spends 1/2 of his salary on food, 1/15 on rent, 1/10 on miscellaneous. 
 * Rest of the salary is his saving. Write a program to calculate and display the following:
 * (i) money spent on food
 * (ii) money spent on rent
 * (iii) money spent on miscellaneous
 * (iv) money saved
 */

import java.util.Scanner; //import Scanner class from util package
public class SalSave {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); //sc is Scanner object
        System.out.print("Enter the Salary: ");
        int sal = sc.nextInt(); //Input Salary
        double f = sal / 2; //Calculate food cost
        System.out.println("Money spent on food: ₹" +f);
        double r = sal / 15; //Calculate rent cost
        System.out.println("Money spent on food: ₹" +r);
        double m = sal / 10; //Calculate other cost
        System.out.println("Money spent on food: ₹" +m);
        System.out.println("Savings: ₹"+ (sal-f-r-m)); //Calculate savings and print
        sc.close();
    }
}
