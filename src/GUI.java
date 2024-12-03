import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.color.*;

//Important: Read the Note in the Calculate Class

public class GUI{
    public static int currentBox = 1;

    private static JFrame jFrame;
    public static JLabel inputTextBox1, inputTextBox2, inputTextBox3, equalsSignBox, ansBox;

    //c1 for clicking 1, c2 for clicking 2, ca for clicking addition etc. boxField1 is for the Label inputTextBox1, 2 for 2 etc.
    private static JButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c0,ca,cs,cm,cd,ce,boxField1, boxField2, boxField3;

    public GUI() {
        //Main Frame
        jFrame = new JFrame("Calculator");
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setSize(1920, 1080);

        //Text Boxes
        inputTextBox1 = new JLabel();
        inputTextBox1.setText("");
        inputTextBox1.setVisible(true);
        inputTextBox1.setBounds(450,100,100,100);
        inputTextBox1.setBackground(Color.blue);
        inputTextBox1.setOpaque(true);
        inputTextBox1.setFont(new Font("Arial", Font.PLAIN, 20));
        jFrame.add(inputTextBox1);

        inputTextBox2 = new JLabel();
        inputTextBox2.setText("");
        inputTextBox2.setVisible(true);
        inputTextBox2.setBounds(650,100,100,100);
        inputTextBox2.setBackground(Color.blue);
        inputTextBox2.setOpaque(true);
        inputTextBox2.setFont(new Font("Arial", Font.PLAIN, 20));
        jFrame.add(inputTextBox2);

        inputTextBox3 = new JLabel();
        inputTextBox3.setText("");
        inputTextBox3.setVisible(true);
        inputTextBox3.setBounds(850,100,100,100);
        inputTextBox3.setBackground(Color.blue);
        inputTextBox3.setOpaque(true);
        inputTextBox3.setFont(new Font("Arial", Font.PLAIN, 20));
        jFrame.add(inputTextBox3);

        equalsSignBox = new JLabel();
        equalsSignBox.setText("=");
        equalsSignBox.setVisible(true);
        equalsSignBox.setBounds(1050,100,100,100);
        equalsSignBox.setBackground(Color.blue);
        equalsSignBox.setOpaque(true);
        equalsSignBox.setFont(new Font("Arial", Font.PLAIN, 20));
        jFrame.add(equalsSignBox);

        ansBox = new JLabel();
        ansBox.setText("");
        ansBox.setVisible(true);
        ansBox.setBounds(1250,100,100,100);
        ansBox.setBackground(Color.blue);
        ansBox.setOpaque(true);
        ansBox.setFont(new Font("Arial", Font.PLAIN, 20));
        jFrame.add(ansBox);

        //3 Box Buttons

        boxField1 = new JButton();
        boxField1.setBounds(100,600,100,100);
        boxField1.setVisible(true);
        boxField1.setText("Box 1");
        jFrame.add(boxField1);

        boxField2 = new JButton();
        boxField2.setBounds(200,600,100,100);
        boxField2.setVisible(true);
        boxField2.setText("Box 2");
        jFrame.add(boxField2);

        boxField3 = new JButton();
        boxField3.setBounds(300,600,100,100);
        boxField3.setVisible(true);
        boxField3.setText("Box 3");
        jFrame.add(boxField3);




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

        ce = new JButton("=");
        ce.setBounds(800,500,100,100);
        ce.setVisible(true);
        jFrame.add(ce);

        //Action Listeners, This part is EXTREMELY Long
        boxField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentBox = 1;
                System.out.println("Current Box is 1"); // Debugging
            }
        });

        boxField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentBox = 2;
                System.out.println("Current Box is 2"); // Debugging
            }
        });

        boxField3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                currentBox = 3;
                System.out.println("Current Box is 3");
            }
        });



        c1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 1) {
                    inputTextBox1.setText(inputTextBox1.getText() + "1");
                } else if (currentBox == 3) {
                    inputTextBox3.setText(inputTextBox3.getText()+ "1");
                } else {
                    System.out.println("Error");
                }
            }
        });

        c2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 1) {
                    inputTextBox1.setText(inputTextBox1.getText() + "2");
                } else if (currentBox == 3) {
                    inputTextBox3.setText(inputTextBox3.getText()+ "2");
                } else {
                    System.out.println("Error");
                }
            }
        });

        c3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 1) {
                    inputTextBox1.setText(inputTextBox1.getText() + "3");
                } else if (currentBox == 3) {
                    inputTextBox3.setText(inputTextBox3.getText()+ "3");
                } else {
                    System.out.println("Error");
                }
            }
        });

        c4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 1) {
                    inputTextBox1.setText(inputTextBox1.getText() + "4");
                } else if (currentBox == 3) {
                    inputTextBox3.setText(inputTextBox3.getText()+ "4");
                } else {
                    System.out.println("Error");
                }
            }
        });

        c5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 1) {
                    inputTextBox1.setText(inputTextBox1.getText() + "5");
                } else if (currentBox == 3) {
                    inputTextBox3.setText(inputTextBox3.getText()+ "5");
                } else {
                    System.out.println("Error");
                }
            }
        });

        c6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 1) {
                    inputTextBox1.setText(inputTextBox1.getText() + "6");
                } else if (currentBox == 3) {
                    inputTextBox3.setText(inputTextBox3.getText()+ "6");
                } else {
                    System.out.println("Error");
                }
            }
        });

        c7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 1) {
                    inputTextBox1.setText(inputTextBox1.getText() + "7");
                } else if (currentBox == 3) {
                    inputTextBox3.setText(inputTextBox3.getText()+ "7");
                } else {
                    System.out.println("Error");
                }
            }
        });

        c8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 1) {
                    inputTextBox1.setText(inputTextBox1.getText() + "8");
                } else if (currentBox == 3) {
                    inputTextBox3.setText(inputTextBox3.getText()+ "8");
                } else {
                    System.out.println("Error");
                }
            }
        });

        c9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 1) {
                    inputTextBox1.setText(inputTextBox1.getText() + "9");
                } else if (currentBox == 3) {
                    inputTextBox3.setText(inputTextBox3.getText()+ "9");
                } else {
                    System.out.println("Error");
                }
            }
        });

        c0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 1) {
                    inputTextBox1.setText(inputTextBox1.getText() + "0");
                } else if (currentBox == 3) {
                    inputTextBox3.setText(inputTextBox3.getText()+ "0");
                } else {
                    System.out.println("Error");
                }
            }
        });

        ca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 2) {
                    inputTextBox2.setText("+");
                } else {
                    System.out.println("Error");
                }
            }
        });

        cs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 2) {
                    inputTextBox2.setText("-");
                } else {
                    System.out.println("Error");
                }
            }
        });

        cm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 2) {
                    inputTextBox2.setText("*");
                } else {
                    System.out.println("Error");
                }
            }
        });

        cd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(currentBox == 2) {
                    inputTextBox2.setText("/");
                } else {
                    System.out.println("Error");
                }
            }
        });

        ce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(inputTextBox2.getText().equals("+")) {
                    Calculate.addition(
                            Integer.parseInt(inputTextBox1.getText()),
                            Integer.parseInt(inputTextBox1.getText()),
                            inputTextBox2.getText()
                    );


                }
            }
        });


    }


}