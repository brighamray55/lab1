import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;

public class BlockComponent extends JComponent {

  @Override
  protected void paintComponent(Graphics g) {

    Graphics2D g2 = (Graphics2D) g;

    Rectangle box = new Rectangle(10,20,20,20);

    Rectangle box2 = new Rectangle(10,40,20,20);

    g2.draw(box2);

  }
}
