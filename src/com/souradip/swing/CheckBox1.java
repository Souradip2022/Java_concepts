package com.souradip.swing;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class CheckBox1 {
  private JFrame frame;
  private JPanel panel;
  private JCheckBox checkbox;

  void check(){
    frame = new JFrame();
    frame.setTitle("JCheckBox demo");
    frame.setSize(800,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout(10,10));

    panel = new JPanel();

    checkbox = new JCheckBox();
    checkbox.setText("Check Box");
    System.out.println(checkbox.getText());
//    checkbox.setMargin(new Insets(30,30,30,30));
    checkbox.setBorder(BorderFactory.createEmptyBorder(50, 10, 10, 10));
    checkbox.setBackground(Color.green);
    panel.add(checkbox);
    frame.add(panel);
    frame.setVisible(true);
  }

  public static void main(String[] args) {

    CheckBox1 ob1 = new CheckBox1();
    ob1.check();
  }
}
