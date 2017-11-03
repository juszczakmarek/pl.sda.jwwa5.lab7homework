package pl.sda.wwa5.homework.importedExamples.examples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CheckboxDemo extends JFrame {

	private JTextArea text = new JTextArea(5, 25);
	private JCheckBox cb1 = new JCheckBox("Zaznacz je�li lubisz piwo."),
					  cb2 = new JCheckBox("Zaznacz je�li lubisz wino.");
	
	public CheckboxDemo() {
		cb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb1.isSelected()) {
					text.append("Zaznaczy�e�, �e lubisz piwo.\n");
				} else {
					text.append("Zaznaczy�e�, �e nie lubisz piwa.\n");
				}		 
			}
		});
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb2.isSelected()) {
					text.append("Zaznaczy�e�, �e lubisz wino.\n");
				} else {
					text.append("Zaznaczy�e�, �e nie lubisz wina.\n");
				}	
			}
		});
		
		setLayout(new FlowLayout());
		add(cb1);
		add(cb2);
		add(new JScrollPane(text));
	}
}
