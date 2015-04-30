import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class myClass implements ActionListener
{

   TextField text = new TextField(20);
   Button b;
   public myClass()
   {
      b = new Button("Click me");
      b.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e) 
   { 
    
   }
}