import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Administrator on 2017/3/1.
 */
public class KeyInput extends KeyAdapter{
    Player p;

    public KeyInput(Player p){
        this.p = p;

    }

    public void keyPressed(KeyEvent e){
        p.keyPressed(e);
    }

    public void keyReleased(KeyEvent e){
        p.keyReleased(e);
    }
}
