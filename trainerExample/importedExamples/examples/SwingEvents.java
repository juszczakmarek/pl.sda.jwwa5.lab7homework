package pl.sda.wwa5.homework.importedExamples.examples;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;

import javax.swing.*;

public class SwingEvents extends JFrame {
	
	private MyTextArea textArea = new MyTextArea(100, 20);
	
	class MyTextArea extends JTextArea {
		FocusListener fl = new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Focus gained!\n");
			}
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Focus lost!\n");
			}
		};
		KeyListener kl = new KeyListener() {
			@Override
			public void keyPressed(java.awt.event.KeyEvent e) {
				textArea.append("Key pressed: " + e.paramString() + "\n");
			};
			@Override
			public void keyReleased(java.awt.event.KeyEvent e) {
				textArea.append("Key released: " + e.paramString() + "\n");
			};
			@Override
			public void keyTyped(java.awt.event.KeyEvent e) {
				textArea.append("Key typed: " + e.paramString() + "\n");
			};
		};
		
		public MyTextArea(int col, int row) {
			super(col, row);
			addFocusListener(fl);
			addKeyListener(kl);
		}
	}
	
	public SwingEvents() {
		add(textArea);
	}

}
