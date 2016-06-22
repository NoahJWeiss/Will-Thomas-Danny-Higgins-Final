/**
 * PeriodTable.java
 * Assignment: Final Project
 * Purpose: This class is the main class for the
 * periodic table. It creates the Scanners for creating
 * elements and for search functionality
 *
 * @version 6/21/16
 * @author Will Thomas, Danny Higgins
 */

import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
public class PeriodicTable {
   public static void main(String[] args)throws FileNotFoundException {
      Scanner elements = new Scanner(new File("elements.txt"));
      Scanner elementsCopy = new Scanner(new File("elements.txt")); // second scanner for the search class
      JFrame guiFrame = new JFrame("The Periodic Table");
      SearchElements search = new SearchElements(elementsCopy);
      TableofElements table = new TableofElements(guiFrame, elements, search);
      
   }
}