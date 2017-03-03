import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Player extends GlobalPosition {

    private String playerimage = "/images/2.png";

    int velocityX = 0;
    int velocityY = 0;

    private LinkedList<Enemy> e = Controller.getEnemyBounds();

    public Player(int x, int y){
        super(x, y);
    }

    public void update(){
        x+=velocityX;
        y+=velocityY;

        //collision with outside
        if(x < 1){
            x = 1;
        }else if(x > 1341){
            x = 1341;
        }else if(y < 1){
            y = 1;
        }else if(y > 895){
            y = 895;
        }

        collision();
    }

    public void collision(){

        for(int i = 0; i < e.size(); i++){

            if(getBounds().intersects(e.get(i).getBounds())){
                System.exit(0);

            }
        }
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_RIGHT){
            velocityX = 5;
        }else if(key == KeyEvent.VK_LEFT){
            velocityX = -5;
        }else if(key == KeyEvent.VK_DOWN){
            velocityY = 5;
        }else if(key == KeyEvent.VK_UP){
            velocityY = -5;
        }
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_RIGHT){
            velocityX = 0;
        }else if(key == KeyEvent.VK_LEFT){
            velocityX = 0;
        }else if(key == KeyEvent.VK_DOWN){
            velocityY = 0;
        }else if(key == KeyEvent.VK_UP){
            velocityY = 0;
        }
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(getPlayerImage(), x, y, null);

    }

    public Image getPlayerImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
        return i.getImage();
    }

    public Rectangle getBounds(){
        return new Rectangle(x,y,50,50);
    }

}
