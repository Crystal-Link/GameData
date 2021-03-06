import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GameTable
{
    private ArrayList<Game> table;

    public GameTable()
    {
        table = new ArrayList<Game>();
    }

    public void addGame(Game g)
    {
        table.add(g);
    }

    public void sortGameBy(String option)
    {
        if (option.equalsIgnoreCase("name"))
            sortGameByName();
        else if (option.equalsIgnoreCase("year"))
            sortGameByYear();
        else if (option.equalsIgnoreCase("rating"))
            sortGameByRating();
        else if (option.equalsIgnoreCase("genre"))
            sortGameByGenre();
        else if (option.equalsIgnoreCase("mode"))
            sortGameByMode();
        else if (option.equalsIgnoreCase("developer") || option.equalsIgnoreCase("dev"))
            sortGameByDeveloper();
    }

    public void sortGameByYear()
    {
        for (int i = 0; i < table.size() - 1; i++) {
            int lowPosition = i;
            for (int h = i + 1; h < table.size(); h++)
            {
                if (Game.compareToByYear(table.get(h), table.get(lowPosition)) == -1)
                    lowPosition = h;
                else if (table.get(h).getYear() == table.get(lowPosition).getYear())
                {
                    if (Game.compareToByName(table.get(h), table.get(lowPosition)) == -1)
                        lowPosition = h;
                }
            }
            table.set(i, table.set(lowPosition, table.get(i)));
        }
    }

    public void sortGameByName()
    {
        for (int i = 0; i < table.size() - 1; i++) {
            int lowPosition = i;
            for (int h = i + 1; h < table.size(); h++)
            {
                if (Game.compareToByName(table.get(h), table.get(lowPosition)) == -1)
                    lowPosition = h;
            }
            table.set(i, table.set(lowPosition, table.get(i)));
        }
    }

    public void sortGameByDeveloper()
    {
        for (int i = 0; i < table.size() - 1; i++) {
            int lowPosition = i;
            for (int h = i + 1; h < table.size(); h++)
            {
                if (Game.compareToByDeveloper(table.get(h), table.get(lowPosition)) == -1)
                    lowPosition = h;
                else if (table.get(h).getDeveloper().equalsIgnoreCase(table.get(lowPosition).getDeveloper()))
                {
                    if (Game.compareToByName(table.get(h), table.get(lowPosition)) == -1)
                        lowPosition = h;
                }
            }
            table.set(i, table.set(lowPosition, table.get(i)));
        }
    }

    public void sortGameByGenre()
    {
        for (int i = 0; i < table.size() - 1; i++) {
            int lowPosition = i;
            for (int h = i + 1; h < table.size(); h++)
            {
                if (Game.compareToByGenre(table.get(h), table.get(lowPosition)) == -1)
                    lowPosition = h;
                else if (table.get(h).getGenre().equalsIgnoreCase(table.get(lowPosition).getGenre()))
                {
                    if (Game.compareToByName(table.get(h), table.get(lowPosition)) == -1)
                        lowPosition = h;
                }
            }
            table.set(i, table.set(lowPosition, table.get(i)));
        }
    }

    public void sortGameByMode()
    {
        for (int i = 0; i < table.size() - 1; i++) {
            int lowPosition = i;
            for (int h = i + 1; h < table.size(); h++)
            {
                if (Game.compareToByMode(table.get(h), table.get(lowPosition)) == -1)
                    lowPosition = h;
                else if (table.get(h).getMode().equalsIgnoreCase(table.get(lowPosition).getMode()))
                {
                    if (Game.compareToByName(table.get(h), table.get(lowPosition)) == -1)
                        lowPosition = h;
                }
            }
            table.set(i, table.set(lowPosition, table.get(i)));
        }
    }

    public void sortGameByRating()
    {
        for (int i = 0; i < table.size() - 1; i++) {
            int lowPosition = i;
            for (int h = i + 1; h < table.size(); h++)
            {
                if (Game.compareToByRating(table.get(h), table.get(lowPosition)) == -1)
                    lowPosition = h;
                else if (table.get(h).getRating() == table.get(lowPosition).getRating())
                {
                    if (Game.compareToByName(table.get(h), table.get(lowPosition)) == -1)
                        lowPosition = h;
                }
            }
            table.set(i, table.set(lowPosition, table.get(i)));
        }
    }

    public Game getGame(String name)
    {
        for (Game g : table)
            if (g.getName().equals(name))
                return g;
        return null;
    }

    public List<Game> getDeveloper(String dev)
    {
        List<Game> devs = new ArrayList<>();
        for (Game g : table)
            if (g.getDeveloper().equals(dev))
                devs.add(g);

        if (devs.size() != 0)
            return devs;
        else
            return null;
    }

    public List<Game> getYear(int year)
    {
        List<Game> yr = new ArrayList<>();
        for (Game g : table)
            if (g.getYear() == year)
                yr.add(g);

        if (yr.size() != 0)
            return yr;
        else
            return null;
    }

    public List<Game> getMode(String mode)
    {
        List<Game> mod = new ArrayList<>();
        for (Game g : table)
            if (g.getMode().equals(mode))
                mod.add(g);

        if (mod.size() != 0)
            return mod;
        else
            return null;
    }

    public List<Game> getRating(double rating)
    {
        List<Game> rat = new ArrayList<>();
        for (Game g : table)
            if (g.getRating() == rating)
                rat.add(g);

        if (rat.size() != 0)
            return rat;
        else
            return null;
    }

    public double getAvgYear()
    {
        double average = 0.0;
        int gameCount = 0;

        for (Game g : table) {
            average += g.getYear();
            gameCount++;
        }
        average = average/gameCount;
        return average;
    }

    public double getAvgRating()
    {
        double average = 0.0;
        int gameCount = 0;

        for (Game g : table) {
            average += g.getRating();
            gameCount++;
        }
        average = average/gameCount;
        return average;
    }

    public double getAvgRating(int year)
    {
        List<Game> yr = getYear(year);

        double average = 0.0;
        int gameCount = 0;

        for (Game g : yr) {
            average += g.getRating();
            gameCount++;
        }
        average = average/gameCount;
        return average;
    }

    public double getAvgRating(String mode)
    {
        List<Game> mod = getMode(mode);

        double average = 0.0;
        int gameCount = 0;

        for (Game g : mod) {
            average += g.getRating();
            gameCount++;
        }
        average = average/gameCount;
        return average;
    }

    public String toString()
    {
        String output = "";
        for (Game g : table)
            output += g.toString() + "\n";
        return output;
    }
}
