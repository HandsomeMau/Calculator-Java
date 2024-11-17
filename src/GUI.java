import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GUI{
    private static JFrame jFrame;
    private static JLabel inputTextBox;
    public static ArrayList jButtons = new ArrayList();
    public GUI() {
        //Main Frame
        jFrame = new JFrame("Calculator");
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setSize(1280, 720);

        //Text Boxes
        inputTextBox = new JLabel();
        inputTextBox.setText("Test");
        inputTextBox.setVisible(true);
        inputTextBox.setBounds(500,0,300,300);
        jFrame.add(inputTextBox);


        //Number Buttons
        createJButton(100,100,100,100,"1",1);
        createJButton(200,100,100,100,"2",2);
        createJButton(300,100,100,100,"3",3);
        createJButton(100,200,100,100,"4",4);
        createJButton(200,200,100,100,"5",5);
        createJButton(300,200,100,100,"6",6);
        createJButton(100,300,100,100,"7",7);
        createJButton(200,300,100,100,"8",8);
        createJButton(300,300,100,100,"9",9);
        createJButton(200,400,100,100,"0",0);

    }

    public static void createJButton(int x, int y, int width, int height, String buttonText, int tag){
        JButton jButton = new JButton(buttonText);
        jFrame.add(jButton);
        jButton.setVisible(true);
        jButton.setBounds(x,y,width,height);

        jButtons.add(jButton);
        System.out.println(jButtons);


    }


}