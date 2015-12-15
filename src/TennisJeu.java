/**
 * Created by Corentin on 15/12/2015.
 */
public class TennisJeu {
    private Player player1;
    private Player player2;
    private int scorePlayer1;
    private int scorePlayer2;

    public TennisJeu(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        scorePlayer1=0;
        scorePlayer2=0;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getScorePlayer1() {
        return scorePlayer1;
    }

    public int getScorePlayer2() {
        return scorePlayer2;
    }

    public void playerAsPoint(Player player){

    }

    private void player1AddPoint(){

    }

    private void player2AddPoint(){

    }
    
}
