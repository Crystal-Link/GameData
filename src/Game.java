public class Game
{
    private String developer;
    private String name;
    private String genre;
    private int year;
    private double rating;
    private String mode;

    public Game(String name, String dev,
                String genre, int year,
                double rating, String mode)
    {
        this.name = name;
        this.developer = dev;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        this.mode = mode;
    }


    public String getName() {return name;}
    public String getDeveloper() {return developer;}
    public String getGenre() {return genre;}
    public int getYear() {return year;}
    public double getRating() {return rating;}
    public String getMode() {return mode;}


    public static int compareToByName(Game game1, Game game2)
    {
        if (game1.name.compareToIgnoreCase(game2.name) < 0)
            return -1;
        else if (game1.name.compareToIgnoreCase(game2.name) > 0)
            return 1;
        else
            return 0;
    }

    public static int compareToByRating(Game game1, Game game2)
    {
        if (game1.rating > game2.rating)
            return 1;
        else if (game1.rating < game2.rating)
            return -1;
        else
            return 0;
    }

    public static int compareToByYear(Game game1, Game game2)
    {
        if (game1.year > game2.year)
            return 1;
        else if (game1.year < game2.year)
            return -1;
        else
            return 0;
    }

    public static int compareToByGenre(Game game1, Game game2)
    {
        if (game1.genre.compareToIgnoreCase(game2.genre) > 0)
            return 1;
        else if (game1.genre.compareToIgnoreCase(game2.genre) < 0)
            return -1;
        else
            return 0;
    }

    public static int compareToByMode(Game game1, Game game2)
    {
        if (game1.mode.compareToIgnoreCase(game2.mode) > 0)
            return 1;
        else if (game1.mode.compareToIgnoreCase(game2.mode) < 0)
            return -1;
        else
            return 0;
    }

    public static int compareToByDeveloper(Game game1, Game game2)
    {
        if (game1.developer.compareToIgnoreCase(game2.developer) > 0)
            return 1;
        else if (game1.developer.compareToIgnoreCase(game2.developer) < 0)
            return -1;
        else
            return 0;
    }

    public static boolean equalsYear(Game game1, Game game2)
    {
        if (compareToByYear(game1, game2) == 0)
            return true;
        else
            return false;
    }

    public static boolean equalsRating(Game game1, Game game2)
    {
        if (compareToByRating(game1, game2) == 0)
            return true;
        else
            return false;
    }

    public static boolean equalsMode(Game game1, Game game2)
    {
        if (compareToByMode(game1, game2) == 0)
            return true;
        else
            return false;
    }

    public static boolean equalsGenre(Game game1, Game game2)
    {
        if (compareToByGenre(game1, game2) == 0)
            return true;
        else
            return false;
    }

    public static boolean equalsDeveloper(Game game1, Game game2)
    {
        if (compareToByDeveloper(game1, game2) == 0)
            return true;
        else
            return false;
    }

    public String toString()
    {
        String output = "";

        output += name;
        output += getSpaces(25 - name.length());

        output += developer + getSpaces(25 - developer.length());

        output += genre + getSpaces(23 - genre.length());

        output += year + getSpaces(7);

        output += rating + getSpaces(7);

        output += mode;

        return output;
    }

    public static String getSpaces(int numOfSpaces)
    {
        String spaces = "";
        for (int i = 0; i < numOfSpaces; i++)
            spaces += " ";

        return spaces;
    }
}
