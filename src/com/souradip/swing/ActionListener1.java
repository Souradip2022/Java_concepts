package com.souradip.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListener1 implements ActionListener {


  private JFrame frame;
  private JPanel panel;
  private JLabel label;
  private JTextField textField;
  private JButton button;

  private void initialize() {
    frame = new JFrame();
    frame.setTitle("ActionListener Demo");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800, 500);
    frame.setLayout(new BorderLayout(10, 10));

    panel = new JPanel();
    label = new JLabel("Enter your name");
    textField = new JTextField(20);
    textField.setText("How are you?");
    button = new JButton("Save");
    button.addActionListener((ActionListener) this);

//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button clicked");
//			}
//		});

    panel.add(label);
    panel.add(textField);
    panel.add(button);
    frame.add(panel, BorderLayout.CENTER);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    ActionListener1 a1 = new ActionListener1();
    a1.initialize();
  }


  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println(textField.getText());
  }
}
