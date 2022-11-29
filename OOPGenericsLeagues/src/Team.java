import java.util.ArrayList;
import java.util.List;

public class Team<T extends IPlayer> implements ITeam<T>{
    private String name;
    private int wins = 0;
    private int losses = 0;
    List<T> players;

    public Team(String name){
        this.name = name;
        this.players = new ArrayList<>();
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getGamesPlayed(){
        return this.wins + this.losses;
    }

    @Override
    public int getWins() {
        return this.wins;
    }
    @Override
    public void win(){
        this.wins++;
    }

    @Override
    public int getLosses() {
        return this.losses;
    }

    @Override
    public boolean addPlayer(T player) {
        if (this.players.contains(player)){
            System.out.println("Player " + player.getName() + " already added.");
            return false;
        }
        else{
            this.players.add(player);
            return true;
        }
    }

    @Override
    public void lose() {
        this.losses++;
    }

    @Override
    public List<T> players() {
        return this.players;
    }
}
