import java.awt.*;
import java.util.*;
import java.math.*;
import java.io.*;
import java.awt.geom.AffineTransform;

class Main {
  public static void main(String[] args) {
    DrawingPanel myDrawingPanel = new DrawingPanel(1200, 600);
    myDrawingPanel.setBackground(Color.GRAY);
    Graphics g = (Graphics2D) myDrawingPanel.getGraphics();

    drawCard(20, 40, g);
    drawCard(250, 40, g);
    drawCard(470, 40, g);
    drawCard(690, 40, g);

  }

  public static void drawCard(int x, int y, Graphics g) {
    Random rand = new Random();
    g.setColor(Color.WHITE);
    g.fillRect(x, y, 200, 300);
    String value = "";
    String suit = "";

    value = getString(rand, value);
    suit = getSuit(rand, suit);
    // vv initializing which color the card is
    // based if the suit is heard/diamonds (red) or not
    if (suit == "\u2665" || suit == "\u2666") {
      g.setColor(Color.RED);
    } else {
      g.setColor(Color.BLACK);
    }

    
    Font myFont = new Font("sherif", Font.BOLD, 40);

    if (value == "A") {
      g.setFont(new Font("sherif", Font.BOLD, 75));
      g.drawString(suit, x + 70, y + 170);
    }
    // (40,80)
    g.setFont(myFont);
    if (value == "10") {
      g.drawString(value, x + 5, y + 40);
    } else {
      g.drawString(value, x + 20, y + 40);
    }

    g.drawString(suit, x + 15, y + 80); // (35,120)
    g.setFont(new Font("sherif", Font.BOLD, -40));
    if (value == "10") {
      g.drawString(value, x + 195, y + 260);
      g.drawString(suit, x + 187, y + 216);
    } else {
      g.drawString(value, x + 187, y + 260);
      g.drawString(suit, x + 192, y + 216);
    }
    if (value != "Q" && value != "K" && value != "J" && value != "A") {
      int numSuits = Integer.parseInt(value);
      System.out.println(numSuits);
      // for(int i = 0; i > )

    }

  }

  public static String getSuit(Random rand, String suit) {
    int randomNum = rand.nextInt(4);
    switch (randomNum) {
      case 0:
        suit = "\u2660";
        break;
      case 1:
        suit = "\u2665";
        break;
      case 2:
        suit = "\u2663";
        break;
      case 3:
        suit = "\u2666";
        break;
    }
    return suit;
  }

  public static String getString(Random rand, String value) {
    int cardVal = 13;
    int gen = rand.nextInt(cardVal) + 1;
    switch (gen) {
      case 1:
        value = "A";
        break;
      case 2:
        value = "2";
        break;
      case 3:
        value = "3";
        break;
      case 4:
        value = "4";
        break;
      case 5:
        value = "5";
        break;
      case 6:
        value = "6";
        break;
      case 7:
        value = "7";
        break;
      case 8:
        value = "8";
        break;
      case 9:
        value = "9";
        break;
      case 10:
        value = "10";
        break;
      case 11:
        value = "J";
        break;
      case 12:
        value = "Q";
        break;
      case 13:
        value = "K";
    }
    return value;
  }

}