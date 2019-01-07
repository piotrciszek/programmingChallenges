package T003TempConverter;

import java.util.Scanner;

public class TempCoverter {

    int farenheit = 0;
    int celsius = 0;
    Scanner scanner = new Scanner(System.in);

    public void convertFtoCAndPrint() {

        System.out.println("Wpisz stopnie w F:");
        farenheit = scanner.nextInt();
        celsius = (5/9)*(farenheit-32);
        System.out.println(farenheit + "^F to " + celsius + "^C.");
    }
    public void convertCtoFAndPrint() {
        System.out.println("Wpisz stopnie w C:");
        celsius = scanner.nextInt();
        farenheit = celsius*(9/5)+32;
        System.out.println(celsius + "^C to " + farenheit + "^F.");
    }

}
