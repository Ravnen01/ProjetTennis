import java.util.ArrayList;

/**
 * Created by Corentin on 15/12/2015.
 */
public class TennisSet {
    private Player player1;
    private Player player2;
    private ArrayList<TennisJeu> listeJeu=new ArrayList<>();
    private int jeuCurently=0;

    public TennisSet(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private void newJeu(){
        listeJeu.add(new TennisJeu(player1,player2));
    }

}
