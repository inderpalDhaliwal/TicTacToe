import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game {  //class
    private ArrayList<Integer> player1;// class var
    private ArrayList<Integer> player2;
    private ArrayList<Integer> marked;
    private int turn;
    private TicTacToePanel ticTacToePanel;
    private List<List> /*type */ winConditions; //name of var
    private boolean gameOver;

    public Game(TicTacToePanel ticTacToePanel){ // constr this code runs new game obj is made
        player1 = new ArrayList<>();
        player2 = new ArrayList<>();
        turn = 1;
        marked = new ArrayList<>();
        this.ticTacToePanel = ticTacToePanel;
        winConditions = new ArrayList<>();
        List<Integer> topRow = Arrays.asList(1,2,3);
        List<Integer> midRow = Arrays.asList(4,5,6);
        List<Integer> botRow = Arrays.asList(7,8,9);
        List<Integer> leftTopDia = Arrays.asList(1,5,9);
        List<Integer> rightBotDia = Arrays.asList(7,5,3);
        List<Integer> leftCol = Arrays.asList(1,4,7);
        List<Integer> midCol = Arrays.asList(2,5,8);
        List<Integer> rightCol = Arrays.asList(3,6,9);
        winConditions.add(topRow);
        winConditions.add(midRow);
        winConditions.add(botRow);
        winConditions.add(leftTopDia);
        winConditions.add(rightBotDia);
        winConditions.add(leftCol);
        winConditions.add(midCol);
        winConditions.add(rightCol);
        this.gameOver = false;



    }
    public boolean select(int quadrant) {   //method placing a choice from the listener
        if (!gameOver) {

            int xPos = 0;
            int yPos = 0;
            switch (quadrant) {
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
            if (marked.contains(quadrant)) {
                System.out.println("Already Taken Sorry");
                return false;
            }
            if (turn == 1) {
                player1.add(quadrant);
                turn = 2;
                System.out.println("player 1 selected: " + quadrant);
                ticTacToePanel.getPieces().add(new PlayerX(xPos, yPos));

            } else {
                player2.add(quadrant);
                turn = 1;
                System.out.println("player 2 selected: " + quadrant);
                ticTacToePanel.getPieces().add(new PlayerO(xPos, yPos));
            }
            marked.add(quadrant);
            for (List<Integer> l : winConditions) {
                if (player1.containsAll(l)) {
                    gameOver = true;

                    System.out.println("Player 1 Won!!!!!");
                } else if (player2.containsAll(l)) {
                    gameOver = true;
                    System.out.println("Player 2 Won!!!!!");

                }

            }
            if (marked.size() >= 9 && !gameOver) {

                System.out.println("U guys suck");
            }

        }
            return true;
    }
}
