package T004AgeInSeconds;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AgeInSeconds ageInSeconds = new AgeInSeconds();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program liczy Twój wiek w sekundach");


        System.out.println("Twój wiek w sekundach to: " + ageInSeconds.secondsCalc(scanner) + " sekund.");

    }
}
