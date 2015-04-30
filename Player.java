/*Tommy Leger
Player
CS 110*/

import java.util.*;

/**
   Represents a Player for the War game. A Player simply has 
   an array list of cards.
*/

public class Player
{
   private ArrayList<Card>cards; //the array list of cards
   
   /**
      Constructor. Accepts an array list of cards.
      @param theCards The array list of cards.
   */
   
   public Player(ArrayList<Card>theCards)
   {
      cards = theCards;
   }
   
   /** 
      The getDeck method returns the array list of cards 
      the player currently has.
   */
   
   public ArrayList<Card>getDeck()
   {
      return cards;
   }
   
   /**
      Returns the second card in the array list.
      Utility method for when a war occurs.
   */
   
   public Card getTopCard()
   {
      return (cards.get(1));
   }
   
   /**
      Returns the bottom card in the array list.
   */
   
   public Card getBottomCard()
   {
      return (cards.get(0));
   }
   
   /**
      Removes the first two cards in the array list.
      Utility method for when a war occurs and the
      player loses.
   */
   
   public void remove()
   {
      getDeck().remove(0);
      getDeck().remove(0);
   }
   
   /**
      Move the first two cards in the array list to the
      back. Utility function for when a war occurs and
      the player wins.
   */
   
   public void moveCards()
   {
      Card c1 = cards.get(0);
      cards.remove(0);
      Card c2 = cards.get(0);
      cards.remove(0);
      cards.add(c1);
      cards.add(c2);
   }
   
   /**
      Moves a the first card in the pile
      to the back. 
   */
   
   public void moveCard()
   {
      Card c1 = cards.get(0);
      cards.remove(0);
      cards.add(c1);
   }
}