package net.blackjack.game;


import java.util.Random;


public class Test {
       public static void main(String[] args) {
        Player player1 = new Player("rain");
        Player player2 = new Player("khing");
        
        Judge.join(player1);
        Judge.join(player2);
        Judge.setCurrentPlayer(player1);
        new ImageDisplay();
//           System.out.println(Test.class.getResource("").getPath());
        
    }
}
