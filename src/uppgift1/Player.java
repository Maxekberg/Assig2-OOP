package uppgift1;

public class Player {
    //data fields
    String name;
    String team;
    String position;
    int goals;
    int titlesWon;

    //Constructor
    Player(){};

    Player(String name, String team, String position, int goals, int titlesWon) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.goals = goals;
        this.titlesWon = titlesWon;
    }

//Methods
    @Override
public String toString() {
    String player="";
    player += this.name + " " + this.position + " " + this.goals + " " + this.titlesWon;
    return player;
}

    //getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getTitlesWon() {
        return titlesWon;
    }

    public void setTitlesWon(int titlesWon) {
        this.titlesWon = titlesWon;
    }



}
