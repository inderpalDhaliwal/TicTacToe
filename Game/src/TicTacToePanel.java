import javax.swing.*;
import java.awt.*;

public class TicTacToePanel extends JPanel {
    public TicTacToePanel(){

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(0,0,0));
        g.fillRect(333,0,5,1000);//Top left vertical
        g.fillRect(666,0,5,1000);//Top right vertical
        g.fillRect(0,333,1000,5);//Bot left horizontal
        g.fillRect(0,666,1000,5);//Bot right horizontal


    }
}
