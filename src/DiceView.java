import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DiceView extends JFrame {
    JButton roll=new JButton("Roll");
    JLabel label=new JLabel();

    DiceView(){

        JPanel panel=new JPanel();
        roll.setVisible(true);
        roll.setSize(new Dimension(60,30));
        roll.setFocusable(false);
        label.setVisible(true);
        label.setBounds(100,20,100,30);

        this.add(panel);
        panel.add(roll);
        panel.add(label);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,100);
        this.setVisible(true);
        this.setTitle("DICE GAME");
        this.setResizable(false);


    }
    public void randomValue(int random_value){
        label.setText(String.valueOf(random_value));
    }

    public void rolledValue(ActionListener value){
        roll.addActionListener(value);

    }
}
