import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Team<FootballPlayer> arsenal = new Team<>("Arsenal");

        FootballPlayer jack = new FootballPlayer("Jack", 22);
        FootballPlayer josh = new FootballPlayer("Josh", 99);
        FootballPlayer rick = new FootballPlayer("Rick", 101);

        arsenal.addPlayer(jack);
        arsenal.addPlayer(josh);
        arsenal.addPlayer(rick);

        Team<FootballPlayer> everton = new Team<>("Everton");

        FootballPlayer richarlison = new FootballPlayer("Richarlison", 12);
        FootballPlayer neymar = new FootballPlayer("Neymar", 32);
        FootballPlayer gugata = new FootballPlayer("Gugata", 42);

        everton.addPlayer(richarlison);
        everton.addPlayer(neymar);
        everton.addPlayer(gugata);

        LeagueRepository<Team> league = new LeagueRepository<>();
        league.addTeam(arsenal);
        league.addTeam(everton);
        league.playGame(arsenal, everton);
        league.playGame(arsenal, everton);
        league.playGame(arsenal, everton);
        league.printLeaderboard();


        BasketballPlayer tom = new BasketballPlayer("Tom", 45);
        BasketballPlayer gogata = new BasketballPlayer("gogata", 425);
        BasketballPlayer chicho = new BasketballPlayer("chicho", 5);
        BasketballPlayer pafko = new BasketballPlayer("pafko", 25);

        ITeam<BasketballPlayer> lukoil = new Team<>("Lukoil");
        lukoil.addPlayer(tom);
        lukoil.addPlayer(gogata);
        lukoil.addPlayer(chicho);
        lukoil.addPlayer(pafko);


        ArrayList<ITeam<FootballPlayer>> team = new ArrayList<>();
        team.add(arsenal);
    }
}