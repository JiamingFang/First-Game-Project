import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Game extends JPanel implements ActionListener{

    private String background = "/images/background.jpg";
    Timer gameloop;
    Player p;
    Controller c;

    public Game(){
        setFocusable(true);

        gameloop = new Timer(10, this);
        gameloop.start();

        p = new Player(0, 0);
        c = new Controller();

        addKeyListener(new KeyInput(p));
    }

    public void paint(Graphics g){

        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        p.draw(g2d);

        g2d.drawImage(getBackgroundImage(),0,0,this);

        p.draw(g2d);

        c.draw(g2d);

    }

    public Image getBackgroundImage(){
        ImageIcon i = new ImageIcon(getClass().getResource(background));
        return i.getImage();
    }

    public void actionPerformed(ActionEvent ef){
        repaint();
        p.update();
        c.update();
    }
}
