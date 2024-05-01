package com.souradip.swing;

import javax.swing.*;
import java.awt.*;

public class JLabel1 {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("JLabel Demo");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800, 500);
    frame.setLayout(new BorderLayout(10, 15));

    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    panel.setBackground(Color.GRAY);
    JLabel label = new JLabel("My Cool App");

    label.setForeground(Color.WHITE);
    label.setFont(new Font("Sans-serif", Font.BOLD, 36));

    panel.add(label);
    frame.add(panel, BorderLayout.NORTH);
    frame.setVisible(true);
  }
}
