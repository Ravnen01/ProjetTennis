import java.util.ArrayList;

/**
 * Created by Corentin on 15/12/2015.
 */
public class TennisSet {
    private Player player1;
    private Player player2;
    private int scorePlayer1;
    private int scorePlayer2;
    private ArrayList<TennisJeu> listeJeu=new ArrayList<>();
    private int jeuCurently=0;
    private boolean end=false;

    public TennisSet(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        listeJeu.add(new TennisJeu(player1,player2));
    }

    private void newJeu(){

        listeJeu.add(new TennisJeu(player1,player2));
        jeuCurently++;
    }

    public void pointForPlayer(Player player){
        if(listeJeu.get(jeuCurently).isEnd()){
            if(player1==listeJeu.get(jeuCurently).winner()){
                scorePlayer1++;
            }else{
                scorePlayer2++;
            }
            if(!endSet()){
                newJeu();
                listeJeu.get(jeuCurently).playerAsPoint(player);
            }
        }else {
            listeJeu.get(jeuCurently).playerAsPoint(player);
        }

    }

    private boolean endSet(){
        if (scorePlayer1 == 6 || scorePlayer2==6){
            end=true;
            return true;
        }
        return false;
    }

    public Player winner(){
        if(scorePlayer1>scorePlayer2){
            return player1;
        }else{
            return player2;
        }
    }

    public boolean isEnd(){return end;}

    public int getScorePlayer1() {
        return scorePlayer1;
    }

    public int getScorePlayer2() {
        return scorePlayer2;
    }

    public TennisJeu getCurentlyJeu(){return listeJeu.get(jeuCurently);}
}
