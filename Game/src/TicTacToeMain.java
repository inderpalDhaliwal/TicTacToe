import javax.swing.*;
import java.awt.*;

public class TicTacToeMain {
    public static void main(String[] args){
        JFrame frame = new JFrame("TicTacToe");
        frame.setVisible(true);
        frame.setSize(new Dimension(1000,1000));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(700,150);
        frame.setResizable(false);
        TicTacToePanel ticTacToePanel = new TicTacToePanel();
        frame.setContentPane(ticTacToePanel);
        TicTacToeListener ticTacToeListener = new TicTacToeListener(ticTacToePanel);
    }

}
