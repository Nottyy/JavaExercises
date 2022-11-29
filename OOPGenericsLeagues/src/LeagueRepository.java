import java.util.ArrayList;
import java.util.List;

public class LeagueRepository<T extends ITeam> {
    private List<T> teams;

    public LeagueRepository(){
        this.teams = new ArrayList<>();
    }

    public void printLeaderboard(){
        for (ITeam team: this.teams){
            System.out.println("Team -> " + team.getName() + "; Wins -> " + team.getWins() + "; Losses ->" + team.getLosses()
            + "; Pts -> " + team.getWins() * 3 );
        }
    }

    public void addTeam(T team){
        this.teams.add(team);
    }

    public void playGame(ITeam opponent1, ITeam opponent2) {
        int currentTeamStrength = this.calculateTeamStrength(opponent1.players());
        int opponentTeamStrength = this.calculateTeamStrength(opponent2.players());

        if (currentTeamStrength > opponentTeamStrength){
            opponent1.win();
            opponent2.lose();
            System.out.println(opponent1.getName() + " beat " + opponent2.getName());
        }
        else if(currentTeamStrength == opponentTeamStrength){
            System.out.println("Draw between " + opponent1.getName() + " and " + opponent2.getName());
        }
        else{
            opponent1.lose();
            opponent2.win();
            System.out.println(opponent1.getName() + " lost to " + opponent2.getName());
        }
    }

    private int calculateTeamStrength(List<IPlayer> players){
        int strength = 0;
        for (IPlayer pl : players){
            strength += pl.getStrength();
        }

        return strength;
    }
}
