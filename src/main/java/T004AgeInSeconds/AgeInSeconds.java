package T004AgeInSeconds;

/* Name: Age In Seconds
 * Description: Calculate the user's age in seconds based on the birthday provided. The method used makes use of LocalDate and LocalTime.
 * 		Leap Years are accounted for using the concept that a leap year is divisible by 4. Years divisible by 100 are not leap years
 * 		unless they are also divisible by 400. Results are calculated up to the second based on the user's local time. The results do
 * 		not depict the absolute age of the user in seconds since birth time is not accounted for.
 * Author: Carl Sparks (TWiST3DSOFT)
 * Email: mail@carldsparks.com
 * Skype: nagantarov
 * Date: May 2, 2014
 * License: I don't care
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;


public class AgeInSeconds {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] birthdayArray = new int[3];
    private static long ageInSeconds = 0;




    public static long secondsCalc(Scanner input){
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        LocalTime currentTime = LocalTime.now();
        int secondOfDay = currentTime.toSecondOfDay();

        birthdayArray = getAge(input);

        LocalDate birthday = LocalDate.of(birthdayArray[2], birthdayArray[0], birthdayArray[1]);

        int age = currentYear - birthdayArray[2];

        int leapYearDays = 0;


        for(int x = birthdayArray[2]; x <= currentYear; x++){
            if(x % 4 == 0){
                if((x % 100 == 0) && (x % 400 == 00)){
                    leapYearDays++;
                } else if(x % 100 == 0){
                } else {
                    leapYearDays++;
                }
            }
        }

        long ageToSeconds = (age*365 + leapYearDays)*24*60*60;

        int dayOfYear = currentDate.getDayOfYear();
        int dayOfYearBirthday = birthday.getDayOfYear();

        int daysLeftSeconds = (dayOfYear - dayOfYearBirthday)*24*60*60;
        return ageToSeconds + daysLeftSeconds + secondOfDay;
    }

    public static int[] getAge(Scanner input){
        boolean monthPrompt = false;
        boolean dayPrompt = false;
        boolean yearPrompt = false;
        int[] birthdate = new int[3];

        while(!monthPrompt){
            System.out.print("Podaj miesiąc Twojego urodzenia: ");
            if(input.hasNextInt()){
                birthdate[0] = input.nextInt();
                monthPrompt = true;
            } else {
                System.out.println("To co podałeś nie jest liczbą");
                input.next();
                continue;
            }
        }

        while(!dayPrompt){
            System.out.print("Podaj dzień miesiąca Twojego urodzenia: ");
            if(input.hasNextInt()){
                birthdate[1] = input.nextInt();
                dayPrompt = true;
            } else {
                System.out.println("To co podałeś nie jest liczbą");
                input.next();
                continue;
            }
        }

        while(!yearPrompt){
            System.out.print("Podaj rok Twojego urodzenia: ");
            if(input.hasNextInt()){
                birthdate[2] = input.nextInt();
                yearPrompt = true;
            } else {
                System.out.println("To co podałeś nie jest liczbą");
                input.next();
                continue;
            }
        }

        return birthdate;
    }

}
