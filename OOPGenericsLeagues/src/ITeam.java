import java.util.List;

public interface ITeam<T> {
    String getName();
    void win();
    void lose();
    int getGamesPlayed();
    int getWins();
    int getLosses();
    boolean addPlayer(T player);
    List<T> players();
}
