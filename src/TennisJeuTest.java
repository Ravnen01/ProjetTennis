import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stagiaire on 17/12/2015.
 */
public class TennisJeuTest {
    Player player1;
    Player player2;
    TennisJeu tennisJeu;
    @Before
    public void setUp() throws Exception {
        player1=new Player("Jean");
        player2=new Player("Jacque");
        tennisJeu=new TennisJeu(player1,player2);
    }

    @Test
    public void testPlayerAsPoint() throws Exception {
        tennisJeu.playerAsPoint(player1);
        assertEquals(tennisJeu.getScorePlayer1(), 15);
        assertEquals(tennisJeu.getScorePlayer2(), 0);
        tennisJeu.playerAsPoint(player2);
        assertEquals(tennisJeu.getScorePlayer1(), 15);
        assertEquals(tennisJeu.getScorePlayer2(), 15);
        tennisJeu.playerAsPoint(player2);
        assertEquals(tennisJeu.getScorePlayer1(), 15);
        assertEquals(tennisJeu.getScorePlayer2(), 30);
    }

    @Test
    public void testIsEnd() throws Exception {
        tennisJeu.playerAsPoint(player1);//15
        tennisJeu.playerAsPoint(player1);//30
        tennisJeu.playerAsPoint(player1);//40
        tennisJeu.playerAsPoint(player1);//win
        assertEquals(tennisJeu.isEnd(), true);
    }

    @Test
    public void testWinner() throws Exception {
        tennisJeu.playerAsPoint(player1);//15
        tennisJeu.playerAsPoint(player1);//30
        assertEquals(null,tennisJeu.winner());
        tennisJeu.playerAsPoint(player1);//40
        tennisJeu.playerAsPoint(player1);//win
        assertEquals(player1, tennisJeu.winner());
    }
}