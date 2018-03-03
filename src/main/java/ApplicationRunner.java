import frames.MyFrame;

import java.awt.*;


public class ApplicationRunner {


        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MyFrame();

                }
            });
        }

}
