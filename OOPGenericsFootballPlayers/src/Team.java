import java.util.ArrayList;

public class Team<T extends IPlayer> {
    private String name;
    private ArrayList<T> players;
    private int wins = 0;
    private int games = 0;
    private int losses = 0;
    private int draws = 0;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public ArrayList<T> getPlayers() {
        return this.players;
    }

    public boolean AddPlayer(IPlayer player){
        if (this.players.contains(player)){
            System.out.println(player.getName() + " already added to the team.");
            return false;
        }
        else {
            this.players.add((T) player);
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            this.wins++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            this.draws++;
            message = " drew with ";

        } else {
            this.losses++;
            message = " lost to ";
        }
        this.games++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }
}
