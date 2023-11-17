import java.awt.event.*;

public class TicTacToeListener implements ActionListener, MouseListener, KeyListener { // class
    private TicTacToePanel ticTacToePanel; // class var
    private Game game;


    public TicTacToeListener(TicTacToePanel ticTacToePanel){ // constructor
        ticTacToePanel.addMouseListener(this);
        ticTacToePanel.addKeyListener(this);
        this.ticTacToePanel = ticTacToePanel;
        this.game = new Game(ticTacToePanel);
    }
    @Override
    public void actionPerformed(ActionEvent e) { //methods

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
        int x = e.getX();
        int y = e.getY();
        if(x<333){
            if(y<333){
                game.select(1);
            } else if(y<666){
                game.select(4);
            } else{
                game.select(7);
            }
        }
        else if(x<666){
            if(y<333){
                game.select(2);
            } else if(y<666){
                game.select(5);
            } else{
                game.select(8);
            }
        }
        else{
            if(y<333){
                game.select(3);
            } else if(y<666){
                game.select(6);
            } else{
                game.select(9);
            }
        }
        ticTacToePanel.repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {
        ticTacToePanel.requestFocusInWindow();
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
