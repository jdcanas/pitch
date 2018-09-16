public class Main {

    public static void main(String[] args) {
        assert false;
        Deck d = new Deck();
        System.out.println("Cards: " + d.getCards().size());

        System.out.println("Hello World!");

        runTests();
    }

    public static void runTests() {
        testDeck();
    }

    public static void testDeck() {
        Deck d = new Deck();
        System.out.println("Cards: " + d.getCards().size());
        assert(d.getCards().size() == Config.deckSize);
    }


}
