import java.util.*;
/*Tommy Leger
CS 110*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
  WAR GAME
*/
public class WarBoard extends JFrame implements ActionListener
{
   private JFrame frame;
   private JButton b,b2;
   private JLabel player1Card,player1Flipped,player2Card,player2Flipped,warText,gameInfo;
   private Player1 player1;
   private Player2 player2;
   private CardDeck player1Cards, player2Cards;
   private JPanel headerPanel;
   
   ///get images
      private ImageIcon acec = new ImageIcon("acec.jpg");
   private ImageIcon aced = new ImageIcon("aced.jpg");
   private ImageIcon aceh = new ImageIcon("aceh.jpg");
   private ImageIcon aces = new ImageIcon("aces.jpg");
   
   private ImageIcon kingc = new ImageIcon("kingc.jpg");
   private ImageIcon kingd = new ImageIcon("kingd.jpg");
   private ImageIcon kingh = new ImageIcon("kingh.jpg");
   private ImageIcon kings = new ImageIcon("kings.jpg");
   
   private ImageIcon queenc = new ImageIcon("queenc.jpg");
   private ImageIcon queend = new ImageIcon("queend.jpg");
   private ImageIcon queenh = new ImageIcon("queenh.jpg");
   private ImageIcon queens = new ImageIcon("queens.jpg");
   
   private ImageIcon jackc = new ImageIcon("jackc.jpg");
   private ImageIcon jackd = new ImageIcon("jackd.jpg");
   private ImageIcon jackh = new ImageIcon("jackh.jpg");
   private ImageIcon jacks = new ImageIcon("jacks.jpg");
   
   private ImageIcon tenc = new ImageIcon("10c.jpg");
   private ImageIcon tend = new ImageIcon("10d.jpg");
   private ImageIcon tenh = new ImageIcon("10h.jpg");
   private ImageIcon tens = new ImageIcon("10s.jpg");
   
   private ImageIcon ninec = new ImageIcon("9c.jpg");
   private ImageIcon nined = new ImageIcon("9d.jpg");
   private ImageIcon nineh = new ImageIcon("9h.jpg");
   private ImageIcon nines = new ImageIcon("9s.jpg");
   
   private ImageIcon eightc = new ImageIcon("8c.jpg");
   private ImageIcon eightd = new ImageIcon("8d.jpg");
   private ImageIcon eighth = new ImageIcon("8h.jpg");
   private ImageIcon eights = new ImageIcon("8s.jpg");
   
   private ImageIcon sevenc = new ImageIcon("7c.jpg");
   private ImageIcon sevend = new ImageIcon("7d.jpg");
   private ImageIcon sevenh = new ImageIcon("7h.jpg");
   private ImageIcon sevens = new ImageIcon("7s.jpg");
   
   private ImageIcon sixc = new ImageIcon("6c.jpg");
   private ImageIcon sixd = new ImageIcon("6d.jpg");
   private ImageIcon sixh = new ImageIcon("6h.jpg");
   private ImageIcon sixs = new ImageIcon("6s.jpg");
   
   private ImageIcon fivec = new ImageIcon("5c.jpg");
   private ImageIcon fived = new ImageIcon("5d.jpg");
   private ImageIcon fiveh = new ImageIcon("5h.jpg");
   private ImageIcon fives = new ImageIcon("5s.jpg");
   
   private ImageIcon fourc = new ImageIcon("4c.jpg");
   private ImageIcon fourd = new ImageIcon("4d.jpg");
   private ImageIcon fourh = new ImageIcon("4h.jpg");
   private ImageIcon fours = new ImageIcon("4s.jpg");
   
   private ImageIcon threec = new ImageIcon("3c.jpg");
   private ImageIcon threed = new ImageIcon("3d.jpg");
   private ImageIcon threeh = new ImageIcon("3h.jpg");
   private ImageIcon threes = new ImageIcon("3s.jpg");
   
   private ImageIcon twoc = new ImageIcon("2c.jpg");
   private ImageIcon twod = new ImageIcon("2d.jpg");
   private ImageIcon twoh = new ImageIcon("2h.jpg");
   private ImageIcon twos = new ImageIcon("2s.jpg");
   
