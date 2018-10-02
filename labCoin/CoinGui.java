package labCoin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class CoinGui extends JFrame {

	private JPanel contentPane;
	private JLabel lblCurrentcoin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinGui frame = new CoinGui();
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
	public CoinGui() {
		config();
		setContentPane(contentPane);

		JPanel panelButton = new JPanel();
		contentPane.add(panelButton, BorderLayout.NORTH);

		JButton btnPenny = createPenny();
		panelButton.add(btnPenny);

		JButton btnNickel = createNickel();
		panelButton.add(btnNickel);

		JButton btnDime = createDime();
		panelButton.add(btnDime);

		JButton btnQuarter = createQuarter();
		panelButton.add(btnQuarter);

		createCoinLabel();
		contentPane.add(lblCurrentcoin, BorderLayout.CENTER);
	}

	private void config() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
	}

	private void createCoinLabel() {
		lblCurrentcoin = new JLabel("Click a coin!");
		lblCurrentcoin.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCurrentcoin.setHorizontalAlignment(SwingConstants.CENTER);
	}

	private JButton createQuarter() {
		JButton btnQuarter = new JButton("");
		btnQuarter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCurrentcoin.setText(Coin.QUARTER.toString() + " w:" + Coin.QUARTER.getWeight() + " d:"
						+ Coin.QUARTER.getDiameter());
				lblCurrentcoin.repaint();
			}
		});
		btnQuarter.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/images/UsQuarter.png")));
		return btnQuarter;
	}

	private JButton createDime() {
		JButton btnDime = new JButton("");
		btnDime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCurrentcoin.setText(
						Coin.DIME.toString() + " w:" + Coin.DIME.getWeight() + " d:" + Coin.DIME.getDiameter());
				lblCurrentcoin.repaint();
			}
		});
		btnDime.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/images/UsNickel.png")));
		return btnDime;
	}

	private JButton createNickel() {
		JButton btnNickel = new JButton("");
		btnNickel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCurrentcoin.setText(
						Coin.NICKEL.toString() + " w:" + Coin.NICKEL.getWeight() + " d:" + Coin.NICKEL.getDiameter());
				lblCurrentcoin.repaint();
			}
		});
		btnNickel.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/images/UsDime.png")));
		return btnNickel;
	}

	private JButton createPenny() {
		JButton btnPenny = new JButton("");
		btnPenny.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCurrentcoin.setText(
						Coin.CENT.toString() + " w:" + Coin.CENT.getWeight() + " d:" + Coin.CENT.getDiameter());
				lblCurrentcoin.repaint();
			}
		});
		btnPenny.setIcon(new ImageIcon(CoinGui.class.getResource("/labCoin/images/UsCent.png")));
		return btnPenny;
	}

}
