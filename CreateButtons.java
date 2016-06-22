/**
 * CreateButtons.java
 * Assignment: Final Project
 * Purpose: This class creates the visuals for every 
 * single element. It also creates the key.
 *
 * @version 6/21/16
 * @author Will Thomas, Danny Higgins
 */
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.geom.*;

public class CreateButtons extends JPanel{
   private int xCoord;
   private int yCoord;
   private String number;
   private Scanner elements;
   private Scanner lineBreak;
   private String weight;
   private String name;
   private String symbol;
   private Color colorSet;
   private int sum2;
   private String group;
   private ArrayList<Shape> shapes;
   
   public CreateButtons( Scanner elements ){
      this.elements = elements;
   }
   
   public void coord(){
        this.lineBreak = new Scanner(elements.nextLine()); //breaks the element scanner into lines of info. One line per element
        xCoord = lineBreak.nextInt()*60;
        yCoord = lineBreak.nextInt()*60;
        number = ""+lineBreak.nextInt();  
        weight = ""+lineBreak.nextDouble(); 
        name = lineBreak.next();  
        symbol  = lineBreak.next();
        this.group = lineBreak.next();
  }
  
   public void color(Graphics grphcs, String group){ // goes through info taken as a parameter and sets the color for each element.
   
      if(group.equals("Nonmetal") || sum2 == 1){
         grphcs.setColor(new Color(140,165,234));
      } else if(group.equals("Noble") || sum2 == 2){
         grphcs.setColor(new Color(220,132,230));
      }  else if(group.equals("Halogen") || sum2 == 3){
         grphcs.setColor(new Color(180,132,255));
      }  else if(group.equals("Semi") || sum2 == 4){
         grphcs.setColor(new Color(45,206,255));
      }  else if(group.equals("Basic") || sum2 == 5){
         grphcs.setColor(new Color(60,255,70));
      }  else if(group.equals("Transition") || sum2 == 6){
         grphcs.setColor(new Color(250,255,75));
      }  else if(group.equals("Alkaline") || sum2 == 7){
         grphcs.setColor(new Color(255,160,0));
      }  else if(group.equals("Alkali") || sum2 == 8){
         grphcs.setColor(new Color(255,75,0));
      }  else if(group.equals("Non" )){
         grphcs.setColor(new Color(225,225,225));
      }  else if(group.equals("Lanthanide") || sum2 == 9){
         grphcs.setColor(new Color(220,163,125));
      }  else if(group.equals("Actinide") || sum2 == 10){
         grphcs.setColor(new Color(195,163,145));
      }  
      group = "";
   }
      //method that adds all of the graphical elements 
   public void paintComponent(Graphics grphcs){  
      Graphics2D g2d = (Graphics2D) grphcs;
      super.paintComponent(grphcs);
      shapes = new ArrayList<>();
      int sum = 0;
      g2d.setColor(Color.BLACK);
     while(elements.hasNextLine()){ 
        coord();
        this.shapes.add(new Rectangle2D.Double(this.xCoord,this.yCoord,60,60));//creates the outline of the table
        color(grphcs, group);
        g2d.fill(this.shapes.get(sum));//adds color to the elements
        grphcs.setColor(Color.BLACK);
        g2d.draw(this.shapes.get(sum));
        //adds alltext information for each element
        g2d.setFont(new Font("Arial", Font.PLAIN, 10)); 
        g2d.drawString(number,xCoord+3,yCoord+10);
        g2d.setFont(new Font("Arial", Font.PLAIN, 9));
        g2d.drawString(weight,xCoord+3,yCoord+57);
        g2d.setFont(new Font("Arial", Font.PLAIN, 9));
        g2d.drawString(name,xCoord+3,yCoord+45);
        g2d.setFont(new Font("Arial", Font.PLAIN, 25));
        g2d.drawString(symbol,xCoord+3,yCoord+35);
        sum++;
     }
     for (Shape s : shapes) {
        g2d.draw(s);
     }
     sum2 = 1;
     group = "";
     for(int i = 0; i < 5; i++){ //creates the boxes for the key
        for(int j = 0; j < 2; j++){
            color(g2d , group);
            g2d.fillRect(210+110*i,130+60*j,35,35);
            g2d.setColor(Color.BLACK);
            g2d.drawRect(210+110*i,130+60*j,35,35);
            sum2++;
         }
      }
      g2d.setColor(Color.BLACK); //extra String stuff
      g2d.drawString("*",205,405);
      g2d.drawString("**",200,465);
      g2d.drawString("*",145,585);
      g2d.drawString("**",140,645);
      g2d.setFont(new Font("Sarif", Font.PLAIN, 35));
      g2d.drawString("KEY:",440,110);
      g2d.setFont(new Font("Sarif", Font.PLAIN, 12));
      g2d.drawString("Nonmetal",250,150);
      g2d.drawString("Noble",250,210);
      g2d.drawString("Halogen",360,150);
      g2d.drawString("Semi Metal",360,210);
      g2d.drawString("Basic Metal",470,150);
      g2d.drawString("Transition",470,203);
      g2d.drawString("Metal",470,217);
      g2d.drawString("Alkaline",580,150);
      g2d.drawString("Alkali",580,210);
      g2d.drawString("Lanthanide",690,150);
      g2d.drawString("Actinide",690,210);
   }                                                                  
}

