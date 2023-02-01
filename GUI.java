import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.Color;

public class GUI extends Main implements ActionListener{
    JPanel keypad;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;


    GUI(){ // keyboard pannel 0-9 keys -> zero key will be  on a diffrent file 
        keypad = new JPanel();
        button0 = new JButton("1");
        button1 = new JButton("2");
        button2 = new JButton("3");
        button3 = new JButton("4");
        button4 = new JButton("5");
        button5 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        keypad.setBounds(50, 300, 225, 200);
        keypad.setBackground(Color.RED);
        keypad.setLayout(new GridLayout(3,3,0,0));


        JFrame frame = new JFrame();
        frame.setSize(400,600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);

        frame.add(keypad);
        
        keypad.add(button0);
        keypad.add(button1);
        keypad.add(button2);
        keypad.add(button3);
        keypad.add(button4);
        keypad.add(button5);
        keypad.add(button6);
        keypad.add(button7);
        keypad.add(button8);
        keypad.add(button9);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}