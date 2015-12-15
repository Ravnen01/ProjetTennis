/**
 * Created by Corentin on 12/12/2015.
 */
public class TennisMatch {
    private Player player1;
    private Player player2;
    private MatchType matchType;
    private boolean breakEgalite;

    public TennisMatch(Player player1, Player player2, MatchType matchType, boolean breakEgalite) {
        this.player1 = player1;
        this.player2 = player2;
        this.matchType = matchType;
        this.breakEgalite = breakEgalite;
    }

    public void updateWithPointWonBy(Player player){

    }


}
