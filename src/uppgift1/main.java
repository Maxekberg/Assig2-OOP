package uppgift1;
import java.util.*;

public class main {
    public static void main(String[] args) {
        //Arraylist
        List<player> players = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Do you want to add a player?");
            String input = in.nextLine();

            if (!input.equalsIgnoreCase("yes")) {
                break;
            }

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
            player player = new player(name, team, position,scoredGoals, titlesWon);
            players.add(player);

        }

        //Delete player
        while(true) {
            System.out.println("Do you want to delete a player?");
            String input = in.nextLine();

            //Check answer
            if(!input.equals("yes")){
                break;
            }

            System.out.println("Enter the name of the player: ");
            String key = in.nextLine();

            boolean found = false;
            for(int i = 0; i < players.size(); i++){
                if(players.get(i).name.equals(key)){
                    players.remove(key);
                    found = true;
                    System.out.println("player " + players.get(i).name + " has been deleted");
                    break;
                }else {
                    System.out.println("player not found");
                }
            }
        }

        String key;
        //search for a player
        while(true) {
            System.out.println("Do you want to search for a player?");
            String input = in.nextLine();

            if (!input.equalsIgnoreCase("yes")) {
                break;
            }

            System.out.println("Enter the name of the player: ");
            key = in.nextLine();

            boolean found = false;
            for(int i = 0; i < players.size(); i++) {
                if(players.get(i).name.equals(key)) {
                    found = true;
                    System.out.println("Player found: " + players.get(i).name);
                    break;
                }
            }

            if(!found) {
                System.out.println("Player not found.");
            }
        }
    }
}