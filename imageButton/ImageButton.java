package imageButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ImageButton extends JFrame {

	private final JButton imgButton;
	private final Icon clickImage;

	public ImageButton() {
		super("Lab Button");

		Icon image1 = new ImageIcon(getClass().getResource("Image1.png"));
		Icon image2 = new ImageIcon(getClass().getResource("Image2.png"));
		this.clickImage = new ImageIcon(getClass().getResource("Image3.gif"));

		this.imgButton = new JButton(image1);
		imgButton.setRolloverIcon(image2);
		this.add(imgButton); // this is referring to jframe constructor

		ButtonClickEventHandler buttonEventHandler = new ButtonClickEventHandler();
		imgButton.addActionListener(buttonEventHandler);
	}

	private class ButtonClickEventHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			imgButton.setRolloverEnabled(false);
			imgButton.setIcon(clickImage);
		}
	}
}
