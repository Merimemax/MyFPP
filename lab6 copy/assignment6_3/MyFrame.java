package assignment6_3;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6300778243929339502L;

	JPanel leftPanel;

	JButton topButton;
	JButton middleButton;
	JButton bottomButton;

	JPanel rightPanel;

	JPanel input;
	JLabel topLabel;
	JTextField topText;

	JPanel output;
	JLabel bottomLabel;
	JTextField bottomText;

	MyFrame() {
		initializeWindow();
		JPanel mainPanel = new JPanel();
		JPanel northPanel = new JPanel();
		JPanel southPanel = new JPanel();
		JPanel masterPanel = new JPanel();

		defineLeftPanel();
		defineRightPanel();

		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		mainPanel.add(leftPanel);
		mainPanel.add(rightPanel);

		masterPanel.setLayout(new BorderLayout(0, 30));
		masterPanel.add(mainPanel, BorderLayout.CENTER);
		masterPanel.add(northPanel, BorderLayout.NORTH);
		masterPanel.add(southPanel, BorderLayout.SOUTH);

		getContentPane().add(masterPanel);
	}

	private void defineLeftPanel() {
		leftPanel = new JPanel();

		topButton = new JButton("Count letters");
		topButton.addActionListener(evt -> {
			String read = topText.getText().length() + "";
			bottomText.setText(read);
		});

		middleButton = new JButton("Revese Letters");
		middleButton.addActionListener(evt -> {
			String read = topText.getText();
			String result = "";
			for (int i = read.length() - 1; i >= 0; i--) {
				result += read.charAt(i);
			}
			bottomText.setText(result);
		});

		bottomButton = new JButton("Remove Dublicates");
		bottomButton.addActionListener(evt -> {
			String read = topText.getText();
			String result = "";
			for (int i = 0; i < read.length(); i++) {
				if (!result.contains(read.substring(i, i + 1))) {
					result += read.substring(i, i + 1);
				}
			}
			bottomText.setText(result);
		});

		leftPanel.setLayout(new BorderLayout());
		leftPanel.add(topButton, BorderLayout.NORTH);
		leftPanel.add(middleButton, BorderLayout.CENTER);
		leftPanel.add(bottomButton, BorderLayout.SOUTH);

	}

	private void defineRightPanel() {
		rightPanel = new JPanel();

		defineInputPanel();
		defineOutputPanel();

		rightPanel.setLayout(new BorderLayout());
		rightPanel.add(input, BorderLayout.NORTH);
		rightPanel.add(output, BorderLayout.SOUTH);

	}

	private void defineInputPanel() {
		input = new JPanel();
		topLabel = new JLabel("Input");
		topText = new JTextField(10);

		input.setLayout(new BorderLayout());
		input.add(topLabel, BorderLayout.NORTH);
		input.add(topText, BorderLayout.SOUTH);

	}

	private void defineOutputPanel() {
		output = new JPanel();
		bottomLabel = new JLabel("Output");
		bottomText = new JTextField(10);

		output.setLayout(new BorderLayout());
		output.add(bottomLabel, BorderLayout.NORTH);
		output.add(bottomText, BorderLayout.SOUTH);
	}

	private void initializeWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("String Utility");
		centerFrameOnDesktop(this);
		setSize(430, 210);
		setResizable(false);
	}

	private void centerFrameOnDesktop(Component f) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWidth = f.getSize().width;
		f.setLocation(((width - frameWidth) / 3), (height - frameHeight) / 4);
	}

}
