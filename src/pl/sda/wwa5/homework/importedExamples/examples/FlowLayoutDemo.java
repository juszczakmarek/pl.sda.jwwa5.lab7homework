package pl.sda.wwa5.homework.importedExamples.examples;

import java.awt.FlowLayout;

import javax.swing.*;

public class FlowLayoutDemo extends JFrame {
	
	public FlowLayoutDemo() {
		setLayout(new FlowLayout());
		for(int i = 0; i < 20; ++i) {
			add(new JButton("Przycisk #" + i));
		}
	}
	
}
