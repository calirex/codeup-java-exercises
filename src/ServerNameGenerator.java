public class ServerNameGenerator {
    public static String[] adjectives = new String[] {
            "Attractive",
            "Bald",
            "Fit",
            "Jolly",
            "Lazy",
            "Active",
            "Worried",
            "Tiny",
            "Crazy",
            "Mad",

    };

    public static String[] nouns = new String[] {
            "Coat",
            "Eye",
            "Fact",
            "Danger",
            "Film",
            "Garage",
            "Garden",
            "Girl",
            "Area",
            "Camera",
    };

    // METHODS //



    // RETURNS AND RANDOM ELEMENT FROM A GIVEN ARRAY //
    public static String getRandomWord(String[] words) {
        int randomNumber = (int) (Math.random() * words.length);
        return words[randomNumber];

    }


}
