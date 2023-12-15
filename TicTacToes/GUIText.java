import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUIText implements ActionListener {
    private JPanel test;
    public static JFrame jFrame;
    private Player playerX;
    private Player player0;
    private int currentMove;
    private JLabel moveInfo;
    private final JButton[] buttons = new JButton[9];
    public static void main(String[] args) {
        jFrame = new JFrame("Hello World");
    }
    private void startGame(){
        playerX = new Player(Sides.X);
        player0 = new Player(Sides.O);
        currentMove = 0;
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("" + (i + 1));
            buttons[i].addAncestorListener(this);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}