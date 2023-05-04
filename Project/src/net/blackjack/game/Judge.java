package net.blackjack.game;


import java.util.*;

public class Judge {

    private static final CardHandler CARDS = new CardHandler();
    private static HashMap<String, Card> deckCard = CARDS.getHashMap(); //deckCard have hashmap of handler
    private static ArrayList<Chip> deckChip;
    // Players in the game
    private static ArrayList<Player> players = new ArrayList<Player>();
    private static Player currentPlayer;
    private static Random random = new Random();
    private static boolean isEndGame = false;

    public static Card giveCard(Player p) {
        Object[] values = deckCard.values().toArray();
        Card randomCard = (Card) values[random.nextInt(values.length)];

        if (isEndGame == true) {
            deckCard = CARDS.getHashMap();
            return null;
        } else if (deckCard.isEmpty() == true) {
            return null;
        } else {
            Card removeCard = deckCard.remove(randomCard.getDisplayName());
            p.addMyCard(removeCard);
            return removeCard;
        }
    }

    // player join the game
    public static void join(Player p) {
        if (players.size() <= 2) {
            players.add(p);
        } else {
            System.out.println("Error");
        }
    }

    public static void setCurrentPlayer(Player currentPlayer) {
        Judge.currentPlayer = currentPlayer;
    }

    // getter which turn th game current is
    public static Player getPlayerTurn() {
        return currentPlayer;
    }
//    

    // Switch play turn
    public static void switchTurn() {
        if (currentPlayer.equals(players.get(0))) {
            currentPlayer = players.get(1);
        } else {
            currentPlayer = players.get(0);
        }
    }

//    public static void endGame() {
//
//    }
//    return all Player
    public static ArrayList<Player> getAllPlayers() {
        return players;
    }
}
