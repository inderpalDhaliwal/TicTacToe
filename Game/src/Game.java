import java.util.ArrayList;

public class Game {
    private ArrayList<Integer> player1;
    private ArrayList<Integer> player2;
    private ArrayList<Integer> marked;
    private int turn;

    public Game(){
        player1 = new ArrayList<>();
        player2 = new ArrayList<>();
        turn = 1;
        marked = new ArrayList<>();
    }
    public boolean select(int quadrant){
        if(marked.contains(quadrant)){
            System.out.println("f*** off");
            return false;
        }
        if(turn == 1){
            player1.add(quadrant);
            turn = 2;
            System.out.println("player 1 selected: "+ quadrant);
        }else {
            player2.add(quadrant);
            turn = 1;
            System.out.println("player 2 selected: "+ quadrant);
        }
        marked.add(quadrant);
        return true;
    }
}
