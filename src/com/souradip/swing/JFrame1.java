package com.souradip.swing;

import javax.swing.*;
import java.awt.*;

public class JFrame1 {
  public static void main(String[] args) {
    JFrame frame1 = new JFrame();
    frame1.setTitle("Java Swing");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setLocationRelativeTo(null);
    frame1.setSize(900, 600);
    frame1.setLayout(new BorderLayout(10, 5)); // Corrected BorderLayout
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
    panel.setBackground(Color.red);
    /*panel.setPreferredSize(new Dimension(500, 100));*/
    frame1.add(panel);

    Button button1 = new Button("Button1");
    button1.setBackground(Color.white);
    panel.add(button1);

    Button button2 = new Button("Button2");
    button2.setBackground(Color.white);
    panel.add(button2);

    Button button3 = new Button("Button3");
    button3.setBackground(Color.white);
    panel.add(button3);

//    panel.add(new Button("Button4"));
    frame1.add(panel, BorderLayout.WEST); // Corrected BorderLayout.WEST
    frame1.setVisible(true);
  }
}
