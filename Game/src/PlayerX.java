import java.awt.*;

public class PlayerX extends Piece{
    public PlayerX(int xPos, int yPos){

        super(xPos,yPos);
    }
    @Override
    public void draw(Graphics g){
        g.setColor(new Color(255,0,0));
        g.drawRect(super.getxPos(),super.getyPos(),150,150);
    }
}
