/* QUESTION:
 * In an election, there are candidates X and Y. On the election day, 80% of the voters go for polling, 
 * out of which 60% vote for X. Write a program to take the number of voters as input and calculate:
 * (i) number of votes X get
 * (ii) number of votes Y get
 */

import java.util.Scanner; //import Scanner class from util package
public class voteCount {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); //sc is Scanner object
        System.out.println("Enter the number of voters: ");
        double Vtr = sc.nextInt() * 0.80; //Input Voters and calculate 80% of the voters
        int x = (int) (Vtr * 0.60); //60% of X voters
        int y = (int) (Vtr * 0.40); //40% of Y voters
        System.out.println("Total voters for 'x' is: " + x);
        System.out.println("Total voters for 'y' is: " + y);
        sc.close();
    }
}
