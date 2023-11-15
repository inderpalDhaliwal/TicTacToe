import java.awt.event.*;

public class TicTacToeListener implements ActionListener, MouseListener, KeyListener {
    private TicTacToePanel ticTacToePanel;

    public TicTacToeListener(TicTacToePanel ticTacToePanel){
        ticTacToePanel.addMouseListener(this);
        ticTacToePanel.addKeyListener(this);
        this.ticTacToePanel = ticTacToePanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        ticTacToePanel.requestFocusInWindow();
        System.out.println("Mouse if Focused");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
