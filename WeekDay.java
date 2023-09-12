import java.io.*;
import java.util.*;
public class WeekDay{
public static void main(String args[])
  {
   Scanner input = new Scanner(System.in);
   int daynum=1;
   System.out.printf("Enter the weekday Number :");
   daynum = input.nextInt();
   switch(daynum)
   {
    case 1:
	System.out.printf("Sunday");
	break;
    case 2:
	System.out.printf("Monday");
	break;
    case 3:
	System.out.printf("Tuesday");
	break; 
	case 4:
	System.out.printf("Wednesday");
	break;
    case 5:
	System.out.printf("Thursday");
	break;
    case 6:
	System.out.printf("Friday");
	break;
    case 7:
	System.out.printf("Saturday");
	break;
    default:
	System.out.printf("Invalid input please enter the num between 1to7");
	break;
	}
    }
}
