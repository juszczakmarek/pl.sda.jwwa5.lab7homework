package pl.sda.wwa5.homework.importedExamples.examples;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MiniEditor extends JFrame {

	private JButton b = new JButton("Dodaj tekst");
	private JTextPane tp = new JTextPane();
	
	public MiniEditor() {
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tp.setText("Dodaj� tekst poprzez klikni�cie przycisku\n");
			}
		});
		add(new JScrollPane(tp));
		add(BorderLayout.SOUTH, b);
	}
	
}
