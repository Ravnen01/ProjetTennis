import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by Corentin on 17/12/2015.
 */
public class TennisMatchTest {
    TennisMatch tennisMatch;
    Player player1;
    Player player2;

    @Before
    public void setUp() throws Exception {
        player1=new Player("Jean");
        player2=new Player("Jacque");
        tennisMatch=new TennisMatch(player1,player2,MatchType.BEST_OF_THREE,false);
        tennisMatch.updateWithPointWonBy(player1);//15
        tennisMatch.updateWithPointWonBy(player1);//30
        tennisMatch.updateWithPointWonBy(player1);//40
        tennisMatch.updateWithPointWonBy(player1);//Win set 1
        tennisMatch.updateWithPointWonBy(player1);//15

    }


    @org.junit.Test
    public void testPointForPlayer() throws Exception {
        assertEquals("15",tennisMatch.pointForPlayer(player1));
        tennisMatch.updateWithPointWonBy(player1);//30
        assertEquals("30",tennisMatch.pointForPlayer(player1));
    }

    @org.junit.Test
    public void testGameInCurrentSetForPlayer() throws Exception {
        assertEquals(1,tennisMatch.gameInCurrentSetForPlayer(player1));

    }

    @org.junit.Test
    public void testGameInSetForPlayer() throws Exception {
        tennisMatch.updateWithPointWonBy(player1);//30
        tennisMatch.updateWithPointWonBy(player1);//40
        tennisMatch.updateWithPointWonBy(player1);//win
        tennisMatch.updateWithPointWonBy(player1);//15
        assertEquals(2,tennisMatch.gameInSetForPlayer(1,player1));
    }
}