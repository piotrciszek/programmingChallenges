package T002HeadTails;

import java.util.Random;

/*public class HeadTails {
    public static void main(String[] args) {
        Random random = new Random();
        int heads = 0;
        for (int i = 0; i < 1000; i++) {
            heads += random.nextInt(2);
        }
        System.out.println("Times head was flipped:" + heads);
        System.out.println("Times tail was flipped:" + (1000 - heads));
    }
}*/
public class HeadTails {

    private static Random random = new Random();

    public static void main(String[] args) {
        coinToss();
    }

    private static void coinToss()
    {
        int result = random.nextInt(2);
        if (result == 0)
        System.out.println("heads");
	        else if (result == 1)
        System.out.println("tails");
	        else

        System.out.println("PROBLEM");
    }
}
