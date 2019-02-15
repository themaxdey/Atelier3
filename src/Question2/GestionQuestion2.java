package Question2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionQuestion2 implements ActionListener{

	private String nom = " ";
	private String sport = " ";
	private String action = " ";
	
	private JButton bouton1;
	private JButton bouton2;
	private JButton bouton3;
	private JButton bouton4;
	private JButton bouton5;
	private JButton bouton6;
	private JButton bouton7;
	private JButton bouton8;
	private JButton bouton9;
	private JButton bouton10;
	private JButton bouton11;
	private JButton bouton12;
	private JButton bouton13;
	private JTextField message;
	private ButtonGroup groupNom;
	private ButtonGroup groupAction;
	private ButtonGroup groupSport;

	public GestionQuestion2( JButton button1, JButton button2, JButton button3, JButton button4, JButton button5,
			JButton button6, JButton button7, JButton button8, JButton button9, JButton button10, JButton button11,
			JButton button12, JButton button13, JTextField message, ButtonGroup groupNom, ButtonGroup groupAction, ButtonGroup groupSport ) {
			
		this.bouton1 = button1;
		this.bouton2 = button2;
		this.bouton3 = button3;
		this.bouton4 = button4;
		this.bouton5 = button5;
		this.bouton6 = button6;
		this.bouton7 = button7;
		this.bouton8 = button8;
		this.bouton9 = button9;
		this.bouton10 = button10;
		this.bouton11 = button11;
		this.bouton12 = button12;
		this.bouton13 = button13;
		this.message = message;
		this.groupAction = groupAction;
		this.groupNom = groupNom;
		this.groupSport = groupSport;
		

	}
	
	

	public GestionQuestion2() {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed( ActionEvent e ) {

		
			if ( e.getSource() == bouton1) {
				nom = bouton1.getText();
			} else if ( e.getSource() == bouton2 ) {
				nom = bouton2.getText();
			} else if ( e.getSource() == bouton3 ) {
				nom = bouton3.getText();
			} else if ( e.getSource() == bouton4 ) {
				nom = bouton4.getText();
			} else if ( e.getSource() == bouton5 ) {
				nom = bouton5.getText();
			}
		

		
			if ( e.getSource() == bouton6 ) {
				action = bouton6.getText();
			} else if ( e.getSource() == bouton7 ) {
				action = bouton7.getText();
			} else if ( e.getSource() == bouton8 ) {
				action = bouton8.getText();
			}
		

		
			if ( e.getSource() == bouton9 ) {
				sport = bouton9.getText();
			} else if ( e.getSource() == bouton10 ) {
				sport = bouton10.getText();
			} else if ( e.getSource() == bouton11 ) {
				sport = bouton11.getText();
			} else if ( e.getSource() == bouton12 ) {
				sport = bouton12.getText();
			}
		

		if ( e.getSource() == bouton13 ) {
			nom = " ";
			action = " ";
			sport = " ";
			message.setText( " " );
		}
		
		try {
			message.setText( nom + " " + action + " " + sport );
		} catch ( Exception e2 ) {
			// TODO: handle exception
		}
		

	}

}
