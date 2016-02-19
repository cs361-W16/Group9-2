package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Dilon_000 on 2/18/2016.
 */
public class EngGame extends Game {

    public EngGame(){
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
    }

    public void buildDeck(){
        for(int i = 2; i < 15; i++){
            deck.add(new Card(i, Suit.Clubs));
            deck.add(new Card(i, Suit.Hearts));
            deck.add(new Card(i, Suit.Diamonds));
            deck.add(new Card(i, Suit.Spades));
        }
    }
}