   private ImageIcon back = new ImageIcon("back.jpg");
   private boolean war;
   
   /**
    Builds the GUI
   */
   
   public WarBoard()
   {
      frame = new JFrame("War");
      
      frame.setSize(345, 400);
      frame.setLayout(new BorderLayout());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      b = new JButton("Flip");
      b.addActionListener(this);
      
      
      player1Card = new JLabel();
      player1Card.setIcon(back);
      player1Flipped = new JLabel(back);
      headerPanel = new JPanel(new BorderLayout());
      gameInfo = new JLabel("", SwingConstants.CENTER);
      updateGameInfo("");
      headerPanel.add(gameInfo, BorderLayout.NORTH);
      frame.add(headerPanel, BorderLayout.NORTH);
      
      player2Card = new JLabel();
      player2Card.setIcon(back);
      player2Flipped = new JLabel(back);
      
      warText = new JLabel("War!");
      
      frame.add(b, BorderLayout.SOUTH);
      frame.add(warText, BorderLayout.CENTER);
      frame.add(player1Flipped, BorderLayout.WEST);
      frame.add(player2Flipped, BorderLayout.EAST);
      
      warText.setVisible(false);
      
      frame.setVisible(true);
      war = false;
      
      //creates a new deck, shuffles it, and gives each player 26.
      CardDeck deck = new CardDeck();
      deck.shuffle();
      ArrayList<Card>player1Deck = new ArrayList<Card>();
      ArrayList<Card>player2Deck = new ArrayList<Card>();
      for (int i = 0; i < 26; i++)
      {
         player1Deck.add(deck.get(0));
         deck.getDeck().remove(0);
      }
      for (int i = 0; i < 26; i++)
      {
         player2Deck.add(deck.get(0));
         deck.getDeck().remove(0);
      }
      player1Cards = new CardDeck(player1Deck);
      player2Cards = new CardDeck(player2Deck);
      player1 = new Player1(player1Deck);
      player2 = new Player2(player2Deck);
      
   }
   /**
      Sets player 1's card to the correct image,
      based on rank and suit.
   */
   
   public void setPlayer1Flipped()
   {
      int rank = player1.getBottomCard().getRank();
      int suit = player1.getBottomCard().getSuit();
      if (suit==1)
      {
         if (rank==2)
            player1Flipped.setIcon(twos);
         else if (rank==3)
            player1Flipped.setIcon(threes);
        else if (rank==4)
            player1Flipped.setIcon(fours);
        else if (rank==5)
            player1Flipped.setIcon(fives);
        else if (rank==6)
            player1Flipped.setIcon(sixs);
        else if (rank==7)
            player1Flipped.setIcon(sevens);
        else if (rank==8)
            player1Flipped.setIcon(eights);
       else  if (rank==9)
            player1Flipped.setIcon(nines);
       else  if (rank==10)
            player1Flipped.setIcon(tens);
       else  if (rank==11)
            player1Flipped.setIcon(jacks);
       else  if (rank==12)
            player1Flipped.setIcon(queens);
       else  if (rank==13)
            player1Flipped.setIcon(kings);
        else if (rank==14)
            player1Flipped.setIcon(aces);
      }
      else if (suit==2)
      {
         if (rank==2)
            player1Flipped.setIcon(twoc);
         else if (rank==3)
            player1Flipped.setIcon(threec);
         else if (rank==4)
            player1Flipped.setIcon(fourc);
        else if (rank==5)
            player1Flipped.setIcon(fivec);
        else if (rank==6)
            player1Flipped.setIcon(sixc);
        else if (rank==7)
            player1Flipped.setIcon(sevenc);
        else if (rank==8)
            player1Flipped.setIcon(eightc);
        else if (rank==9)
            player1Flipped.setIcon(ninec);
        else if (rank==10)
            player1Flipped.setIcon(tenc);
        else if (rank==11)
            player1Flipped.setIcon(jackc);
        else if (rank==12)
            player1Flipped.setIcon(queenc);
        else if (rank==13)
            player1Flipped.setIcon(kingc);
        else if (rank==14)
            player1Flipped.setIcon(acec);
      }
      else if (suit==3)
      {
         if (rank==2)
            player1Flipped.setIcon(twoh);
         else if (rank==3)
            player1Flipped.setIcon(threeh);
        else if (rank==4)
            player1Flipped.setIcon(fourh);
         else if (rank==5)
            player1Flipped.setIcon(fiveh);
        else if (rank==6)
            player1Flipped.setIcon(sixh);
        else if (rank==7)
            player1Flipped.setIcon(sevenh);
        else if (rank==8)
            player1Flipped.setIcon(eighth);
        else if (rank==9)
            player1Flipped.setIcon(nineh);
        else if (rank==10)
            player1Flipped.setIcon(tenh);
        else if (rank==11)
            player1Flipped.setIcon(jackh);
        else if (rank==12)
            player1Flipped.setIcon(queenh);
        else if (rank==13)
            player1Flipped.setIcon(kingh);
        else if (rank==14)
            player1Flipped.setIcon(aceh);
      }
      else if (suit==4)
      {
         if (rank==2)
            player1Flipped.setIcon(twod);
         else if (rank==3)
            player1Flipped.setIcon(threed);
         else if (rank==4)
            player1Flipped.setIcon(fourd);
         else if (rank==5)
            player1Flipped.setIcon(fived);
         else if (rank==6)
            player1Flipped.setIcon(sixd);
         else if (rank==7)
            player1Flipped.setIcon(sevend);
         else if (rank==8)
            player1Flipped.setIcon(eightd);
         else if (rank==9)
            player1Flipped.setIcon(nined);
        else if (rank==10)
            player1Flipped.setIcon(tend);
        else if (rank==11)
            player1Flipped.setIcon(jackd);
        else if (rank==12)
            player1Flipped.setIcon(queend);
        else if (rank==13)
            player1Flipped.setIcon(kingd);
        else if (rank==14)
            player1Flipped.setIcon(aced);
      }
   }
   /**
      Sets player 2's card image, based on suit and rank.
   */
   
