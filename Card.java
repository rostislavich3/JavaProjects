package blackjacksolitaire;

import javax.print.DocFlavor;

public class Card {
    String face;
    String suit;
//    int total 0;

    public Card (String face, String suit) { //constructor
        this.face = face;
        this.suit = suit;
    }

//getters and setters
    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return getFace() + " of " + getSuit();
    }

}
