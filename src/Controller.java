import java.awt.*;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Controller {


    static LinkedList<Enemy> e = new LinkedList<Enemy>();

    Enemy TempEnemy;

    public Controller(){
        addEnemy(new Enemy(100,100));
        addEnemy(new Enemy(800,143));
        addEnemy(new Enemy(435,001));
        addEnemy(new Enemy(0,900)); }

    public void draw(Graphics2D g2d) {
        for (int i = 0; i < e.size(); i++) {
            TempEnemy = e.get(i);

            TempEnemy.draw(g2d);
        }

    }

    public void update() {
        for (int i = 0; i < e.size(); i++) {
            TempEnemy = e.get(i);

            TempEnemy.update();
        }
    }
    public void addEnemy(Enemy enemy){
        e.add(enemy);
    }
    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }

    public static LinkedList<Enemy> getEnemyBounds(){
        return e;
    }
}
