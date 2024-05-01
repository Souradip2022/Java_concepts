package com.souradip.swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayout1 {
  public static void main(String[] args) {

    JFrame frame1 = new JFrame();
    frame1.setTitle("Flow Layout");
    frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame1.setSize(800, 500);
    frame1.setLayout(new BorderLayout(10, 15));

    JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
    panel.setBackground(Color.BLUE);


    for (int i = 0; i < 5; i++) {
      JButton button = new JButton("Button" + i);
      panel.add(button);
    }

    frame1.add(panel, BorderLayout.WEST);
    frame1.setVisible(true);
  }
}
