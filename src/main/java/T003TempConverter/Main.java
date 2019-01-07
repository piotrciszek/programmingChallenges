package T003TempConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        TempCoverter tc = new TempCoverter();
        Scanner s = new Scanner(System.in);
        System.out.println("Naciśnj 1 dla ^C->^F albo 2 dla ^F->^C");
        a = s.nextInt();
        if (a == 1) {
            tc.convertCtoFAndPrint();
        } else if (a == 2){
            tc.convertFtoCAndPrint();
        } else {
            System.out.println("Zły wybór");
        }
    }
}
