package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/25/16.
 */
public class testGame {

    @Test
    public void testEngGameCreation(){
        Game g = new EngGame();
        assertNotNull(g);
    }

    @Test
    public void testSpanGameCreation(){
        Game g = new SpanGame();
        assertNotNull(g);
    }

    @Test
    public void testEngGameBuildDeck(){
        Game g = new EngGame();
        g.buildDeck();
        assertEquals(52,g.deck.size());
    }

    @Test
    public void testSpanGameBuildDeck(){
        Game g = new SpanGame();
        g.buildDeck();
        assertEquals(40, g.deck.size());
    }

    @Test
    public void testEngGameInit(){
        Game g = new EngGame();
        g.buildDeck();
        g.shuffle();
        assertNotEquals(2,g.deck.get(0).getValue());
    }

    @Test
    public void testSpanGameInit(){
        Game g = new SpanGame();
        g.buildDeck();
        g.shuffle();
        assertNotEquals(1, g.deck.get(0).getValue());
    }

    @Test
    public void testEngGameStart(){
        Game g = new EngGame();
        g.buildDeck();
        g.shuffle();
        g.dealFour();
        assertEquals(1,g.cols.get(0).size());
        assertEquals(1,g.cols.get(1).size());
        assertEquals(1,g.cols.get(2).size());
        assertEquals(1,g.cols.get(3).size());
    }

    @Test
    public void testSpanGameStart(){
        Game g = new SpanGame();
        g.buildDeck();
        g.shuffle();
        g.dealFour();
        assertEquals(1, g.cols.get(0).size());
        assertEquals(1, g.cols.get(1).size());
        assertEquals(1, g.cols.get(2).size());
        assertEquals(1, g.cols.get(3).size());
    }

    @Test
    public void testCustomDealEng(){
        Game g = new EngGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        assertEquals("2Clubs",g.cols.get(0).get(0).toString());
        assertEquals("3Clubs",g.cols.get(1).get(0).toString());
        assertEquals("4Clubs",g.cols.get(2).get(0).toString());
        assertEquals("5Clubs",g.cols.get(3).get(0).toString());
    }

    @Test
    public void testCustomDealSpan(){
        Game g = new SpanGame();
        g.buildDeck();
        g.customDeal(0, 3, 6, 9);
        assertEquals("1Bastos", g.cols.get(0).get(0).toString());
        assertEquals("2Bastos", g.cols.get(1).get(0).toString());
        assertEquals("3Bastos", g.cols.get(2).get(0).toString());
        assertEquals("4Bastos", g.cols.get(3).get(0).toString());
    }

    @Test
    public void testRemoveFunctionEng(){
        Game g = new EngGame();
        g.buildDeck();
        g.customDeal(0,3,6,9);
        g.remove(2);
        assertEquals(0,g.cols.get(2).size());
    }

    @Test
    public void testRemoveFunctionSpan(){
        Game g = new SpanGame();
        g.buildDeck();
        g.customDeal(0, 3, 6, 9);
        g.remove(2);
        assertEquals(0, g.cols.get(2).size());
    }



}
