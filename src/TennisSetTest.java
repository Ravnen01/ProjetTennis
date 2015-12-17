import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stagiaire on 17/12/2015.
 */
public class TennisSetTest {
        Player player1;
        Player player2;
        TennisSet tennisSet;
    @Before
    public void setUp() throws Exception {
        player1=new Player("Jean");
        player2=new Player("Jacque");
        tennisSet=new TennisSet(player1,player2);
    }

    @Test
    public void testPointForPlayer() throws Exception {
        tennisSet.pointForPlayer(player1);//15
        assertEquals(15,tennisSet.getCurentlyJeu().getScorePlayer1());
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 2
        assertEquals(tennisSet.getScorePlayer1(),1);
    }

    @Test
    public void testWinner() throws Exception {
        tennisSet.pointForPlayer(player1);//15
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 2
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 3
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 4
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 5
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 6
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 2
        assertEquals(player1,tennisSet.winner());
    }

    @Test
    public void testIsEnd() throws Exception {
        tennisSet.pointForPlayer(player1);//15
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 2
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 3
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 4
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 5
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 6
        tennisSet.pointForPlayer(player1);//30
        tennisSet.pointForPlayer(player1);//40
        tennisSet.pointForPlayer(player1);//win
        tennisSet.pointForPlayer(player1);//15 set 2
        assertEquals(true,tennisSet.isEnd());
    }
}