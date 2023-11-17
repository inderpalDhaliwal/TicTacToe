import java.awt.*;

public class Piece {
    private int xPos;
    private int yPos;
    public Piece(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public void draw(Graphics g){

    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}

