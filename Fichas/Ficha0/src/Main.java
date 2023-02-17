import java.util.Scanner;
public class Main {
    private static int daysUntilMonth(int month){
        int days = 0;
        switch (month) {
            case 1: days += 31;
            case 2: days += 59;
            case 3: days += 90;
            case 4: days += 120;
            case 5: days += 151;
            case 6: days += 181;
            case 7: days += 212;
            case 8: days += 243;
            case 9: days += 273;
            case 10: days += 304;
            case 11: days += 334;
            default: break;
        }
        return days;
    }
    public static void dayOfWeak(int year, int month, int day){
        int currentDay;
        currentDay = (year-1900)*365 + ((year-1900)/4);
        if(year%2 == 0 && month <= 2){
            currentDay--;
        }
        currentDay += day;
        currentDay += daysUntilMonth(--month);
        currentDay = currentDay%7;
        switch (currentDay) {
            case 0 -> System.out.println("0 - Sunday");
            case 1 -> System.out.println("1 - Monday");
            case 2 -> System.out.println("2 - Tuesday");
            case 3 -> System.out.println("3 - Wednesday");
            case 4 -> System.out.println("4 - Thursday");
            case 5 -> System.out.println("5 - Friday");
            case 6 -> System.out.println("6 - Saturday");
            default -> {}
        }
    }
    public static void sumDates(int day, int month, int year, int day2, int month2, int year2){
        int numberOfDays = (year + year2) * 365 + (daysUntilMonth(--month) + daysUntilMonth(--month2)) + day + day2;
        int numberOfHours = numberOfDays*24;
        int numberOfMinutes = numberOfHours*60;
        int numberOfSeconds = numberOfMinutes*60;
        System.out.println(numberOfDays+"D "+numberOfHours+"H "+numberOfMinutes+"M "+numberOfSeconds+"S");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Exercise 1: Return the week day of a date");
        int day, month, year;
        System.out.println("Put a data in the format: day month year");
        day = input.nextInt();
        month = input.nextInt();
        year = input.nextInt();
        dayOfWeak(year,month,day);

        System.out.println("Exercise 2: Sum two dates");
        int day2, month2, year2;
        System.out.println("Put first date: ");
        day = input.nextInt();
        month = input.nextInt();
        year = input.nextInt();
        System.out.println("Put Second date: ");
        day2 = input.nextInt();
        month2 = input.nextInt();
        year2 = input.nextInt();
        sumDates(day,month,year,day2,month2,year2);

        System.out.println("Exercise 3: Take N grades and return the number of grades in each level(A,B,C,D)");
    }
}

















