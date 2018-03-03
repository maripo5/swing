package frames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        MenuBar menuBar = new MyMenuBar();

        this.setMenuBar(menuBar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setResizable(true);
        setVisible(true);

    }
}

