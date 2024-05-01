package com.souradip.swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayout1 {
  public static void main(String[] args) {

    JFrame frame1 = new JFrame();
    frame1.setTitle("Border Layout Demo");
    frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame1.setSize(800, 500);
    /*BorderLayout borderLayout = new BorderLayout();
    borderLayout.setHgap(15);
    borderLayout.setVgap(10);
    frame1.setLayout(borderLayout);*/

    frame1.setLayout(new BorderLayout(15, 10)); //Alternative method

    frame1.add(new JButton("North"), BorderLayout.NORTH);
    frame1.add(new JButton("South"), BorderLayout.SOUTH);
    frame1.add(new JButton("East"), BorderLayout.EAST);
    frame1.add(new JButton("West"), BorderLayout.WEST);
    frame1.add(new JButton("Center"), BorderLayout.CENTER);

    frame1.setVisible(true);


  }
}
