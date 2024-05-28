/* QUESTION:
 * Write a program to input time in seconds. Display the time after converting them into hours, minutes and seconds.
 * Sample Input: Time in seconds: 5420
 * Sample Output: 1 Hour 30 Minutes 20 Seconds
 */

import java.util.Scanner; //import Scanner class from util package
public class TimeConvert {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); //sc is Scanner object
        System.out.print("Enter Time in sec: ");
        int sec = sc.nextInt(); // Input seconds
        
        int hr = sec/3600; //1 hour = 3600 seconds, eg: 5420 / 3600 = 1.5 hour
        int min = (sec - (1 * 3600))/60; // 1 minute = 60 seconds, eg: 5420 - (1 * 3600) = 1820 sec , 1820 / 60 = 30.33 min
        int s = (sec - (1 * 3600)) - (min * 60); // 1820 - (30 * 60) = 20 sec

        System.out.println("\nHour: "+hr+"\nMinutes: "+min+"\nSeconds: "+s); //output
        sc.close();
    }
}
