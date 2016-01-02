package asec;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import asec.Model;

public class View {

	private JFrame frame;
	private JTextField input;
	private JTextField output;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Panel panel = new Panel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		Button capbtn = new Button("Capitalize");
		capbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cap = input.getText(); // kan också göra
												// cap.toUpperCase();
				Model.setSentence(cap);
				Controller.capitalize(cap);// är det cap även i controller?

				output.setText(cap);// wont work? wont capitalize?
			}
		});
		capbtn.setBounds(42, 106, 70, 22);
		panel.add(capbtn);

		Button decapbtn = new Button("Decapitalize");
		decapbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String decap = input.getText();
				Controller.decapitalize(decap);
				output.setText(decap);// wont work? wont capitalize?
			}
		});
		decapbtn.setBounds(42, 134, 70, 22);
		panel.add(decapbtn);

		input = new JTextField();
		input.setBounds(42, 43, 200, 50);
		panel.add(input);
		input.setColumns(10);

		JLabel lblEnterTextHere = new JLabel("Enter text here:");
		lblEnterTextHere.setBounds(42, 11, 200, 50);
		panel.add(lblEnterTextHere);

		output = new JTextField();
		output.setBounds(42, 176, 200, 50);
		panel.add(output);
		output.setColumns(10);

	}
}
