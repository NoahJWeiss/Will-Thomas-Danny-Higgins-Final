/**
 * SearchElements.java
 * Assignment: Final Project
 * Purpose: The search functionality for the project.
 * in this state, it doesn't work as we have not added
 * the ability to get the string from the textField.
 *
 * @version 6/21/16
 * @author Will Thomas, Danny Higgins
 */
import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchElements extends JPanel implements ActionListener {
private JTextField textField;
private Scanner elements;
private String input;
private Scanner lineBreak;
private int garbage;
private double weight;
private String elementName;
private String elementSymbol;

   public SearchElements(Scanner elements){
      this.elements = elements;
   }
   
   public void createText(CreateButtons panel){ //creates the text field at the top of the table
      textField = new JTextField(20);
      panel.add(textField);
   }
   
  @Override
   public void actionPerformed(ActionEvent ae) {
      input = textField.getText();
   }
   
   public void searchScanner(){ //displays the symbol and the element name of the users input
      this.lineBreak = new Scanner(elements.nextLine());
      for (int i = 0; i<=2; i++){
         garbage = lineBreak.nextInt();
      }
      weight = lineBreak.nextDouble();
      elementName = lineBreak.next();
      elementSymbol = lineBreak.next();
      if(input.equalsIgnoreCase(elementName) || input.equalsIgnoreCase(elementSymbol)){
         System.out.print(elementName+" "+elementSymbol);
      }
   }
}