   public void setPlayer2Flipped()
   {
      int rank = player2.getBottomCard().getRank();
      int suit = player2.getBottomCard().getSuit();
      if (suit==1)
      {
         if (rank==2)
            player2Flipped.setIcon(twos);
         else if (rank==3)
            player2Flipped.setIcon(threes);
        else if (rank==4)
            player2Flipped.setIcon(fours);
        else if (rank==5)
            player2Flipped.setIcon(fives);
        else if (rank==6)
            player2Flipped.setIcon(sixs);
        else if (rank==7)
            player2Flipped.setIcon(sevens);
        else if (rank==8)
            player2Flipped.setIcon(eights);
        else if (rank==9)
            player2Flipped.setIcon(nines);
        else if (rank==10)
            player2Flipped.setIcon(tens);
        else if (rank==11)
            player2Flipped.setIcon(jacks);
        else if (rank==12)
            player2Flipped.setIcon(queens);
        else if (rank==13)
            player2Flipped.setIcon(kings);
        else if (rank==14)
            player2Flipped.setIcon(aces);
      }
      else if (suit==2)
      {
         if (rank==2)
            player2Flipped.setIcon(twoc);
         else if (rank==3)
            player2Flipped.setIcon(threec);
        else if (rank==4)
            player2Flipped.setIcon(fourc);
        else if (rank==5)
            player2Flipped.setIcon(fivec);
        else if (rank==6)
            player2Flipped.setIcon(sixc);
        else if (rank==7)
            player2Flipped.setIcon(sevenc);
        else if (rank==8)
            player2Flipped.setIcon(eightc);
        else if (rank==9)
            player2Flipped.setIcon(ninec);
        else if (rank==10)
            player2Flipped.setIcon(tenc);
       else  if (rank==11)
            player2Flipped.setIcon(jackc);
        else if (rank==12)
            player2Flipped.setIcon(queenc);
        else if (rank==13)
            player2Flipped.setIcon(kingc);
        else if (rank==14)
            player2Flipped.setIcon(acec);
      }
      else if (suit==3)
      {
         if (rank==2)
            player2Flipped.setIcon(twoh);
         else if (rank==3)
            player2Flipped.setIcon(threeh);
        else if (rank==4)
            player2Flipped.setIcon(fourh);
        else if (rank==5)
            player2Flipped.setIcon(fiveh);
        else if (rank==6)
            player2Flipped.setIcon(sixh);
        else if (rank==7)
            player2Flipped.setIcon(sevenh);
        else if (rank==8)
            player2Flipped.setIcon(eighth);
        else if (rank==9)
            player2Flipped.setIcon(nineh);
        else if (rank==10)
            player2Flipped.setIcon(tenh);
        else if (rank==11)
            player2Flipped.setIcon(jackh);
        else if (rank==12)
            player2Flipped.setIcon(queenh);
        else if (rank==13)
            player2Flipped.setIcon(kingh);
        else if (rank==14)
            player2Flipped.setIcon(aceh);
      }
      else if (suit==4)
      {
         if (rank==2)
            player2Flipped.setIcon(twod);
         else if (rank==3)
            player2Flipped.setIcon(threed);
        else if (rank==4)
            player2Flipped.setIcon(fourd);
        else if (rank==5)
            player2Flipped.setIcon(fived);
        else if (rank==6)
            player2Flipped.setIcon(sixd);
        else if (rank==7)
            player2Flipped.setIcon(sevend);
        else if (rank==8)
            player2Flipped.setIcon(eightd);
        else if (rank==9)
            player2Flipped.setIcon(nined);
        else if (rank==10)
            player2Flipped.setIcon(tend);
        else if (rank==11)
            player2Flipped.setIcon(jackd);
        else if (rank==12)
            player2Flipped.setIcon(queend);
        else if (rank==13)
            player2Flipped.setIcon(kingd);
        else if (rank==14)
            player2Flipped.setIcon(aced);
      }
   }
   
   
   
