import java.util.*;
public class DeckOfCards {

    // Method to initialize the deck of cards
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the deck of cards to players
    public static String[][] distributeCards(String[] deck, int numOfPlayers, int cardsPerPlayer) {
        String[][] players = new String[numOfPlayers][cardsPerPlayer];
        int deckIndex = 0;

        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[deckIndex++];
            }
        }

        return players;
    }

    // Method to print the players and their cards
    public static void printPlayerCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Initialize the deck
        String[] deck = initializeDeck(suits, ranks);

        // Shuffle the deck
        shuffleDeck(deck);

        // Get number of players and cards per player
        System.out.println("Enter number of players: ");
        int numOfPlayers = input.nextInt();
        System.out.println("Enter number of cards per player: ");
        int cardsPerPlayer = input.nextInt();

        // Distribute the cards to players
        if (cardsPerPlayer * numOfPlayers > deck.length) {
            System.out.println("Not enough cards in the deck.");
        } else {
            String[][] players = distributeCards(deck, numOfPlayers, cardsPerPlayer);

            // Print the cards each player has
            printPlayerCards(players);
        }

        input.close(); // Close scanner
    }
}
