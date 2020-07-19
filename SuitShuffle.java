package blackjacksolitaire.JavaProjects;

import java.util.Random;

class SuitShuffle {

    public SuitShuffle toString(SuitShuffle r) {
        return r;
    }

    public enum Suit {

        HEARTS,
        SPADES,
        DIAMONDS,
        CLUBS;
    }

    private static final RandomEnum<Suit> r =
            new RandomEnum<Suit>(Suit.class);

    private static class RandomEnum<E extends Enum<E>> {

        private static final Random RND = new Random();
        private final E[] values;

        public RandomEnum(Class<E> token) {
            values = token.getEnumConstants();
        }

        public E random() {
            return values[RND.nextInt(values.length)];
        }
    }
    public static void main(String[] args) {
        System.out.println(r.random());
    }

}