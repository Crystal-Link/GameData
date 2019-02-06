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

    public int compareToByRating(Game game)
    {
        if (game.getRating() > this.rating)
            return 1;
        else if (game.getRating() < this.rating)
            return -1;
        else
            return 0;
    }

    public int compareToByYear(Game game)
    {
        if (game.getYear() > this.year)
            return 1;
        else if (game.getYear() < this.year)
            return -1;
        else
            return 0;
    }

    public String toString()
    {
        String output = "";

        output += name;
        output += getSpaces(30 - name.length());

        output += developer + getSpaces(25 - developer.length());

        output += year + getSpaces(7);

        output += rating + getSpaces(7);

        output += mode;
        output += getSpaces(18 - mode.length());

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
