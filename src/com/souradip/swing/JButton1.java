package com.souradip.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JButton1 {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("JButton Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 500);

		JPanel panel = new JPanel();
		JButton button = new JButton("JButton Demo");
		button.setFocusable(false);
		button.setToolTipText("Some awesome text for the print button");
		button.setFont(new Font("Arial", Font.PLAIN, 24));
		button.setMargin(new Insets(10, 10, 10, 10));
		button.setBackground(Color.red);

		button.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Print Button has been clicked");
			}
		});

		panel.add(button);
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
