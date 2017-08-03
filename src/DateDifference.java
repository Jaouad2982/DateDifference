import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * DateDiff -- compute the difference between two dates.
 */
public class DateDifference {
  public static void main(String[] av) {
	  Scanner input = new Scanner(System.in);
    /** The date at the end of the last century */
	 System.out.println("Enter your  year ..");//user enter the year
	 int year = input.nextInt();
	 System.out.println("enter the month");// user enter the month
	 int month = input.nextInt();
	 System.out.println("Enter the day");// user enter the day
	 int day = input.nextInt();
    Date gregoDate = new GregorianCalendar(year, month, day).getTime();

    /** the date object ---> Today's date */
    Date today = new Date();

    
    double firstDate = today.getTime();
    double secondDate = gregoDate.getTime();
    double diff = firstDate- secondDate;
    int calcDiff = (int) Math.round(diff / (1000 * 60 * 60 * 24));
    int calcYears = calcDiff/365;
    
    System.out.println("the differene between the two dates 'today : ' " + today + " and the date entered " + (year + "/" + month + "/" + day)
      + " is " + (calcDiff) + " days" + " which is approximatley " + calcYears + " years");
  }
}
