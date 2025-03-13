package uppgift1;
import java.util.*;

public class main1 {
    public static void main(String[] args) {
        List<player> players = new ArrayList<player>();


        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Make a descision: ");
            System.out.println("1. Add a new player\n" + "2. Remove a player by name\n" +  "3. Search for a player by name\n" + "4. Provide a lost of tje players orderd by numner of goals");
            int choice = input.nextInt();

            switch(choice){
                case 1:
                    Scanner in = new Scanner(System.in);
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
                    break;
                    case 2:
                        Scanner in2 = new Scanner(System.in);
                        System.out.println("Enter the name of the player to remove: ");
                        String key = in2.nextLine();
                        boolean found = false;
                        for(int i=0; i<players.size(); i++) {
                            if(players.get(i).name.equalsIgnoreCase(key)) {
                                System.out.println("Player " + players.get(i).name + " removed");
                                players.remove(i);
                                found = true;
                                break;
                            }
                        }
                    break;
                case 3:
                    Scanner in3 = new Scanner(System.in);
                    System.out.println("Enter the name of the player: ");
                    key = in3.nextLine();

                    boolean found1 = false;
                    for(int i = 0; i < players.size(); i++) {
                        if(players.get(i).name.equals(key)) {
                            found1 = true;
                            System.out.println("Player found: " + players.get(i).name);
                            break;
                        }
                    }
                    if(!found1) {
                        System.out.println("Player not found.");
                    }
                    break;
                case 4:
                    //Collections.sort(players.new sortbygoal());
                }
            }
        }
    }

