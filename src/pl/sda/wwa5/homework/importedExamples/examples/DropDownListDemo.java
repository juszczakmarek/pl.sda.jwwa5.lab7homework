package pl.sda.wwa5.homework.importedExamples.examples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DropDownListDemo extends JFrame {

	private String[] humor = {"Weso�y", "Smutny", "Z�y", "W�ciek�y", "Zm�czony"};
	private JTextField text = new JTextField(15);
	private JComboBox list = new JComboBox();
	
	public DropDownListDemo() {
		for(int i = 0; i < humor.length; ++i) {
			list.addItem(humor[i]);
		}
		text.setEditable(false);
		list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("Pozycja z listy #" + list.getSelectedIndex() + " " +
						     ((JComboBox)e.getSource()).getSelectedItem());
			}
		});
		
		setLayout(new FlowLayout());
		add(text);
		add(list);
	}
	
}
