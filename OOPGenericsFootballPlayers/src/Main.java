public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe", 10);
        Player pat = new BaseballPlayer("Pat", 10);
        Player rick = new FootballPlayer("Rick", 10);

        Team<FootballPlayer> kostinbrod = new Team<>("Kostinbrod");

        kostinbrod.AddPlayer(joe);
        kostinbrod.AddPlayer(pat);

        System.out.println(kostinbrod.getPlayers().size());
    }
}