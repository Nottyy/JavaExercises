public class Main {
    public static void main(String[] args) {
        ITeam<FootballPlayer> arsenal = new Team<>("Arsenal");

        FootballPlayer jack = new FootballPlayer("Jack", 22);
        BasketballPlayer tom = new BasketballPlayer("Tom", 45);
        FootballPlayer josh = new FootballPlayer("Josh", 99);
        FootballPlayer rick = new FootballPlayer("Rick", 101);

        arsenal.addPlayer(jack);
        arsenal.addPlayer(josh);
        arsenal.addPlayer(rick);

        ITeam<FootballPlayer> everton = new Team<>("Everton");

        FootballPlayer richarlison = new FootballPlayer("Richarlison", 12);
        FootballPlayer neymar = new FootballPlayer("Neymar", 32);
        FootballPlayer gugata = new FootballPlayer("Gugata", 42);

        everton.addPlayer(richarlison);
        everton.addPlayer(neymar);
        everton.addPlayer(gugata);

        LeagueRepository league = new LeagueRepository();
        league.playGame(arsenal, everton);

    }
}