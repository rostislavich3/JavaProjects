package blackjacksolitaire.JavaProjects;

public class Card extends SuitShuffle {
    String face;
    SuitShuffle suit;
//    int total 0;

    public Card (String face, SuitShuffle suit) { //constructor
        this.face = face;
        this.suit = suit;
    }

//getters and setters
    public String getFace() {
        return face;
    }

    public SuitShuffle getSuit() {
        return suit;
    }

    public String toString() {
        return getFace() + " of " + getSuit();
    }

}
