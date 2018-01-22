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

public class AddressWindow extends JFrame {
	public AddressWindow() {
		
		//build Address screen
		
		JButton button = new JButton("Submit Address Info");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				RuleSet addressRules = RuleSetFactory.getRuleSet(AddressWindow.this);
				try {
					addressRules.applyRules(AddressWindow.this);
					//if rules pass...
					//submit data
				} catch(RuleException e) {
					JOptionPane.showMessageDialog(AddressWindow.this,                                                    
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
	

	private static final long serialVersionUID = 898343560683602553L;

}
