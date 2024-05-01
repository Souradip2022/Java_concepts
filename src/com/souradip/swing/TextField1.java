package com.souradip.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField1 {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("Text Field");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800, 500);
    frame.setLayout(new BorderLayout(10, 10));
    frame.setLocationRelativeTo(null);

    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    panel.setBorder(BorderFactory.createEmptyBorder(50, 10, 10, 10));
    panel.setBackground(Color.red);

    JTextField textField = createJTextField();

    JLabel label = new JLabel("Text");
    label.setFont(new Font("Arial", Font.BOLD, 24));

    textField.addActionListener(new  ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        label.setText(textField.getText());
        textField.setText("Enter some more text");
      }
    });

    panel.add(label);
    panel.add(textField);
    frame.add(panel, BorderLayout.CENTER);
    frame.setVisible(true);

  }

  static JTextField createJTextField() {
    JTextField textField = new JTextField(10);
    textField.setFont(new Font("Arial", Font.BOLD, 24));
    textField.setForeground(Color.BLUE);
    textField.setBackground(Color.YELLOW);
    textField.setToolTipText("Enter some text");
    textField.setMargin(new Insets(5, 5, 5, 5));

    return textField;
  }
}
