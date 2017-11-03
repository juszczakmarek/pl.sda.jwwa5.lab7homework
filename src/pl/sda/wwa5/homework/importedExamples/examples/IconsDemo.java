package pl.sda.wwa5.homework.importedExamples.examples;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

public class IconsDemo extends JFrame {

	private JButton b;
	private Icon icon;
	
	public IconsDemo() {
		try {
			icon = new ImageIcon(new URL("http://icongal.com/gallery/image/38973/thumbs_up_thumbs_up_vote_like.png"));
		}
		catch(MalformedURLException e) {
			System.out.println("Could not read the specified URL!");
		}
		
		b = new JButton(icon);
		add(b);
	}
}
