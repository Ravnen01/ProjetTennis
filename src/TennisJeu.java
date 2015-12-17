/**
 * Created by Corentin on 15/12/2015.
 */
public class TennisJeu {
    private Player player1;
    private Player player2;
    private int scorePlayer1;// 0,15,30,40 and 50 for A
    private int scorePlayer2;
    private boolean end;

    public TennisJeu(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        scorePlayer1=0;
        scorePlayer2=0;
        end=false;
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
        if(player==player1){
            player1AddPoint();
        }else if(player==player2) {
            player2AddPoint();
        }
    }

    private void player1AddPoint(){
        switch (scorePlayer1){
            case 0:
                scorePlayer1=15;
                break;
            case 15:
                scorePlayer1=30;
                break;
            case 30:
                scorePlayer1=40;
                break;
            case 40:
                if(scorePlayer2<40){
                  end=true;
                    scorePlayer1=50;
                }else if(scorePlayer2==40){
                    scorePlayer1=50;
                }else{
                    scorePlayer2=40;
                    scorePlayer1=40;
                }
                break;
            case 50:
                    end=true;
                break;
        }
    }

    private void player2AddPoint(){
        switch (scorePlayer2){
            case 0:
                scorePlayer2=15;
                break;
            case 15:
                scorePlayer2=30;
                break;
            case 30:
                scorePlayer2=40;
                break;
            case 40:
                if(scorePlayer1<40){
                    end=true;
                }else if(scorePlayer1==40){
                    scorePlayer2=50;
                }else{
                    scorePlayer1=40;
                }
                break;
            case 50:
                end=true;
                break;
        }
    }

    public boolean isEnd(){return end;}

    public Player winner(){
        if(scorePlayer1==50 && isEnd()){
            return player1;
        }else if(scorePlayer2==50 && isEnd()){
            return player2;
        }else{
            return null;
        }
    }

}
