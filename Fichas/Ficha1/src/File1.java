import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class File1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        File1Functions file1Functions = new File1Functions();
        String res;

        do {
            /*System.out.println("Exercise 1:");
            System.out.println("Degrees in Celsius: ");
            double degrees = input.nextDouble();
            System.out.println("Degrees in Fahrenheit: " + file1Functions.celsiusToFahrenheit(degrees));

            System.out.println("Exercise 2:");
            System.out.println("Put two integers: ");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println("The biggest value is: " + file1Functions.MaxNum(a, b));

            System.out.println("Exercise 6:");
            int x = Integer.parseInt(args[0]);
            System.out.println("The factorial of " +x +" is " + file1Functions.factorial(x));
*/
            System.out.println("Exercise 7:");
            LocalDateTime dateTime = LocalDateTime.now();
            int day = dateTime.getDayOfMonth();
            int month = dateTime.getMonthValue();
            int year = dateTime.getYear();
            int seconds = dateTime.getSecond();
            int minutes = dateTime.getMinute();
            int hour = dateTime.getHour();
            System.out.printf("Date: %d/%d/%d\nTime: %d:%d:%d\n",day,month,year,hour,minutes,seconds);
            long time = file1Functions.timeSpent();
            System.out.printf("Hour after executing: %d:%d:%d\n",LocalDateTime.now().getHour(),LocalDateTime.now().getMinute(),LocalDateTime.now().getSecond());
            System.out.println("Time spent in function: " +time +"ms");
            System.out.println("Restart program? [Y,n]");
            res = input.next();
        }while(res.charAt(0) != 'n');
        System.out.println("GoodBye!");
        input.close();
    }
}