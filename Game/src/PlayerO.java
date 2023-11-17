import java.awt.*;

public class PlayerO extends Piece{

    public PlayerO(int xPos, int yPos){
       super(xPos, yPos);
    }
    @Override
    public void draw(Graphics g){
        g.setColor(new Color(0,0,255));
        g.drawOval(super.getxPos(),super.getyPos(),150,150);

    }
}
