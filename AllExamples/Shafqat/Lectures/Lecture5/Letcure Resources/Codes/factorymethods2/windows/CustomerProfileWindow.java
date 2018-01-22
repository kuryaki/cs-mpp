package lesson5.lecture.factorymethods2.windows;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import lesson5.lecture.factorymethods2.RuleSet;
import lesson5.lecture.factorymethods2.rulesets.RuleException;
import lesson5.lecture.factorymethods2.rulesets.RuleSetFactory;

public class CustomerProfileWindow extends JFrame {
	public CustomerProfileWindow() {
		JButton button = new JButton("Update Profile Info");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				RuleSet custProfileRules = RuleSetFactory.getRuleSet(CustomerProfileWindow.this);
				try {
					custProfileRules.applyRules(CustomerProfileWindow.this);
					//if rules pass...
					//submit data
				} catch(RuleException e) {
					JOptionPane.showMessageDialog(CustomerProfileWindow.this,                                                    
	                        "Error: "+e.getMessage(),
	                        "Error", 
	                        JOptionPane.ERROR_MESSAGE);

				}
			}
			
		});
		JPanel mainPanel = new JPanel();
		mainPanel.add(button);
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		setSize(320, 240); 
	}
	
	
	private static final long serialVersionUID = -5043042115289288143L;

}
