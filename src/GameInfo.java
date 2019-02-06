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

            int lineCount = 0;
            while (input.hasNextLine())
            {
                input.nextLine();
                lineCount++;
            }
            GameTable pt = new GameTable();

            input.close();
            input = new Scanner(inputFile);

            String currentLine;
            String[] gameData;
            Game g;
            String name, developer, genre, mode;
            int year;
            double rating;

            lineCount = 0;
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
                pt.addGame(lineCount, g);
                lineCount++;
            }

            input.close();

            System.out.println(pt);
            System.out.println();

            System.out.println(pt.getGame("Osu!"));
            System.out.println();
        }
    }
}