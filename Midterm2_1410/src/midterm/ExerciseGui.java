package midterm;

/***************************
 * Author: Spencer Rosenvall
 * Class: CSIS 1410
 * Assignment: Midterm 2
 ***************************/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * Class Exercise GUI allows user to select between three colleges. Depending on
 * college button selected, corresponding college will be displayed in JLabel.
 * 
 * @author SpencerR
 *
 */

@SuppressWarnings("serial")
public class ExerciseGui extends JFrame {

	private JPanel contentPane;
	private JButton btnUofu;
	private JButton btnWestminster;
	private JButton btnWeberstate;
	private JLabel lblSchool;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExerciseGui frame = new ExerciseGui();
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
	public ExerciseGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panelButton = new JPanel();
		createButtonPanel(panelButton);
		contentPane.add(panelButton, BorderLayout.CENTER);

		createButtons(panelButton);

		lblSchool = new JLabel("school");
		createLblSchool();
		contentPane.add(lblSchool, BorderLayout.SOUTH);
	}

	/*
	 * creates all the buttons to be added to the panel.
	 */
	private void createButtons(JPanel panelButton) {
		btnWestminster = new JButton("");
		createBtnWestminster();
		panelButton.add(btnWestminster);

		btnUofu = new JButton("");
		createBtnUofU();
		panelButton.add(btnUofu);

		btnWeberstate = new JButton("");
		createBtnWeber();
		panelButton.add(btnWeberstate);
	}

	/**
	 * creates the label to display which school is selected.
	 */
	private void createLblSchool() {
		lblSchool.setBorder(new EmptyBorder(12, 0, 12, 0));
		lblSchool.setOpaque(true);
		lblSchool.setBackground(Color.LIGHT_GRAY);
		lblSchool.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblSchool.setHorizontalAlignment(SwingConstants.CENTER);
	}

	/**
	 * creates the Weber button.
	 */
	private void createBtnWeber() {
		btnWeberstate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSchool.setText("Weber State University");
				btnUofu.setBackground(Color.LIGHT_GRAY);
				btnWeberstate.setBackground(Color.WHITE);
				btnWestminster.setBackground(Color.LIGHT_GRAY);
			}
		});
		btnWeberstate.setBackground(Color.LIGHT_GRAY);
		btnWeberstate.setBorder(new EmptyBorder(0, 12, 0, 0));
		btnWeberstate.setIcon(new ImageIcon(ExerciseGui.class.getResource("/resources/Weber State University.png")));
	}

	/**
	 * creates the U of U button.
	 */
	private void createBtnUofU() {
		btnUofu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSchool.setText("University of Utah");
				btnUofu.setBackground(Color.WHITE);
				btnWeberstate.setBackground(Color.LIGHT_GRAY);
				btnWestminster.setBackground(Color.LIGHT_GRAY);
			}
		});
		btnUofu.setBackground(Color.LIGHT_GRAY);
		btnUofu.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnUofu.setIcon(new ImageIcon(ExerciseGui.class.getResource("/resources/University of Utah.png")));
	}

	/**
	 * creates the Westminster button.
	 */
	private void createBtnWestminster() {
		btnWestminster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSchool.setText("Westminster University");
				btnUofu.setBackground(Color.LIGHT_GRAY);
				btnWeberstate.setBackground(Color.LIGHT_GRAY);
				btnWestminster.setBackground(Color.WHITE);
			}
		});

		btnWestminster.setBackground(Color.LIGHT_GRAY);
		btnWestminster.setBorder(new EmptyBorder(0, 0, 0, 12));
		btnWestminster.setIcon(new ImageIcon(ExerciseGui.class.getResource("/resources/Westminster College.png")));
	}

	/**
	 * creates the button panel for the buttons.
	 * 
	 * @param panelButton
	 */
	private void createButtonPanel(JPanel panelButton) {
		panelButton.setBorder(new EmptyBorder(12, 0, 12, 0));
		panelButton.setLayout(new GridLayout(0, 3, 12, 12));
	}

}
