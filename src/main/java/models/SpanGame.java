package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Dilon_000 on 2/18/2016.
 */
public class SpanGame extends Game {

    public SpanGame(){
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
        cols.add(new ArrayList<Card>());
    }

    public void buildDeck(){
        for(int i = 1; i < 11; i++){
            deck.add(new Card(i, Suit.Bastos));
            deck.add(new Card(i, Suit.Oros));
            deck.add(new Card(i, Suit.Copas));
            deck.add(new Card(i, Suit.Espadas));
        }
    }

}
