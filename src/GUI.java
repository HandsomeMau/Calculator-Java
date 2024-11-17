import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GUI{
    private static JFrame jFrame;
    private static JLabel inputTextBox;
    private static JButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c0,ca,cs,cm,cd;

    public GUI() {
        //Main Frame
        jFrame = new JFrame("Calculator");
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setSize(1280, 720);

        //Text Boxes
        inputTextBox = new JLabel();
        inputTextBox.setText("");
        inputTextBox.setVisible(true);
        inputTextBox.setBounds(500,0,300,300);
        jFrame.add(inputTextBox);


        //Number Buttons
        c1 = new JButton("1");
        c1.setBounds(100,100,100,100);
        c1.setVisible(true);
        jFrame.add(c1);

        c2 = new JButton("2");
        c2.setBounds(200,100,100,100);
        c2.setVisible(true);
        jFrame.add(c2);

        c3 = new JButton("3");
        c3.setBounds(300,100,100,100);
        c3.setVisible(true);
        jFrame.add(c3);

        c4 = new JButton("4");
        c4.setBounds(100,200,100,100);
        c4.setVisible(true);
        jFrame.add(c4);

        c5 = new JButton("5");
        c5.setBounds(200,200,100,100);
        c5.setVisible(true);
        jFrame.add(c5);

        c6 = new JButton("6");
        c6.setBounds(300,200,100,100);
        c6.setVisible(true);
        jFrame.add(c6);

        c7 = new JButton("7");
        c7.setBounds(100,300,100,100);
        c7.setVisible(true);
        jFrame.add(c7);

        c8 = new JButton("8");
        c8.setBounds(200,300,100,100);
        c8.setVisible(true);
        jFrame.add(c8);

        c9 = new JButton("9");
        c9.setBounds(300,300,100,100);
        c9.setVisible(true);
        jFrame.add(c9);

        c0 = new JButton("0");
        c0.setBounds(200,400,100,100);
        c0.setVisible(true);
        jFrame.add(c0);

        //Operation Buttons
        ca = new JButton("+");
        ca.setBounds(400,500,100,100);
        ca.setVisible(true);
        jFrame.add(ca);

        cs = new JButton("-");
        cs.setBounds(500,500,100,100);
        cs.setVisible(true);
        jFrame.add(cs);

        cm = new JButton("x");
        cm.setBounds(600,500,100,100);
        cm.setVisible(true);
        jFrame.add(cm);

        cd = new JButton("/");
        cd.setBounds(700,500,100,100);
        cd.setVisible(true);
        jFrame.add(cd);

        //Action Listeners
        c1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "1");
            }
        });

        c2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "2");
            }
        });

        c3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "3");
            }
        });

        c4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "4");
            }
        });

        c5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "5");
            }
        });

        c6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "6");
            }
        });

        c7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "7");
            }
        });

        c8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "8");
            }
        });

        c9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "9");
            }
        });

        c0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "0");
            }
        });

        ca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "+");
            }
        });

        cs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "-");
            }
        });

        cm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "*");
            }
        });

        cd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputTextBox.setText(inputTextBox.getText() + "/");
            }
        });


    }


}