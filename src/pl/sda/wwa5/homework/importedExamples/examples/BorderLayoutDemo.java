package pl.sda.wwa5.homework.importedExamples.examples;

import java.awt.BorderLayout;

import javax.swing.*;

public class BorderLayoutDemo extends JFrame {
	
	public BorderLayoutDemo() {
		add(BorderLayout.NORTH, new JButton("North"));
		add(BorderLayout.SOUTH, new JButton("South"));
		add(BorderLayout.EAST, new JButton("East"));
		add(BorderLayout.WEST, new JButton("West"));
		add(BorderLayout.CENTER, new JButton("Center"));
	}

}
