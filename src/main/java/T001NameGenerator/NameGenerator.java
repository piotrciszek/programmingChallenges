package T001NameGenerator;

import java.util.Random;

public class NameGenerator {

    private static String[] beginning = { "Adam", "Adrian", "Andrzej", "Bartłomiej", "Benedykt",
            "Cezary", "Dariusz", "Eliasz", "Ferdynand", "Grzegorz", "Gabriel", "Hipolit",
            "Jarosław", "Jaromir", "Krzysztof", "Krystian", "Kacper", "Leon", "Leszek",
            "Maciej", "Mirosław", "Michał", "Okatwian", "Paweł", "Piotr" };
    private static String[] middle = { "Ananas", "Brokuł", "Burak", "Cebula", "Dynia", "Eukaliptus",
            "Fenkuł", "Groszek", "Hiacynt", "Imbir", "Jaśmin", "Kapusta", "Limonka", "Marchewka",
            "Nektarynka", "Ogórek", "Oliwka", "Pietruszka", "Pasternak", "Rabarbar" };
    private static String[] end = { "Andrzejewski", "Błeński", "Ciszek", "Dembowski", "Fijałkowski",
            "Goliński", "Herman", "Iksiński", "Jarocki", "Kowalski", "Liberadzki", "Musiał",
            "Nowak", "Ojrzyński" };

    private static Random rand = new Random();

    public static String generateName() {

        return beginning[rand.nextInt(beginning.length)] + " " +
                middle[rand.nextInt(middle.length)]+ " " +
                end[rand.nextInt(end.length)];

    }


}
