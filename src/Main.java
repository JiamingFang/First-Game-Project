import javax.swing.*;

/**
 * Created by Administrator on 2017/3/1.
 */
public class Main {

    public static void main(String args[]){

        JFrame frame = new JFrame();
        frame.pack();
        frame.setSize(1400, 980);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Game());
        frame.setVisible(true);
        frame.setTitle("AVOID THE CATS !!!! OR YOU LOSE !!!");
    }
}
