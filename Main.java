package blackjacksolitaire.JavaProjects;

public class Main {

    public static void main(String[] args) {
        SuitShuffle suit = new SuitShuffle();
        Card card = new Card("King", suit.toString(suit));
//TODO: Convert Suit to string or text...
        System.out.println(card);
    }
}