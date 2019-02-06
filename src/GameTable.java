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

    public void addGame(int i, Game g)
    {
        table.add(i,g);
    }

    public Game getGame(String name)
    {
        for (Game g : table)
            if (g.getName().equals(name))
                return g;
        return null;
    }

    public String toString()
    {
        String output = "";
        for (Game g : table)
            output += g.toString() + "\n";
        return output;
    }
}
