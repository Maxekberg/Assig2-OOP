package uppgift1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Arraylist
        List<Player> players = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Make a decision: ");
            System.out.println("1. Add a new player\n" + "2. Remove a player by name\n" + "3. Search for a player by name\n" + "4. Provide a list of the players ordered by number of goals");

            int choice = in.nextInt();
            in.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Enter the name of the player: ");
                    String name = in.nextLine();
                    System.out.println("Enter the Team of the player: ");
                    String team = in.nextLine();
                    System.out.println("Enter the position of the player: ");
                    String position = in.nextLine();
                    System.out.println("Enter the amount of scored goales:  ");
                    int scoredGoals = in.nextInt();
                    System.out.println("Enter the amount of titles won:  ");
                    int titlesWon = in.nextInt();
                    in.nextLine();

                    //Adds playerinfo to array
                    Player player = new Player(name, team, position,scoredGoals, titlesWon);
                    players.add(player);
                    break;
                    case 2:
                        removePlayer(players);
                        break;
                        case 3:
                            searchForPlayer(players);
                            break;
                            case 4:
                                Collections.sort(players, new SortByGoal());
                                for(Player p : players) {
                                    System.out.println("Goals: " + p.getGoals() + " " + "Name: " + p.name);
                                    System.out.println();
                                }
                                break;
            }
        }
    }

    //Methods
    public static void  removePlayer(List<Player> players) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the player: ");
        String key = in.nextLine();
        Boolean found = false;

        for(int i=0; i<players.size(); i++) {
            if(players.get(i).name.equalsIgnoreCase(key)) {
                System.out.println("Player " + players.get(i).name + " removed");
                players.remove(i);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Player " + key + " not found");
        }
    }

    public static void searchForPlayer(List<Player> players) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the player: ");
        String key = in.nextLine();
        Boolean found = false;

        for(int i = 0 ; i < players.size(); i++) {
            if(players.get(i).name.equalsIgnoreCase(key)) {
                System.out.println("Player " + players.get(i).name + " found");
                System.out.println(players.toString());
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Player " + key + " not found");
        }
    }
}

