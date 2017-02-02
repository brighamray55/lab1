import java.awt.Rectangle;
import javax.swing.JFrame;
import java.awt.Color;

// start of the tetris class

public class BlockMaker {

// main method of the tetris class

  public static void main(String[] args) {

    JFrame frame = new JFrame();

    frame.setSize(1000, 1000);

    frame.setTitle("Tetris");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setBackground(Color.GRAY);

    BlockComponent component = new BlockComponent();
    frame.add(component);

    frame.setVisible(true);

// Create a new Jcomponent object

// Add object to the frame

// Make frame visible

  }
}
