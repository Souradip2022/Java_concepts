package com.souradip.swing;

import javax.swing.*;
import java.awt.*;

public class GridLayout1 {
  public static void main(String[] args) {
    JFrame frame1 = new JFrame();
    frame1.setTitle("Grid Layout");
    frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame1.setSize(800, 500);
    frame1.setLayout(new BorderLayout(15, 10));

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(5, 5, 10, 10));
    for (int i = 0; i < 30; i++) {
      JButton button = new JButton("Button" + i);
      panel.add(button);
    }

    frame1.add(panel);
//    frame1.add(panel, BorderLayout.NORTH);
    frame1.setVisible(true);
  }
}
