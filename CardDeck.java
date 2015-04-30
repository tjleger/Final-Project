/*Tommy Leger
CardDeck
CS 110*/


import java.util.*;
import java.util.Random;

/**
   Represents a card deck. A card deck will have 52 
   cards 
*/

public class CardDeck
{
   private ArrayList<Card>deck;
   
   /**
   Default constructor. Creates 52 cards
   */
   
   public CardDeck()
   {
      deck = new ArrayList<Card>();
      deck.add(new Card(2, Card.SPADES));
      deck.add(new Card(3, Card.SPADES));
      deck.add(new Card(4, Card.SPADES));
      deck.add(new Card(5, Card.SPADES));
      deck.add(new Card(6, Card.SPADES));
      deck.add(new Card(7, Card.SPADES));
      deck.add(new Card(8, Card.SPADES));
      deck.add(new Card(9, Card.SPADES));
      deck.add(new Card(10, Card.SPADES));
      deck.add(new Card(Card.JACK, Card.SPADES));
      deck.add(new Card(Card.QUEEN, Card.SPADES));
      deck.add(new Card(Card.KING, Card.SPADES));
      deck.add(new Card(Card.ACE, Card.SPADES));
      
      deck.add(new Card(2, Card.HEARTS));
      deck.add(new Card(3, Card.HEARTS));
      deck.add(new Card(4, Card.HEARTS));
      deck.add(new Card(5, Card.HEARTS));
      deck.add(new Card(6, Card.HEARTS));
      deck.add(new Card(7, Card.HEARTS));
      deck.add(new Card(8, Card.HEARTS));
      deck.add(new Card(9, Card.HEARTS));
      deck.add(new Card(10, Card.HEARTS));
      deck.add(new Card(Card.JACK, Card.HEARTS));
      deck.add(new Card(Card.QUEEN, Card.HEARTS));
      deck.add(new Card(Card.KING, Card.HEARTS));
      deck.add(new Card(Card.ACE, Card.HEARTS));
      
      deck.add(new Card(2, Card.CLUBS));
      deck.add(new Card(3, Card.CLUBS));
      deck.add(new Card(4, Card.CLUBS));
      deck.add(new Card(5, Card.CLUBS));
      deck.add(new Card(6, Card.CLUBS));
      deck.add(new Card(7, Card.CLUBS));
      deck.add(new Card(8, Card.CLUBS));
      deck.add(new Card(9, Card.CLUBS));
      deck.add(new Card(10, Card.CLUBS));
      deck.add(new Card(Card.JACK, Card.CLUBS));
      deck.add(new Card(Card.QUEEN, Card.CLUBS));
      deck.add(new Card(Card.KING, Card.CLUBS));
      deck.add(new Card(Card.ACE, Card.CLUBS));
      
      deck.add(new Card(2, Card.DIAMONDS));
      deck.add(new Card(3, Card.DIAMONDS));
      deck.add(new Card(4, Card.DIAMONDS));
      deck.add(new Card(5, Card.DIAMONDS));
      deck.add(new Card(6, Card.DIAMONDS));
      deck.add(new Card(7, Card.DIAMONDS));
      deck.add(new Card(8, Card.DIAMONDS));
      deck.add(new Card(9, Card.DIAMONDS));
      deck.add(new Card(10, Card.DIAMONDS));
      deck.add(new Card(Card.JACK, Card.DIAMONDS));
      deck.add(new Card(Card.QUEEN, Card.DIAMONDS));
      deck.add(new Card(Card.KING, Card.DIAMONDS));
      deck.add(new Card(Card.ACE, Card.DIAMONDS));
   }
   
   /**
      Other construcotr. Sets the deck to a different
      array list.
      @param c The other deck
   */
   
   public CardDeck(ArrayList<Card>c)
   {
      deck = c;
   }
   
   /**
      Shuffles the deck.
   */
   
   public void shuffle()
   {
      Random rand = new Random();
      
      for (int i = 0; i < deck.size(); i++)
      {
         //random number from 0 to 51.
         int randomNumber = rand.nextInt(deck.size());
         //creates a temporary card from index i
         Card temp = deck.get(randomNumber);
         //removes card at index i
         deck.remove(randomNumber);
         //adds back card to bottom of deck
         deck.add(temp);
      }
   }
   /**
      Returns a the card at a specified index.
      @param num The index
   */
   
   public Card get(int num)
   {
      return deck.get(num);
   }
   
   /**
      Returns the array list of cards.
   */
   
   public ArrayList<Card> getDeck()
   {
      return deck;
   }
}