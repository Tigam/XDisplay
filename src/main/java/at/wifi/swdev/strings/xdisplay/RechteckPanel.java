
package at.wifi.swdev.strings.xdisplay;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.time.Instant;
import javax.swing.JPanel;

/**
 *
 * @author thk
 */
public class RechteckPanel extends JPanel {

  private int breite;
  private int hoehe;
  
  
  @Override
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2 = (Graphics2D)g;
    int gesamtBreite = this.getWidth();
    int gesamtHoehe = this.getHeight();
    
    Instant now = Instant.now();
    System.out.println(now.toString() + " Zeichne.... (0,0 / " + gesamtBreite + "," + gesamtHoehe +")");
    
    g2.setStroke(new BasicStroke(3));
    g2.setColor(Color.GREEN);
    g2.drawRect(10, 10, breite, hoehe);
  }

  public int getBreite() {
    return breite;
  }

  public void setBreite(int breite) {
    this.breite = breite;
  }

  public int getHoehe() {
    return hoehe;
  }

  public void setHoehe(int hoehe) {
    this.hoehe = hoehe;
  }
  
  
  
}
