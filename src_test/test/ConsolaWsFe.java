package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.border.CompoundBorder;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ConsolaWsFe {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsolaWsFe window = new ConsolaWsFe();
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
	public ConsolaWsFe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 536, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JTextPane textPane = new JTextPane();
		splitPane.setRightComponent(textPane);
		
		JPanel panel = new JPanel();
		panel.setMinimumSize(new Dimension(10, 200));
		splitPane.setLeftComponent(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(63, 55, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(63, 86, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(63, 117, 86, 20);
		panel.add(textField_2);
		
		JButton btn_test = new JButton("New button");
		btn_test.setBounds(293, 114, 89, 23);
		panel.add(btn_test);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Testear Servicio", "Consultar Ultimo Comprobante", "Consultar Comprobante"}));
		comboBox.setBounds(63, 11, 203, 20);
		panel.add(comboBox);
	}
}
