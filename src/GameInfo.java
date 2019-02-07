import java.io.File;
import java.util.Scanner;

public class GameInfo
{
    public static void main(String[] args) throws Exception
    {
        String filename = "gamedata.csv";
        File inputFile = new File(filename);
        if(!inputFile.exists())
            System.out.println(filename + " cannot be found.");
        else
        {
            Scanner input = new Scanner(inputFile);

            GameTable pt = new GameTable();
            input = new Scanner(inputFile);

            String currentLine;
            String[] gameData;
            Game g;
            String name, developer, genre, mode;
            int year;
            double rating;
            input.nextLine();
            while(input.hasNextLine())
            {
                currentLine = input.nextLine();
                gameData = currentLine.split(",");
                developer = gameData[0];
                name = gameData[1];
                genre = gameData[2];
                year = Integer.parseInt(gameData[3]);
                rating = Double.parseDouble(gameData[4]);
                mode = gameData[5];

                g = new Game(name, developer, genre, year, rating, mode);
                pt.addGame(g);
            }

            input.close();

            System.out.println(pt);
            System.out.println();

            pt.sortGameByName();
            System.out.println(pt);

            pt.sortGameByYear();
            System.out.println(pt);

            System.out.println(pt.getGame("Osu!"));
            System.out.println();

            System.out.println(pt.getDeveloper("Blizzard Entertainment"));
            System.out.println();

            System.out.println(pt.getYear(2016));
            System.out.println();

            System.out.println(pt.getMode("Multiplayer"));
            System.out.println();

            System.out.println(pt.getRating(0.9));
            System.out.println();

            System.out.println("The average year of all listed games is " + pt.getAvgYear());
            System.out.println();

            System.out.println("The average rating of all listed games is " + pt.getAvgRating() + " out of 1.0");
            System.out.println();

            System.out.println("The average rating of all listed 2015 games is " + pt.getAvgRating(2015) + " out of 1.0");
            System.out.println();

            System.out.println("The average rating of all listed Single-Player games is " + pt.getAvgRating("Single-Player") + " out of 1.0");
            System.out.println();
        }
    }
}