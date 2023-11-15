import javax.swing.*;
import java.awt.*;

public class TicTacToePanel extends JPanel {
    public TicTacToePanel(){

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(255,0,100));
        g.fillRect(200,50,50,50);

    }
}
