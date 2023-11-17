import java.util.ArrayList;

public class Game {  //class
    private ArrayList<Integer> player1;// class var
    private ArrayList<Integer> player2;
    private ArrayList<Integer> marked;
    private int turn;
    private TicTacToePanel ticTacToePanel;

    public Game(TicTacToePanel ticTacToePanel){ // constr this code runs new game obj is made
        player1 = new ArrayList<>();
        player2 = new ArrayList<>();
        turn = 1;
        marked = new ArrayList<>();
        this.ticTacToePanel = ticTacToePanel;


    }
    public boolean select(int quadrant){   //method placing a choice from the listener
        int xPos = 0;
        int yPos = 0;
        switch(quadrant){
            case 1:
                xPos = 0 + 100;
                yPos = 0 + 100;
                break;
            case 2:
                xPos = 333 + 100;
                yPos = 0 + 100;
                break;
            case 3:
                xPos = 666 + 100;
                yPos = 0 + 100;
                break;
            case 4:
                xPos = 0 + 100;
                yPos = 333 + 100;
                break;
            case 5:
                xPos = 333 + 100;
                yPos = 333 + 100;
                break;
            case 6:
                xPos = 666 + 100;
                yPos = 333 + 100;
                break;
            case 7:
                xPos = 0 + 100;
                yPos = 666 + 100;
                break;
            case 8:
                xPos = 333 + 100;
                yPos = 666 + 100;
                break;
            case 9:
                xPos = 666 + 100;
                yPos = 666 + 100;
                break;
            default:
                System.out.println("shouldnt reach here");
        }
        if(marked.contains(quadrant)){
            System.out.println("f*** off");
            return false;
        }
        if(turn == 1){
            player1.add(quadrant);
            turn = 2;
            System.out.println("player 1 selected: "+ quadrant);
            ticTacToePanel.getPieces().add(new PlayerX(xPos, yPos));

        }else {
            player2.add(quadrant);
            turn = 1;
            System.out.println("player 2 selected: "+ quadrant);
            ticTacToePanel.getPieces().add(new PlayerO(xPos,yPos));
        }
        marked.add(quadrant);
        return true;
    }
}
