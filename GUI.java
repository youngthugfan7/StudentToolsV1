import java.swing.*;

public class GUI extends Main implements ActionListener{
    JPanel keypad;
    JPanel button1;
    JPanel button2;
    JPanel button3;
    JPanel button4;
    JPanel button5;
    JPanel button6;
    JPanel button7;
    JPanel button8;
    JPanel button9;
    GUI(){
        keypad = new JPanel();
        button1 = new JPanel();
        button2 = new JPanel();
        button3 = new JPanel();
        button4 = new JPanel();
        button5 = new JPanel();
        button6 = new JPanel();
        button8 = new JPanel();
        button9 = new JPanel();
        keypad.setLayout(new GridLayout(3,3,5));


        JFrame frame = new JFrame;
        frame.setSize(400,600);
        frame.setVisible(true);
        frame.setResizeable(false);
    }
}