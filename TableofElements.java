/**
 * TableofElements.java
 * Assignment: Final Project
 * Purpose: This project creates the window for the visuals
 * and sets the window and the panel to visable.
 *
 * @version 6/21/16
 * @author Will Thomas, Danny Higgins
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class TableofElements {
   private static final int Width = 1200;
   private static final int Height = 700;
      
   public TableofElements(JFrame guiFrame, Scanner elements, SearchElements search){
   guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   guiFrame.setSize(Width,Height);
   guiFrame.setVisible(true);
   guiFrame.setLocationRelativeTo(null);
   CreateButtons panel = new CreateButtons(elements);
   panel.setBackground(Color.WHITE);
   search.createText(panel);
   guiFrame.add(panel);
   guiFrame.setVisible(true);
   }
}



