package uppgift1;
import java.util.*;

public class sortbygoal implements Comparator <player>{
    public int compare(player p1, player p2) {
        if(p1.getGoals() == p2.getGoals()){
            return 0;
    }else if(p1.getGoals() < p2.getGoals()){
            return 1;
        }else {
            return -1;
        }
    }
}
