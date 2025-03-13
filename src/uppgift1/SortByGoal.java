package uppgift1;
import java.util.*;

public class SortByGoal implements Comparator<Player> {
    public int compare (Player p1, Player p2) {

        if(p1.getGoals() == p2.getGoals()){
            return 0;
        }else if(p1.getGoals() < p2.getGoals()){
            return 1;
        }else
            return -1;

    }
}
