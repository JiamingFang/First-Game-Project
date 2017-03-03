import java.awt.*;
import javax.swing.*;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Enemy extends GlobalPosition{

    private String image = "/images/3.jpg";

    int speedx = 5;
    int speedy = 5;

    public Enemy(int x, int y){
        super(x, y);
    }

    public void update(){
        x+=speedx;
        y+=speedy;
        if(x > 1341){
            speedx = -5;
        }
        if(x < 0){
            speedx = 5;
        }
        if(y < 0){
            speedy = 5;
        }
        if(y > 895){
            speedy = -5;
        }
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(getEnemyImage(),x,y,null);

    }

    public Image getEnemyImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(image));
        return i.getImage();
    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,50,50);
    }
}