   /**
      The action listener for the button. 
     
   */
   
   public void actionPerformed(ActionEvent e) 
   {
      //sets the card to the right image
      setPlayer1Flipped();
      setPlayer2Flipped();
      //if a war has occurred, sets the textbox to visible
      warText.setVisible(false);
      
      updateGameInfo("Player 1 Card: " + player1.getBottomCard() + "\n" + "Player 2 Card: " + player2.getBottomCard());
      //if player 1's card has a higher rank, they win.
      if(player1.getBottomCard().getRank()>player2.getBottomCard().getRank())
      {
         updateGameInfo("Winner: Player 1");
         player1.getDeck().add(player2.getBottomCard());
         player2.getDeck().remove(0);
         player1.moveCard();
      }
      //if player 2's card has a higher rank, they win.
      else if(player1.getBottomCard().getRank()<player2.getBottomCard().getRank())
      {
         updateGameInfo("Winner: Player 2");
         player2.getDeck().add(player1.getBottomCard());
         player1.getDeck().remove(0);
         player2.moveCard();
      }
      //if player 1's card equals player 2's card, a war occurs.
      else if(player1.getBottomCard().getRank()==player2.getBottomCard().getRank())
      {
         ArrayList<Card>tempCards = new ArrayList<Card>();
         war = true;
         while(war)
         {
         warText.setVisible(true);
         System.out.println("War!");
         if (player1.getDeck().size()<2||player2.getDeck().size()<2)
         {
            if (player1.getDeck().size()<1)
            {
               tempCards.add(player2.getBottomCard());
               player2.getDeck().remove(0);
            }
            else if(player2.getDeck().size()<1)
            {
               tempCards.add(player1.getBottomCard());
               player1.getDeck().remove(0);
            }  
         }
         else
         {
         tempCards.add(player1.getBottomCard());
         tempCards.add(player2.getBottomCard());
         player1.getDeck().remove(0);
         player2.getDeck().remove(0);
         }
         
         //if either player has less than two cards
         if (player1.getDeck().size()<2||player2.getDeck().size()<2)
         {
            //if player 1 has less than one card
            if (player1.getDeck().size()<2)
            {
               //only uses one card from player 1; still gifts two from player two
               if (player1.getBottomCard().getRank()>player2.getTopCard().getRank())
               {
                  updateGameInfo("Player 1 War Card: " + player1.getBottomCard() +"\n" + "Player 2 War Card: " + player2.getTopCard() + "\n" + "Player 1 Wins the War!" + "\n" +"Player 1 Gets an additional " + player2.getBottomCard());
                  player1.getDeck().add(player2.getTopCard());
                  player1.getDeck().add(player2.getBottomCard());
                  //takes the temporary cards and gives them back to player 1.
                  for (int i = 0; i < tempCards.size(); i++)
                  {
                     player1.getDeck().add(tempCards.get(i));
                  }
                  player1.moveCard();
                  //player 2 loses 2 top cards.
                  player2.remove();
                  //the war is over.
                  war = false;
               }
               //since player 1 has one card, we can end the game here if they lose
               else if (player1.getBottomCard().getRank()<player2.getTopCard().getRank())
               {
                  updateGameInfo("Player 1 War Card: " + player1.getBottomCard() + "\n" + "Player 2 War Card: " + player2.getTopCard() + "\n" + "Player 2 Wins the War!" + "Game over! Player 2 Wins!");
                
                  System.exit(0);
               }
            }
            else if (player2.getDeck().size()<2)
            {
               //only uses one card from player 2; still gifts two from player 1
               if (player1.getTopCard().getRank()<player2.getBottomCard().getRank())
               {
                  updateGameInfo("Player 1 War Card: " + player1.getTopCard()+ "\n" + "Player 2 War Card: " + player2.getBottomCard() + "\n" + "Player 2 Wins the War!" + "\n" + "Player 2 Gets an additional " + player1.getBottomCard());
      
                  player2.getDeck().add(player1.getTopCard());
                  player2.getDeck().add(player1.getBottomCard());
                  for (int i = 0; i < tempCards.size(); i++)
                  {
                     player1.getDeck().add(tempCards.get(i));
                  }
                  player2.moveCard();
                  player1.remove();
                  war = false;
               }
               //since player 2 has one card, we can end the game here if they lose
               else if (player1.getBottomCard().getRank()>player2.getTopCard().getRank())
               {
                 updateGameInfo("Player 1 War Card: " + player1.getBottomCard() + "\n" + "Player 2 War Card: " + player2.getTopCard() + "\n"+ "Player 1 Wins the War!" +"Game over! Player 1 Wins!" );
                 
                  System.exit(0);
               }

            }
         }
         else if (player1.getTopCard().getRank()>player2.getTopCard().getRank())
         {
            updateGameInfo("Player 1 War Card: " + player1.getTopCard() + "\n" +"Player 2 War Card: " + player2.getTopCard()+ "/n" + "Player 1 Wins the War!" + "/n" + "Player 1 Gets an additional " + player2.getBottomCard());
   
            player1.getDeck().add(player2.getTopCard());
            player1.getDeck().add(player2.getBottomCard());
            for (int i = 0; i < tempCards.size(); i++)
            {
               player1.getDeck().add(tempCards.get(i));
            }
            
            player1.moveCards();
            player2.remove();
            war = false;
         }
         else if (player1.getTopCard().getRank()<player2.getTopCard().getRank())
         {
            updateGameInfo("Player 1 War Card: " + player1.getTopCard() + "\n" + "Player 2 War Card: " + player2.getTopCard() + "\n" + "Player 2 Wins the War!" + "\n" + "Player 2 Gets an additional " + player1.getBottomCard());
                       
            player2.getDeck().add(player1.getTopCard());
            player2.getDeck().add(player1.getBottomCard());
            for (int i = 0; i < tempCards.size(); i++)
            {
               player2.getDeck().add(tempCards.get(i));
            }
            player2.moveCards();
            player1.remove();
            war = false;
         }
         }
      }
      updateGameInfo("Player 1 Deck size: " + player1.getDeck().size() + " \n" +  player2.getDeck().size());
      //System.out.println("Player 2 Deck size: " + player2.getDeck().size());
            //if either player has no cards, the game is over.
      if (player1.getDeck().size()==0||player2.getDeck().size()==0)
      {  
         if (player1.getDeck().size()==0)
            updateGameInfo("Game over! Player 2 Wins!");
         else
            updateGameInfo("Game over! Player 2 Wins!");
      System.exit(0);
      }
         }
private void updateGameInfo(String text)
{
   gameInfo.setText(text);
} 
   public static void main(String [] args)
   {
      WarBoard board = new WarBoard();
   }

}