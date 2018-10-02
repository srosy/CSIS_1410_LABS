/**
 * Lab IntroGui
 * Author: Spencer Rosenvall
 */

package labGui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LabIntroToGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JLabel lblMain;
	private JLabel lblTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabIntroToGui frame = new LabIntroToGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LabIntroToGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500); // start over 100, down 100
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblTitle = createLblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);

		JButton btnCount = createBtnCount();
		contentPane.add(btnCount, BorderLayout.WEST);

		lblMain = createLblMain();
		contentPane.add(lblMain, BorderLayout.CENTER);

		JPanel namePanel = createNamePanel();
		contentPane.add(namePanel, BorderLayout.SOUTH);

		JButton btnToggle = createBtnToggle();
		contentPane.add(btnToggle, BorderLayout.EAST);

	}

	private JButton createBtnToggle() {
		JButton btnToggle = new JButton("Toggle");
		btnToggle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// private Color background;
				// background =
				if (lblMain.getBackground() == Color.black) {
					lblMain.setBackground(Color.yellow);
					lblMain.setForeground(Color.black);
				} else {
					lblMain.setBackground(Color.black);
					lblMain.setForeground(Color.yellow);
				}
			}
		});
		btnToggle.setBackground(new Color(107, 142, 35));
		btnToggle.setForeground(new Color(245, 245, 245));
		btnToggle.setFont(new Font("Arial", Font.PLAIN, 25));
		return btnToggle;
	}

	private JPanel createNamePanel() {
		JPanel namePanel = new JPanel();
		namePanel.setBackground(new Color(25, 25, 112));
		namePanel.setBorder(new EmptyBorder(8, 0, 8, 0));

		JLabel lblname = new JLabel("Name");
		lblname.setForeground(new Color(245, 245, 245));
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		namePanel.add(lblname);

		txtName = new JTextField();
		txtName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTitle.setText(txtName.getText() + "'s GUI");
			}
		});
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		namePanel.add(txtName);
		txtName.setColumns(10);

		return namePanel;
	}

	private JLabel createLblMain() {
		JLabel lblMain = new JLabel("Main");
		lblMain.setHorizontalAlignment(SwingConstants.CENTER);
		lblMain.setOpaque(true);
		lblMain.setBackground(new Color(255, 215, 0));
		lblMain.setForeground(new Color(0, 0, 0));
		lblMain.setFont(new Font("Gigi", Font.BOLD, 65));
		return lblMain;
	}

	private JButton createBtnCount() {
		JButton btnCount = new JButton("+10");
		btnCount.addActionListener(new ActionListener() { // creates a class only used here, implements the interface
															// actionlistener. The give away is that there are curly
															// braces after the new ActionListener()

			private int sum; // field in my anonymous inner class

			public void actionPerformed(ActionEvent arg0) {
				sum += 10;
				lblMain.setText(String.valueOf(sum)); // show state of sum
			}
		});
		btnCount.setForeground(new Color(248, 248, 255));
		btnCount.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnCount.setBackground(new Color(178, 34, 34));
		return btnCount;
	}

	private JLabel createLblTitle() {
		lblTitle = new JLabel("Title");
		lblTitle.setIcon(new ImageIcon(LabIntroToGui.class.getResource("/labGui/Resources/pic.png")));
		lblTitle.setForeground(new Color(245, 245, 245));
		lblTitle.setOpaque(true);
		lblTitle.setBackground(new Color(25, 25, 112));
		lblTitle.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		return lblTitle;
	}

}
