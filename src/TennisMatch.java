import java.util.ArrayList;

/**
 * Created by Corentin on 12/12/2015.
 */
public class TennisMatch {
    private Player player1;
    private Player player2;
    private MatchType matchType;
    private boolean breakEgalite;
    private ArrayList<TennisSet> listSet=new ArrayList<>();
    private int curentlySet=0;
    private boolean end=false;

    public TennisMatch(Player player1, Player player2, MatchType matchType, boolean breakEgalite) {
        this.player1 = player1;
        this.player2 = player2;
        this.matchType = matchType;
        this.breakEgalite = breakEgalite;
        listSet.add(new TennisSet(player1,player2));
    }

    public void updateWithPointWonBy(Player player){
        if(!isFinish()){
            listSet.get(curentlySet).pointForPlayer(player);
            if(listSet.get(curentlySet).isEnd()){

                if(matchType==MatchType.BEST_OF_THREE && curentlySet==3 || matchType==MatchType.BEST_OF_FIVE && curentlySet==5){
                    end=true;
                }else{
                    curentlySet++;
                }

            }

        }
    }

    public int currentSetNumber(){return curentlySet+1;}

    public String pointForPlayer(Player player){
        int score;
        if(player==player1){
            score=listSet.get(curentlySet).getCurentlyJeu().getScorePlayer1();
        }else{
            score=listSet.get(curentlySet).getCurentlyJeu().getScorePlayer2();
        }
        if(score==50){
            return "A";
        }else{
            return ""+score;
        }
    }

    public int gameInCurrentSetForPlayer(Player player){
        if(player==player1){
             return listSet.get(curentlySet).getScorePlayer1();
        }else{
            return listSet.get(curentlySet).getScorePlayer2();
        }
    }

    public int gameInSetForPlayer(int set,Player player){
        if(player==player1){
            return listSet.get(set-1).getScorePlayer1();
        }else{
            return listSet.get(set-1).getScorePlayer2();
        }
    }

    public boolean isFinish(){return end;}

}
