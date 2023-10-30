import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class RomanNumeralGUI extends JFrame {

    public RomanNumeralGUI(String title, int height, int width) {
        setTitle(title);
        setSize(height, width);
        setLayout(new GridLayout(1,3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

