package net.blackjack.game;


import javax.swing.*;
import java.util.ArrayList;

public class Player {

    private String name;
    private boolean status = true;
     //player's card
    private ArrayList<Card> myCard = new ArrayList<Card>();
     //player's chip
    private ArrayList<Chip> myChip = new ArrayList<Chip>();
    
    public Player(){
        
    }
    
    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void addMyCard(Card myCard){
        this.myCard.add(myCard);
    }
    
    public ArrayList<Card> getMyCard() {
        return myCard;
    }
    
    public void addMyChip(Chip myChip){
        this.myChip.add(myChip);
    }
    
    public ArrayList<Chip> getMyChip() {
        return myChip;
    }
    
//    
//    public int cardPoint(){
//        return
//    }
//    
//    public int gameScore(){
//        return
//    }
//    public void buttomHit(){
//        
//    }
    
    public void stand(){
        this.status = true;
        Judge.switchTurn();
    }
}
