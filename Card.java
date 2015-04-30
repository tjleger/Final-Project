/*Tommy Leger
Card
CS 110*/

import java.util.Scanner;

/**
   Creates a card
   
*/

public class Card
{
   public static final int SPADES = 1; 
   public static final int CLUBS = 2;
   public static final int HEARTS = 3;
   public static final int DIAMONDS = 4;
   public static final int JACK = 11;
   public static final int QUEEN = 12;
   public static final int KING = 13;    
   public static final int ACE = 14;
   private int rank;   
   private int suit;   
   /** 
      The default constructor takes an integer rank and suit as 
      arguments.
      @param rank The rank of the card
      @param suit The suit of the card
   */
    
   public Card(int rank, int suit)
   {
      this.rank = rank;
      this.suit = suit;
   }
   
   public Card(Card other)
   {
      rank = other.rank;
      suit = other.suit;
   }
   /** 
      The getSuit method returns the suit of the card.
   */
   
   public int getSuit()
   {
      return suit;
   }
   
   /** 
      The getRank method returns the rank of the card.
   */
   
   public int getRank()
   {
      return rank;
   }
   
   /** 
      The toString method overrides the default toString 
      method. It returns the rank and suit of the card.
   */
   
   public String toString()
   {
      String realRank; 
      String realSuit;       
      //if the rank is greater than 10, it must be one of the constants
      if (getRank()>10)
      {
         if (getRank()==JACK)
            realRank = "Jack";
         else if (getRank()==QUEEN)
            realRank = "Queen";
         else if (getRank()==KING)
            realRank = "King";
         else 
            realRank = "Ace";
      }
      
      else
         realRank = "" + getRank();
      
       if (getSuit()==(SPADES))
         realSuit = "Spades";
      else if (getSuit()==(CLUBS))
         realSuit = "Clubs";
      else if (getSuit()==(HEARTS))
         realSuit = "Hearts";
      else
         realSuit = "Diamonds";
      
      //returns what rank and suit the card is  
      return realRank + " of " + realSuit;
         
   }
   
   /** 
      The equals method overrides the default equals method.
      The method compares the host Card to otherCard, a
      different card. The cards are equal if they have the
      same rank.
      @param otherCard A different card object to be compared
   */
   
   public boolean equals(Card otherCard)
   {
      return (getRank()==otherCard.getRank());
   }
   
  
}