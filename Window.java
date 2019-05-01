package budgetCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Window extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	JPanel panel = new JPanel();
	JTextField expense = new JTextField();
	JTextField price = new JTextField();
	JTextArea expenses = new JTextArea(); 
	JButton button =new JButton("Add");
	
	public Window () {
		setTitle("Whats your budget");
		
		
		
		
		setSize(410,490);
		setResizable(true);
		setLocationRelativeTo(null);
		
		setLayout(null);
	    
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		add(panel);
		
		add(expenses);
		expenses.setBounds(6, 5, 395, 395);
		expenses.setEditable(false);
		
		
		add(expense);
		expense.setBounds(3, 405, 350, 20);
		expense.addActionListener(this);
		
		add(price);
		price.setBounds(3, 435, 350, 20);
		price.addActionListener(this);
		
		add(button);
		button.setBounds(360, 405, 40, 20);
		button.addActionListener(this);
		
		
		
	    
		
		
		
	}
	
	public static void main(String[] args) {
		new Window().setVisible(true);

	}

	
	public void actionPerformed(ActionEvent e) {
		String text = (expense.getText());
		expenses.append(text + '\n');
		expense.setText("");
		
	}
	
	
	

}
