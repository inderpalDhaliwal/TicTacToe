import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TicTacToePanel extends JPanel {
    private ArrayList<Piece> pieces;
    public TicTacToePanel(){ // constructor "construc has to be used in each obj" a method can be used
        pieces = new ArrayList<>();
    }
    public void paintComponent(Graphics g){ //method
        super.paintComponent(g);
        g.setColor(new Color(0,0,0));
        g.fillRect(333,0,5,1000);// left vertical
        g.fillRect(666,0,5,1000);// right vertical
        g.fillRect(0,333,1000,5);//top horizontal
        g.fillRect(0,666,1000,5);//Bot horizontal
        for(int i = 0;i<pieces.size();i++){
            pieces.get(i).draw(g);
        }


    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }
}
