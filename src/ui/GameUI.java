package ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import game.GuessingGame;

/**
 * User interface of Guessing game
 * 
 * @author Patinya Yongyai
 *
 */
public class GameUI {
	private GuessingGame game;
	private JFrame frame;
	private JTextField inputField;
	private JButton enterButton;
	private JButton quitButton;

	/**
	 * Initialize user interface
	 * 
	 * @param game
	 *            Calling Guessing game from main class
	 */
	public GameUI(GuessingGame game) {
		this.game = game;
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
	}

	/**
	 * Components of user interface
	 */
	public void initComponents() {
		Container container = new Container();
		JPanel panel = new JPanel();
		inputField = new JTextField(5);
		enterButton = new JButton("Enter");
		quitButton = new JButton("Give up");
		JLabel yourGuessLabel = new JLabel("Enter your guess: ");
		JLabel countGuess = new JLabel("You used 0 guesses");
		TitledBorder titleBorder = new TitledBorder("Hint");
		JLabel hint = new JLabel(game.getHint());
		hint.setBorder(titleBorder);
		panel.add(yourGuessLabel);
		panel.add(inputField);
		panel.add(enterButton);
		panel.add(quitButton);

		enterButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (game.guess(Integer.parseInt(inputField.getText())))
						enterButton.setEnabled(false);
					countGuess.setText("You used " + game.getCount() + " guesses");
					hint.setText(game.getHint());
				} catch (Exception e2) {
					throw new NumberFormatException("Please input your number.");
				}

			}
		});

		quitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		BorderLayout layout = new BorderLayout();
		container.setLayout(layout);
		container.add(hint, BorderLayout.NORTH);
		container.add(panel, BorderLayout.CENTER);
		container.add(countGuess, BorderLayout.SOUTH);
		frame.add(container);
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Show User interface
	 */
	public void run() {
		frame.setVisible(true);
	}

}
